package com.ashivrina.config;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${launchType}.properties"
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
