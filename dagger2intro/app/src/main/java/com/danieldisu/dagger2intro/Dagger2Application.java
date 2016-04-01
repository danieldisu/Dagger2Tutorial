package com.danieldisu.dagger2intro;

import android.app.Application;

import com.danieldisu.dagger2intro.di.components.DaggerSystemComponent;
import com.danieldisu.dagger2intro.di.components.SystemComponent;
import com.danieldisu.dagger2intro.di.modules.SystemModule;

public class Dagger2Application extends Application {

    private SystemComponent systemComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.systemComponent = DaggerSystemComponent.builder()
                .systemModule(new SystemModule(this))
                .build();
    }

    public SystemComponent getSystemComponent() {
        return this.systemComponent;
    }
}
