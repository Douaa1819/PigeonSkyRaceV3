package com.youcode.pigeonskyracev3.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.client.web.HttpSessionOAuth2AuthorizedClientRepository;



@Configuration
public class OAuth2ClientConfig {

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new InMemoryClientRegistrationRepository(clientRegistration());
    }

    @Bean
    public ClientRegistration clientRegistration() {
        return ClientRegistration.withRegistrationId("keycloak")
                .clientId("pigeonSkyClientId")
                .clientSecret("DFJVAIO6XFJz6C0oV225cY3KkH8VEdrI")
                .scope("openid")
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUri("https://localhost:8443/login/oauth2/code/keycloak")
                .authorizationUri("https://localhost:8443/realms/pigeonSkyV3/protocol/openid-connect/auth")
                .tokenUri("https://localhost:8443/realms/pigeonSkyV3/protocol/openid-connect/token")
                .userInfoUri("https://localhost:8443/realms/pigeonSkyV3/protocol/openid-connect/userinfo")
                .clientName("Keycloak")
                .build();
    }

    @Bean
    public OAuth2AuthorizedClientRepository authorizedClientRepository() {
        return new HttpSessionOAuth2AuthorizedClientRepository();
    }
}

