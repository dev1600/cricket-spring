package com.example.cricket.service;

import com.example.cricket.service.game.Match;
import com.example.cricket.service.interfaces.StartNewGameService;
import com.example.cricket.service.player.Player;
import com.example.cricket.service.scoreboard.PrintScore;
import com.example.cricket.service.team.Team;
import com.example.cricket.service.toss.Toss;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StartNewGameServiceImpl implements StartNewGameService {
    @Override
    public void startNewGame(int matchId, HashMap<String, List<Player>> details){
        Match match=new Match(20, matchId,details);
        Toss toss=new Toss(match);
        match.createMatchResultDB();
        toss.doToss();
        match.getSettingTeam().setTarget(match.getFormat().getNoOfOvers()*6);
        Team teamWon=match.getChasingTeam().chaseTarget(match.getFormat().getNoOfOvers()*6,match.getSettingTeam().getTarget());
        PrintScore.printWinner(teamWon,match.getChasingTeam(),match.getSettingTeam());
        match.storeMatchResultDB();
    }
}
