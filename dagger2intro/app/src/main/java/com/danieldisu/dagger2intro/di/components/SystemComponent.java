package com.danieldisu.dagger2intro.di.components;

import com.danieldisu.dagger2intro.MainActivity;
import com.danieldisu.dagger2intro.di.modules.RestModule;
import com.danieldisu.dagger2intro.di.modules.SystemModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SystemModule.class, RestModule.class})
public interface SystemComponent {

    void inject(MainActivity activity);
}
