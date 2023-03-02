package com.example.cricket.service.game;



import com.example.cricket.repository.Query.MatchResultQuery;
import com.example.cricket.repository.dbconnection.MySQLConnection;
import com.example.cricket.service.format.Format;
import com.example.cricket.service.player.Player;
import com.example.cricket.service.rungenerator.Chase;
import com.example.cricket.service.rungenerator.Target;
import com.example.cricket.service.team.Team;

import java.util.HashMap;
import java.util.List;

public class Match {
    private int matchId;
    private Format format;
    private Team teamA;
    private Team teamB;

    private Target settingTeam;
    private Chase chasingTeam;
    private Team teamWon;

    public int getMatchId() {
        return matchId;
    }


    private void printDetails(List<Player> details){

        for(Player p:details){
            System.out.println(p);
        }
    }
    public Match(int overs, int matchId, HashMap<String, List<Player>> details) {
        printDetails(details.get("A"));
        teamA = new Team("A",details.get("A"));
        teamB = new Team("B",details.get("B"));
        format = new Format();
        this.matchId=matchId;
        format.setNoOfOvers(overs);
    }
    public Team getTeamA(){
        return teamA;
    }
    public Team getTeamB(){
        return teamB;
    }
    public Format getFormat() {
        return format;
    }

    public Target getSettingTeam() {
        return settingTeam;
    }

    public Chase getChasingTeam() {
        return chasingTeam;
    }
    public void setChasingTeam(Chase chasingTeam ){
        this.chasingTeam=chasingTeam;
    }
    public void setTargetTeam(Target settingTeam){
        this.settingTeam=settingTeam;
    }

    public void setTeamWon(Team teamWon) {
        this.teamWon = teamWon;
    }

    public void storeMatchResultDB(){
        MySQLConnection.executeUpdateQuery(String.format(MatchResultQuery.getInsertMatchResultQuery(),getSettingTeam().getTarget(),
                getChasingTeam().getChasingRun(),getSettingTeam().getWicketsLeft(),getChasingTeam().getWickets(),
                getSettingTeam().getBallsFaced(),getChasingTeam().getBallsFaced(),chasingTeam.getTeamWon().getName(),this.getMatchId()));
    }
    public void createMatchResultDB(){
        MySQLConnection.executeUpdateQuery(String.format(MatchResultQuery.getCreateMatchResultQuery(),this.getMatchId()));
    }

}
