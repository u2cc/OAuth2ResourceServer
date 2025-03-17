# OAuth2ResourceServer

This is a Spring Boot-based OAuth2 Resource Server which exposes a WebFlux endpoint requiring access token for 
authentication. 

Since it is a WebFlux Restful service, the security chain required is 
`org.springframework.security.web.server.SecurityWebFilterChain` and it is provided as a bean in class 
`com.bondtech.configurations.SecurityConfiguration`.

The property required to provide the jwks uri is `spring.security.oauth2.resourceserver.jwt.jwk-set-uri`. The uri points
to the authorization server's jwk set url which returns a set of public keys for resource server to use in order to
validate the access token.

An example of the curl command can be:

`curl --location "http://localhost:60000/strings" --header "Authorization: Bearer eyJraWQiOiJib25kdGVjaC5jb20iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJjbGllbnQtaWQiLCJhdWQiOiJjbGllbnQtaWQiLCJuYmYiOjE3NDIxNzYwOTEsImlzcyI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODI4MiIsImV4cCI6MTc0MjE3OTY5MSwiaWF0IjoxNzQyMTc2MDkxLCJqdGkiOiI4ZGYyNjY2Ny00MzZiLTQ1MDEtYTM5ZC1kZDY5NTU4MTYwZDgifQ.H62fjfDrtYU8FntkkBbUCCT8QE3myQny74GGkp9caAyBoeJdImBlUdi-5kLctq_tdsHVe2xaNQAClg9LXQ0JuaMLtDjC8LIcd5RDQMpL_Yw_KLFhmHAj1hwF0UIt1TSiO9duqVia3s8CXW5jidrwGUZww1LsmBKhLwtYWMZRsSxk9L0u3WlDW8_fCo-U2KDOXTzx1nPWfjnIBP2k3ycWNl54U-7QGXSgn0h_ySpOsDQCQg6gkx06yMqeaMidJdXrI--p7BbOzVkzcwoL52egRXD7_C6sQxccWatfQdR273GdjFdNIddaHW7d9lzbhTUifxLe0wrC40k9ahJIDWi2Kg"`

Please refer to the  [example authorization server](https://github.com/u2cc/OAuth2AuthorizationServer) for how to create a client_assertion and obtain an access token from
the authorization server.