package org.arunm.wiremockdemo;

import org.arunm.wiremockdemo.runner.thirdpartyapi.Athlete;
import org.arunm.wiremockdemo.runner.thirdpartyapi.RunnerService;
import org.springframework.cglib.proxy.Factory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FancyRunnerRestApi {

    private RunnerService runnerService;

    public FancyRunnerRestApi(RunnerService runnerService) {
        this.runnerService = runnerService;
    }

    @GetMapping("/runner/{id}")
    public FancyRunner getRunner(@PathVariable String id) {
        Athlete athlete = runnerService.getRunnerDetails(id);
        FancyRunner runner = new FancyRunner();
        runner.setRunnerId(athlete.getAthleteId());
        runner.setRunnerFancyName(athlete.getAthleteName());
        runner.setRunnerFancyBadge(athlete.getAthleteDistance() > 1000d ? "IMMORTAL":"MORTAL");
        return runner;
    }
}
