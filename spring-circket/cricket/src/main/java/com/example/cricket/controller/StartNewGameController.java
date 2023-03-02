package com.example.cricket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cricket.service.StartNewGameServiceImpl;

@RestController
public class StartNewGameController {
    @Autowired
    private StartNewGameServiceImpl startNewGameServiceImpl;
    @GetMapping("/startnewmatch")
    public void startNewMatch(@RequestBody String [] details){

        startNewGameServiceImpl.startNewGame(Integer.parseInt(details[0]),Integer.parseInt(details[1]));
    }

}
