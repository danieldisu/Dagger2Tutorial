package com.danieldisu.dagger2intro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.danieldisu.dagger2intro.di.components.SystemComponent;

public class BaseActivity extends AppCompatActivity {


    public SystemComponent systemComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Dagger2Application dagger2Application = Dagger2Application.get();
        systemComponent = dagger2Application.getSystemComponent();
//        systemComponent.inject(this);
    }
}
