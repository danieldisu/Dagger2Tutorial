package com.danieldisu.dagger2intro.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;

import com.danieldisu.dagger2intro.UserPreferencesManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SystemModule {

    private final Application application;

    public SystemModule(Application application) {
        this.application = application;
    }

    @Provides
    Context provideContext(){
        return application;
    }

    @Singleton
    @Provides
    SharedPreferences providePreferenceManager() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Singleton
    @Provides
    ConnectivityManager provideConnectivityManager(UserPreferencesManager userPreferencesManager) {
        return (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
    }



}
