package org.arunm.wiremockdemo.runner.thirdpartyapi;

import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RunnerService {

    private RunnerProperties runnerProperties;
    private RestTemplate restTemplate;

    public RunnerService(RunnerProperties runnerProperties, RestTemplateBuilder restTemplateBuilder) {
        this.runnerProperties = runnerProperties;
        this.restTemplate = restTemplateBuilder.build();
    }

    public Athlete getRunnerDetails(String id) {
        ResponseEntity<Athlete> runnerResponse =  restTemplate.
                getForEntity(runnerProperties.getApiEndPoint(), Athlete.class, Map.of("id", id));

        if (runnerResponse.getStatusCode().is2xxSuccessful()) {
            return runnerResponse.getBody();
        }
        throw  new IllegalStateException("Invalid runner id");
    }
}
