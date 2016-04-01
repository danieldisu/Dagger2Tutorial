package com.danieldisu.dagger2intro.di.components;

import com.danieldisu.dagger2intro.MainActivity;
import com.danieldisu.dagger2intro.di.modules.RestModule;
import com.danieldisu.dagger2intro.di.modules.SystemModule;
import com.danieldisu.dagger2intro.di.modules.UserModule;
import com.danieldisu.dagger2intro.di.subcomponents.UserComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SystemModule.class, RestModule.class})
public interface SystemComponent {

    UserComponent plus(UserModule userModule);

    void inject(MainActivity activity);
}
