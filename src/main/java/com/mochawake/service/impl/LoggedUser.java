package com.mochawake.service.impl;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Component
@SessionScope
public class LoggedUser {
    private Long userId;
    private String username;
    private Long profileId;
    private boolean isLogged;



    public boolean isLogged() {
        return isLogged;
    }

    public void login(Long userId, String username, Long profileId) {
        this.userId = userId;
        this.username = username;
        this.profileId = profileId;
        this.isLogged = true;
    }

    public void logout() {
        this.userId = null;
        this.username = null;
        this.profileId = null;
        this.isLogged = false;
    }
}