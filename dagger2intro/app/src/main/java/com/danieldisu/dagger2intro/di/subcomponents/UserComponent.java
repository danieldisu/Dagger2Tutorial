package com.danieldisu.dagger2intro.di.subcomponents;

import com.danieldisu.dagger2intro.UserActivity;
import com.danieldisu.dagger2intro.di.modules.UserModule;
import com.danieldisu.dagger2intro.di.scopes.UserScope;

import dagger.Subcomponent;

@UserScope
@Subcomponent(
        modules = {
                UserModule.class
        }
)
public interface UserComponent {
    void inject(UserActivity userActivity);
}
