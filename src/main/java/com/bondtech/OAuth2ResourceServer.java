package com.bondtech;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;


@SpringBootApplication
public class OAuth2ResourceServer {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(OAuth2ResourceServer.class, args);
    }
}
