package com.danieldisu.dagger2intro;

import com.danieldisu.dagger2intro.di.scopes.UserScope;

import javax.inject.Inject;

@UserScope
public class UserPreferencesManager {

    private final User user;

    @Inject
    public UserPreferencesManager(User user) {
        this.user = user;
    }

    public String getHelloMessage() {
        return "Hello " + user.getUsername();
    }
}
