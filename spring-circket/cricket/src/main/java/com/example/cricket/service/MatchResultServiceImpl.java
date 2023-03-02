package com.example.cricket.service;

import com.example.cricket.repository.Query.MatchResultQuery;
import com.example.cricket.repository.dbconnection.MySQLConnection;
import com.example.cricket.repository.entity.MatchResultEntity;
import com.example.cricket.service.interfaces.MatchResultService;
import org.springframework.stereotype.Service;
import java.sql.ResultSet;

@Service
public class MatchResultServiceImpl implements MatchResultService {
    public MatchResultEntity getMatchResultTableByMatchId(int matchId){
        try {
            ResultSet rs = MySQLConnection.executeSelectQuery(String.format(MatchResultQuery.getGetMatchResultByMatchIdQuery(),
                    matchId));
            rs.next();
            return new MatchResultEntity(rs.getInt(1), rs.getInt(2),
                    rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),
                    rs.getInt(7), rs.getString(8));
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
