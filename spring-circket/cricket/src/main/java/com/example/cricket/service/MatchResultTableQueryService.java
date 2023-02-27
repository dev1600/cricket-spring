package com.example.cricket.service;

import com.example.cricket.repository.Query.MatchResultQuery;
import com.example.cricket.repository.dbconnection.Connection;
import org.springframework.stereotype.Service;
import java.sql.ResultSet;

@Service
public class MatchResultTableQueryService {
    public ResultSet getMatchResultTableByMatchId(int matchId){
        return Connection.executeSelectQuery(String.format(MatchResultQuery.getGetMatchResultByMatchIdQuery(),
                matchId));

    }

}
