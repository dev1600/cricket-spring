package com.example.cricket.controller;

import com.example.cricket.service.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cricket.service.StartNewGameServiceImpl;
import java.util.HashMap;
import java.util.List;

@RestController
public class StartNewGameController {
    @Autowired
    private StartNewGameServiceImpl startNewGameServiceImpl;
    @PostMapping("/startnewmatch")
    public void startNewMatch(@RequestBody HashMap<String, List<Player>> details){
        int matchId=(int)(Math.random()*10000);
        startNewGameServiceImpl.startNewGame(matchId,details);
        System.out.println("MatchID: "+matchId);
    }

}
