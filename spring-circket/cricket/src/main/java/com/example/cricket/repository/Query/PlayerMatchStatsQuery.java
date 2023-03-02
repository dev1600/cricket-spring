package com.example.cricket.repository.Query;

public class PlayerMatchStatsQuery {
    private static String insertPlayerMatchStatQuery="Insert ignore into PlayerMatchStats Values(%d,%d,%d,%d)";
    private static String getPlayerMatchStatByMatchIdPlayerIdQuery="Select * from PlayerMatchStats where match_id=%d and player_id=%d";
    public static String getInsertPlayerMatchStatQuery() {
        return insertPlayerMatchStatQuery;
    }
    public static String getGetPlayerMatchStatByMatchIdPlayerIdQuery() {
        return getPlayerMatchStatByMatchIdPlayerIdQuery;
    }


}
