package com.example.cricket.service;

import com.example.cricket.repository.Query.PlayerMatchStatsQuery;
import com.example.cricket.repository.dbconnection.MySQLConnection;
import com.example.cricket.repository.entity.PlayerMatchStatsEntity;
import com.example.cricket.service.interfaces.PlayerMatchStatsService;
import org.springframework.stereotype.Service;


import java.sql.ResultSet;

@Service
public class PlayerMatchStatsServiceImpl implements PlayerMatchStatsService {

    public PlayerMatchStatsEntity getPlayerMatchStatsByPlayerIdMatchId(int matchId, int playerId){
        try {
            ResultSet rs = MySQLConnection.executeSelectQuery(String.format(
                    PlayerMatchStatsQuery.getGetPlayerMatchStatByMatchIdPlayerIdQuery(), matchId, playerId));
            rs.next();
            return new PlayerMatchStatsEntity(rs.getInt(1),rs.getInt(2),
                    rs.getInt(3),rs.getInt(4));
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
