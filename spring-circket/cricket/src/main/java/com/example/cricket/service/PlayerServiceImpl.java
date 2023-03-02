package com.example.cricket.service;

import com.example.cricket.repository.Query.PlayerQuery;
import com.example.cricket.repository.dbconnection.MySQLConnection;
import com.example.cricket.repository.entity.PlayerEntity;
import com.example.cricket.service.interfaces.PlayerService;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;

@Service
public class PlayerServiceImpl implements PlayerService {
    public PlayerEntity getPlayerDataByPlayerId(int playerId) {
        try {
            ResultSet rs = MySQLConnection.executeSelectQuery(String.format(PlayerQuery.getPlayerDataByPlayerIdQuery(), playerId));
            rs.next();
            return new PlayerEntity(rs.getInt(1), rs.getString(2), rs.getInt(3),
                    rs.getInt(4),rs.getString(5));
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
