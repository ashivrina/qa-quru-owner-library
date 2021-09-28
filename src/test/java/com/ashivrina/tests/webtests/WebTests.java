package com.ashivrina.tests.webtests;

import com.ashivrina.config.WebTestsConfig;
import com.ashivrina.tests.TestBase;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTests extends TestBase {

    @Test
    void simpleWebTestLocal() {
        System.setProperty("launchType", "local");

        WebTestsConfig config = ConfigFactory.create(WebTestsConfig.class, System.getProperties());

        assertThat(config.getBrowser())
                .isEqualTo("FIREFOX");
        assertThat(config.getBrowserVersion())
                .isEqualTo("92.0.1");
    }

    @Test
    void simpleWebTestRemote() {
        System.setProperty("launchType", "remote");

        WebTestsConfig config = ConfigFactory.create(WebTestsConfig.class, System.getProperties());

        assertThat(config.getBrowser())
                .isEqualTo("CHROME");
        assertThat(config.getBrowserVersion())
                .isEqualTo("91.0");
    }
}
