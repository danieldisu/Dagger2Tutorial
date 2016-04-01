package com.danieldisu.dagger2intro.di.modules;


import com.danieldisu.dagger2intro.RestClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RestModule {

    @Singleton
    @Provides
    RestClient providesRestClient(){
        return new RestClient();
    }

}
