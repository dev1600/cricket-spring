package com.example.cricket.service.toss;

import com.example.cricket.service.game.Match;
import com.example.cricket.service.team.Team;
import com.example.cricket.service.rungenerator.Chase;
import com.example.cricket.service.rungenerator.Target;


public class Toss {
    double teamToss;
    double batFieldToss;
    Team teamA;
    Team teamB;
    Match match;


    public Toss(Match match){
        teamToss = Math.random();
        batFieldToss = Math.random();
        teamA=match.getTeamA();
        teamB=match.getTeamB();
        this.match=match;
    }
    public void doToss() {

        Target settingTeam;
        Chase chasingTeam;

        if (teamToss > 0.5) {
            System.out.print("Team A won the toss");
            if (batFieldToss > 0.5) {
                 settingTeam=new Target(teamA, match.getMatchId());
                 chasingTeam=new Chase(teamB,teamA, match.getMatchId());

                System.out.println(" and decided to bat first");
            } else {
                settingTeam=new Target(teamB,match.getMatchId());
                chasingTeam=new Chase(teamA,teamB, match.getMatchId());
                System.out.println(" and decided to field first");
            }
        } else {
            System.out.print("Team B won the toss");
            if (batFieldToss > 0.5) {

                settingTeam=new Target(teamB,match.getMatchId());
                chasingTeam=new Chase(teamA,teamB, match.getMatchId());
                System.out.println(" and decided to bat first");
            } else {

                settingTeam=new Target(teamA, match.getMatchId());
                chasingTeam=new Chase(teamB,teamA, match.getMatchId());
                System.out.println(" and decided to bowl first");
            }
        }
        match.setTargetTeam(settingTeam);
        match.setChasingTeam(chasingTeam);
    }
}
