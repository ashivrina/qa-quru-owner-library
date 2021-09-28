package com.ashivrina.config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${launchType}.properties",
})
public interface WebTestsConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    public String getBrowser();

    @Key("browserVersion")
    public String getBrowserVersion();

    @Key("login")
    public String getLogin();

    @Key("password")
    public String getPassword();
}
