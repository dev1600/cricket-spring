package com.example.cricket.controller;

import com.example.cricket.repository.entity.PlayerMatchStatsEntity;
import com.example.cricket.service.PlayerMatchStatsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PlayerMatchStatsController {
    @Autowired
    private PlayerMatchStatsServiceImpl playerMatchStatsQueryTableService;
    @GetMapping("/getmatchplayerstat")
    public ResponseEntity<PlayerMatchStatsEntity> getPlayerMatchStatsByPlayerIdMatchId(@RequestBody String[] id){
        try{
            return new ResponseEntity<>(playerMatchStatsQueryTableService.getPlayerMatchStatsByPlayerIdMatchId(Integer.parseInt(id[0]),
                    Integer.parseInt(id[1])), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
}
