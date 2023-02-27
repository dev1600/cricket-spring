package com.example.cricket.controller;

import com.example.cricket.repository.entity.PlayerMatchStatsEntity;
import com.example.cricket.service.PlayerMatchStatsTableQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.ResultSet;

@Controller
public class PlayerMatchStatsTableQueryController {
    @Autowired
    private PlayerMatchStatsTableQueryService playerMatchStatsQueryTableService;
    @GetMapping("getmatchplayerstat")
    public ResponseEntity<PlayerMatchStatsEntity> getPlayerMatchStatsByPlayerIdMatchId(@RequestBody String[] id){
        try{
//            System.out.println("Going to execute query");
            ResultSet rs= playerMatchStatsQueryTableService.getPlayerMatchStatsByPlayerIdMatchId(Integer.parseInt(id[0]),
                                                                                            Integer.parseInt(id[1]));
//            System.out.println("Executed query");
            rs.next();
            return new ResponseEntity<>(new PlayerMatchStatsEntity(rs.getInt(1),rs.getInt(2),
                    rs.getInt(3),rs.getInt(4)), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
}
