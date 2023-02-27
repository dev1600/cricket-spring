package com.example.cricket.repository.entity;

public class MatchResultEntity {
    private int matchid;
    private int targetRuns;
    private int chaseRuns;
    private int wicketsTarget;
    private int wicketsChasing;
    private int ballsFacedChasing;
    private int ballsFacedTarget;
    private String result;

    public MatchResultEntity(int matchid, int targetRuns, int chaseRuns, int wicketsTarget, int wicketsChasing, int ballsFacedChasing, int ballsFacedTarget, String result) {
        this.matchid = matchid;
        this.targetRuns = targetRuns;
        this.chaseRuns = chaseRuns;
        this.wicketsTarget = wicketsTarget;
        this.wicketsChasing = wicketsChasing;
        this.ballsFacedChasing = ballsFacedChasing;
        this.ballsFacedTarget = ballsFacedTarget;
        this.result = result;
    }

    public int getMatchid() {
        return matchid;
    }

    public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    public int getTargetRuns() {
        return targetRuns;
    }

    public void setTargetRuns(int targetRuns) {
        this.targetRuns = targetRuns;
    }

    public int getChaseRuns() {
        return chaseRuns;
    }

    public void setChaseRuns(int chaseRuns) {
        this.chaseRuns = chaseRuns;
    }

    public int getWicketsTarget() {
        return wicketsTarget;
    }

    public void setWicketsTarget(int wicketsTarget) {
        this.wicketsTarget = wicketsTarget;
    }

    public int getWicketsChasing() {
        return wicketsChasing;
    }

    public void setWicketsChasing(int wicketsChasing) {
        this.wicketsChasing = wicketsChasing;
    }

    public int getBallsFacedChasing() {
        return ballsFacedChasing;
    }

    public void setBallsFacedChasing(int ballsFacedChasing) {
        this.ballsFacedChasing = ballsFacedChasing;
    }

    public int getBallsFacedTarget() {
        return ballsFacedTarget;
    }

    public void setBallsFacedTarget(int ballsFacedTarget) {
        this.ballsFacedTarget = ballsFacedTarget;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
