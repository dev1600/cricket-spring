package com.example.cricket.controller;

import com.example.cricket.repository.entity.PlayerEntity;
import com.example.cricket.service.PlayerTableQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.ResultSet;


@Controller
public class PlayerTableQueryController {
    @Autowired
    private PlayerTableQueryService playerTableQueryService;
    @GetMapping("/getplayerdata")
    public ResponseEntity<PlayerEntity> getPlayerByPlayerId(@RequestBody String playerId){
        try {
            ResultSet rs=playerTableQueryService.getPlayerDataByPlayerId(Integer.parseInt(playerId));
            rs.next();
            return new ResponseEntity<>(new PlayerEntity(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                    rs.getString(5)), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }

}
