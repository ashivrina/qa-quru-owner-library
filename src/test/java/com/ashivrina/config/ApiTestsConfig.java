package com.ashivrina.config;
import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "classpath:api.properties",
        "system:properties",
        "file:/tmp/api.properties"
})
public interface ApiTestsConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    public String getBaseUrl();

    @Key("token")
    public String getToken();
}
