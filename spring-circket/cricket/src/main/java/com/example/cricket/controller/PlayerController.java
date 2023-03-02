package com.example.cricket.controller;

import com.example.cricket.repository.entity.PlayerEntity;
import com.example.cricket.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PlayerController {
    @Autowired
    private PlayerServiceImpl playerServiceImpl;

    @GetMapping("/getplayerdata")
    public ResponseEntity<PlayerEntity> getPlayerByPlayerId(@RequestBody String playerId) {
        try {
            return new ResponseEntity<>(playerServiceImpl.getPlayerDataByPlayerId(Integer.parseInt(playerId)),
                                        HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
