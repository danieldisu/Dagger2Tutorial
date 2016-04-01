package com.danieldisu.dagger2intro;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.danieldisu.dagger2intro.di.subcomponents.UserComponent;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Inject
    ConnectivityManager connectivityManager;

    @Inject
    Logger logger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSystemComponent().inject(this);
        boolean activeNetworkMetered = connectivityManager.isActiveNetworkMetered();
        logger.log("Network is metered? " + activeNetworkMetered);
        Button loginButton = (Button) findViewById(R.id.loginButton);
        if (loginButton != null) {
            loginButton.setOnClickListener(this);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        UserComponent userComponent = getApp().getUserComponent();
        logger.log("userComponent is null? " + String.valueOf(userComponent == null));
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, UserActivity.class);
        intent.putExtra("User", new User("danieldisu"));
        startActivity(intent);
    }

}
