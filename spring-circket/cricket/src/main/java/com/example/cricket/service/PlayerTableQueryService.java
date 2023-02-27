package com.example.cricket.service;

import com.example.cricket.repository.Query.PlayerQuery;
import com.example.cricket.repository.dbconnection.Connection;
import com.example.cricket.repository.entity.PlayerEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;

@Service
public class PlayerTableQueryService {
    public ResultSet getPlayerDataByPlayerId(int playerId){
        return Connection.executeSelectQuery(String.format(PlayerQuery.getPlayerDataByPlayerIdQuery(),playerId));

    }
}
