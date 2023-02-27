package com.example.cricket.service;

import com.example.cricket.repository.Query.PlayerMatchStatsQuery;
import com.example.cricket.repository.dbconnection.Connection;
import org.springframework.stereotype.Service;


import java.sql.ResultSet;

@Service
public class PlayerMatchStatsTableQueryService {

    public ResultSet getPlayerMatchStatsByPlayerIdMatchId(int matchId,int playerId){
        return Connection.executeSelectQuery(String.format(
                PlayerMatchStatsQuery.getGetPlayerMatchStatByMatchIdPlayerIdQuery(),matchId,playerId));
    }
}
