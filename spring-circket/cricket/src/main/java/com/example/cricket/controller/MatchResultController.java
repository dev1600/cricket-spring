package com.example.cricket.controller;

import com.example.cricket.repository.entity.MatchResultEntity;
import com.example.cricket.service.MatchResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MatchResultController {
    @Autowired
    MatchResultServiceImpl matchResultServiceImpl;
    @GetMapping("/getmatchresult")
    public ResponseEntity<MatchResultEntity> getMatchResultByMatchId(@RequestBody String matchId){
        try{
            return new ResponseEntity<>(matchResultServiceImpl.getMatchResultTableByMatchId(
                    Integer.parseInt(matchId)),HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
