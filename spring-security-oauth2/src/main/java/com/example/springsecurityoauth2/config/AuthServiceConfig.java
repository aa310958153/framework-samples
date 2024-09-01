package com.example.springsecurityoauth2.config;

import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
public class AuthServiceConfig extends AuthorizationServerConfigurerAdapter {
}
