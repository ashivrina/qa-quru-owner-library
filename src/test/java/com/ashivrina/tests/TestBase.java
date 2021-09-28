package com.ashivrina.tests;

import com.ashivrina.drivers.WebDriverProvider;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    public static void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.browserCapabilities = capabilities;
        Configuration.startMaximized = true;

        WebDriverProvider provider = new WebDriverProvider();
        provider.prepareDriver();
    }
}
