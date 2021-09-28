package com.ashivrina.tests.apitests;

import com.ashivrina.config.ApiTestsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTests {

    @Test
    void simpleApiTest() {
        System.setProperty("token", "asdfgh");

        ApiTestsConfig config = ConfigFactory.create(ApiTestsConfig.class, System.getProperties());

        assertThat(config.getBaseUrl())
                .isEqualTo("https://github.com");
        assertThat(config.getToken())
                .isEqualTo("asdfgh");
    }
}
