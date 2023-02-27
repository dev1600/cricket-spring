package com.example.cricket.repository.entity;

public class PlayerMatchStatsEntity {
    int matchId;
    int playerId;
    int runsScored;
    int wicketsTaken;

    public PlayerMatchStatsEntity(int matchId, int playerId, int runsScored, int wicketsTaken) {
        this.matchId = matchId;
        this.playerId = playerId;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }
}
