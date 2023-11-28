package com.mingvel.securityfilterexample

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean

@TestConfiguration
class TestFilterConfig {

    @Bean
    fun apiKeyFilter(): ApiKeyFilter {
        return ApiKeyFilter()
    }
}
