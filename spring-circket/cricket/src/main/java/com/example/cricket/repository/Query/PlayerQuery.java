package com.example.cricket.repository.Query;

public class PlayerQuery {
    private static String insertPlayerQuery ="Insert ignore into Player Values (%d,'%s',%d,%d,'%s')";
    private static String UpdatePlayerRunsScoredQuery ="Update Player set runs_scored=runs_scored+%d where id=%d";
    private static String getPlayerDataByPlayerIdQuery="Select * from Player where id=%d";

    public static String getPlayerDataByPlayerIdQuery() {
        return getPlayerDataByPlayerIdQuery;
    }

    public static String getUpdatePlayerRunsScoredQuery() {
        return UpdatePlayerRunsScoredQuery;
    }
    public static String getInsertPlayerQuery(){
        return insertPlayerQuery;
    }

}
