package com.mingvel.securityfilterexample.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.access.intercept.AuthorizationFilter


@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun filterChain(
        http: HttpSecurity,
        apiKeyFilter: ApiKeyFilter
    ): SecurityFilterChain {
        http.addFilterBefore(apiKeyFilter, AuthorizationFilter::class.java)

        return http.build()
    }
}
