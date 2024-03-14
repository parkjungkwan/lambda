package com.bitcamp.api.enums;

import com.bitcamp.api.strategy.UserStrategy;

public enum Home {
    USER(new UserStrategy());

    private final UserStrategy user;
    Home(UserStrategy user) {
        this.user = user;
    }
    public UserStrategy getUser(){
        return user;
    }
}
