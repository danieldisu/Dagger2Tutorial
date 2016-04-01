package com.danieldisu.dagger2intro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.danieldisu.dagger2intro.di.components.SystemComponent;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public SystemComponent getSystemComponent() {
        return ((Dagger2Application) getApplication()).getSystemComponent();
    }
}
