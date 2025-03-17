package com.bondtech.configurations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
@Slf4j
public class SecurityConfiguration {
    @Bean
    public SecurityWebFilterChain securityWebFilterChainOAuth2ResourceServer(ServerHttpSecurity http) throws Exception {
//        http.securityMatcher(ServerWebExchangeMatchers.pathMatchers("/strings"))
               http.authorizeExchange(exchanges ->
                        exchanges.anyExchange().authenticated()).oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));

        return http.build();

//        return http
//                .authorizeExchange(exchanges -> exchanges
////                        .pathMatchers("/strings").permitAll() // Allow /strings without auth
//                        .anyExchange().authenticated())       // Require auth for everything else
//                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults())) // Use JWT for OAuth2
//                .build();
    }
}
