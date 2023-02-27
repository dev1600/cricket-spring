package com.example.cricket.controller;

import com.example.cricket.repository.entity.PlayerEntity;
import com.example.cricket.service.PlayerTableQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cricket.service.StartNewGameService;

import java.sql.ResultSet;
import java.sql.SQLOutput;

@RestController
public class StartNewGameController {
    @Autowired
    private StartNewGameService startNewGameService;
    @GetMapping("/startnewmatch")
    public void startNewMatch(@RequestBody String [] details){

        startNewGameService.startNewGame(Integer.parseInt(details[0]),Integer.parseInt(details[1]));
    }

}
