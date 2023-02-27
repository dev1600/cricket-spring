package com.example.cricket.repository.entity;

public class PlayerEntity {
    int playerId;
    String team;
    int runsScored;
    int wicketsTaken;
    String role;
//    public PlayerEntity getPlayerEntity(){
//        return this;
//    }
    public PlayerEntity(int playerId, String team, int runsScored, int wicketsTaken, String role) {
        this.playerId = playerId;
        this.team = team;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.role = role;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getTeam() {
        return team;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "PlayerEntity{" +
                "playerId=" + playerId +
                ", team='" + team + '\'' +
                ", runsScored=" + runsScored +
                ", wicketsTaken=" + wicketsTaken +
                ", role='" + role + '\'' +
                '}';
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
