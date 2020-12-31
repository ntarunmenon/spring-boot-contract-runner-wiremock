package org.arunm.wiremockdemo.runner.thirdpartyapi;

public class Athlete {

    private String athleteId;
    private String athleteName;
    private Double athleteDistance;

    public String getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(String athleteId) {
        this.athleteId = athleteId;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public Double getAthleteDistance() {
        return athleteDistance;
    }

    public void setAthleteDistance(Double athleteDistance) {
        this.athleteDistance = athleteDistance;
    }
}
