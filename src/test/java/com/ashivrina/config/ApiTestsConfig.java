package com.ashivrina.config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:api.properties"
})
public interface ApiTestsConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    public String getBaseUrl();

    @Key("token")
    public String getToken();
}
