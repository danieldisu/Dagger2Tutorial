package com.danieldisu.dagger2intro.di.modules;

import com.danieldisu.dagger2intro.User;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    private final User user;

    public UserModule(User user) {
        this.user = user;
    }

    @Provides
    User provideUser() {
        return this.user;
    }
}
