package org.arunm.wiremockdemo.runner.thirdpartyapi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="runner.thirdparty")
public class RunnerProperties {

    private String apiEndPoint;

    public String getApiEndPoint() {
        return apiEndPoint;
    }

    public void setApiEndPoint(String apiEndPoint) {
        this.apiEndPoint = apiEndPoint;
    }
}
