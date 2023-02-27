package com.example.cricket.repository.Query;

public class PlayerMatchStatsQuery {
    private static String insertPlayerMatchStatQuery="Insert ignore into PlayerMatchStats Values(%d,%d,%d,%d)";
    private static String getPlayerMatchStatByMatchIdPlayerIdQuery="Select * from PlayerMatchStats where MatchId=%d and PlayerId=%d";
    public static String getInsertPlayerMatchStatQuery() {
        return insertPlayerMatchStatQuery;
    }
    public static String getGetPlayerMatchStatByMatchIdPlayerIdQuery() {
        return getPlayerMatchStatByMatchIdPlayerIdQuery;
    }


}
