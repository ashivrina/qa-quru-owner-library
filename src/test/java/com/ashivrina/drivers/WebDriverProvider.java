package com.ashivrina.drivers;

import com.ashivrina.config.WebTestsConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

import static java.lang.String.format;

public class WebDriverProvider {

    private WebTestsConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebTestsConfig.class, System.getProperties());
    }

    public void prepareDriver() {
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();

        String launchType = System.getProperty("launchType", "local");
        if("remote".equals(launchType)) {
            String login = config.getLogin();
            String password = config.getPassword();
            String remoteDriverUrl = "selenoid.autotests.cloud/wd/hub/";
            Configuration.remote = format("https://%s:%s@%s", login, password, remoteDriverUrl);
        }
    }
}
