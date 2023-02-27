package com.example.cricket.service.rungenerator;

import com.example.cricket.service.team.Team;
import com.example.cricket.service.scoreboard.PrintScore;

public class Target {
    private int target;
    private Team teamName;
    private int wicketsLeft;
    private int ballsFaced;
    private int matchId;
    public Target(Team teamName,int matchId){
        this.teamName=teamName;
        this.target=0;
        this.matchId=matchId;
    }
    public int getWicketsLeft() {
        return wicketsLeft;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public Team getSettingTeamObject(){
        return teamName;
    }
    public int getTarget(){
        return target;
    }
    public void setTarget(int total_balls) {
        int wickets_left = 10;
        int curr = 0;
        int currentPlayerRuns=0;

        while (curr < total_balls && wickets_left > 0) {
            int g = Generator.generateRuns(teamName.getCurrrentPlayerRole(10-wickets_left));

            if (g == 7) {
                System.out.println("That's a WICKET!!!");
                teamName.storeCurrentPlayerRunsScored(10-wickets_left,currentPlayerRuns,matchId);
                wickets_left--;
                currentPlayerRuns=0;
            } else {
                target += g;
                currentPlayerRuns+=g;
            }

            curr++;
            PrintScore.printScore(target, wickets_left, curr, teamName);
        }
        wicketsLeft=wickets_left;
        ballsFaced=curr;
    }

}
