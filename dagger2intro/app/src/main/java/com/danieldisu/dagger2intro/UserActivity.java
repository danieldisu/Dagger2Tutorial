package com.danieldisu.dagger2intro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.danieldisu.dagger2intro.di.subcomponents.UserComponent;

import javax.inject.Inject;

public class UserActivity extends BaseActivity implements View.OnClickListener {

    @Inject
    UserPreferencesManager userPreferencesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        User user = (User) getIntent().getSerializableExtra("User");
        UserComponent userComponent = getApp().createUserComponent(user);
        userComponent.inject(this);

        setContentView(R.layout.activity_user);
        View id = findViewById(R.id.textView);
        Button logoutButton = ((Button) findViewById(R.id.logoutButton));
        if (id != null) {
            TextView textView = (TextView) id;
            textView.setText(userPreferencesManager.getHelloMessage());
        }

        if (logoutButton != null) {
            logoutButton.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        getApp().releaseUserComponent();
        finish();
    }
}
