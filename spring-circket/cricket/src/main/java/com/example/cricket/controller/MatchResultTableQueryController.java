package com.example.cricket.controller;

import com.example.cricket.repository.entity.MatchResultEntity;
import com.example.cricket.service.MatchResultTableQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.ResultSet;

@Controller
public class MatchResultTableQueryController {
    @Autowired
    MatchResultTableQueryService matchResultTableQueryService;
    @GetMapping("/getmatchresult")
    public ResponseEntity<MatchResultEntity> getMatchResultByMatchId(@RequestBody String matchId){
        try{
            ResultSet rs= matchResultTableQueryService.getMatchResultTableByMatchId(Integer.parseInt(matchId));
            rs.next();
            return new ResponseEntity<>(new MatchResultEntity(rs.getInt(1),rs.getInt(2),
                    rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),
                    rs.getInt(7),rs.getString(8)),HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
