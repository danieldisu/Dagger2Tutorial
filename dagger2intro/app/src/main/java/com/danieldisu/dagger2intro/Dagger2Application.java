package com.danieldisu.dagger2intro;

import android.app.Application;

import com.danieldisu.dagger2intro.di.components.DaggerSystemComponent;
import com.danieldisu.dagger2intro.di.components.SystemComponent;
import com.danieldisu.dagger2intro.di.modules.SystemModule;
import com.danieldisu.dagger2intro.di.modules.UserModule;
import com.danieldisu.dagger2intro.di.subcomponents.UserComponent;

public class Dagger2Application extends Application {

    private SystemComponent systemComponent;
    private UserComponent userComponent;

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

    public UserComponent createUserComponent(User user) {
        userComponent = systemComponent.plus(new UserModule(user));
        return userComponent;
    }

    public void releaseUserComponent() {
        userComponent = null;
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }
}
