package com.example.cricket.service.team;

import com.example.cricket.repository.Query.PlayerMatchStatsQuery;
import com.example.cricket.repository.Query.PlayerQuery;
import com.example.cricket.repository.dbconnection.MySQLConnection;
import com.example.cricket.service.player.Player;

import java.util.Scanner;
public class Team {
    private Player[] teamPlayers;
    private String teamName;


    public Team(String teamName) {
        this.teamName = teamName;
        teamPlayers = new Player[11];
        inputTeamPlayer();
    }
    public void inputTeamPlayer(){
        Scanner dev = new Scanner(System.in);
        System.out.println("Enter PlayerId and Role of Players for Team " + teamName);
        for (int i = 0; i < 11; i++) {
            int playerId=dev.nextInt();
            String role = dev.next();
            teamPlayers[i] = new Player(playerId,role);
            MySQLConnection.executeUpdateQuery(String.format(PlayerQuery.getInsertPlayerQuery(),playerId,this.teamName,0,0,role));
        }
    }
    public String getName() {
        return teamName;
    }

    public String getCurrrentPlayerRole(int wicketsFallen) {
        return teamPlayers[wicketsFallen + 1].getRole();

    }
    public void storeCurrentPlayerRunsScored(int wicketsFallen,int runsScored,int matchId){
        System.out.println(MySQLConnection.executeUpdateQuery(String.format(PlayerMatchStatsQuery.getInsertPlayerMatchStatQuery(),matchId,teamPlayers[wicketsFallen+1].getPlayerId(),runsScored,0)));
        System.out.println(MySQLConnection.executeUpdateQuery(String.format(PlayerQuery.getUpdatePlayerRunsScoredQuery(),runsScored, teamPlayers[wicketsFallen+1].getPlayerId())));

    }


}
