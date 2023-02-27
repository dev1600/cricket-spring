package com.example.cricket.service;

import com.example.cricket.repository.dbconnection.Connection;
import com.example.cricket.service.game.Match;
import com.example.cricket.service.scoreboard.PrintScore;
import com.example.cricket.service.team.Team;
import com.example.cricket.service.toss.Toss;
import org.springframework.stereotype.Service;

@Service
public class StartNewGameService {
    public void startNewGame(int matchId,int overs){
        Match match=new Match(overs, matchId);
        Toss toss=new Toss(match);
        match.createMatchResultDB();
        toss.doToss();
        match.getSettingTeam().setTarget(match.getFormat().getNoOfOvers()*6);
        Team teamWon=match.getChasingTeam().chaseTarget(match.getFormat().getNoOfOvers()*6,match.getSettingTeam().getTarget());
        PrintScore.printWinner(teamWon,match.getChasingTeam(),match.getSettingTeam());
        match.storeMatchResultDB();
    }
}
