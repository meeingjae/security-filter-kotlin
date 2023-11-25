package com.mingvel.securityfilterexample.config

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class NotUsingFilterConfig {

    @Bean
    fun apiKeyFilterRegistration(apiKeyFilter: ApiKeyFilter): FilterRegistrationBean<ApiKeyFilter> {
        val registrationBean = FilterRegistrationBean(apiKeyFilter)
        registrationBean.isEnabled = false
        return registrationBean
    }
}
