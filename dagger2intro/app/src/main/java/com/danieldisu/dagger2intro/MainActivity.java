package com.danieldisu.dagger2intro;

import android.net.ConnectivityManager;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

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
    }

}
