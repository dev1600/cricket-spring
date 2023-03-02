package com.example.cricket.repository.Query;

public class MatchResultQuery {
    private static String createMatchResultQuery="Insert ignore into MatchResult(id) Values(%d)";
    private static String insertMatchResultQuery="Update MatchResult " +
            "Set target_runs=%d, chase_runs=%d, wickets_target=%d, wickets_chasing=%d, balls_faced_chasing=%d, " +
            "balls_faced_target=%d, result='%s' where id=%d";
    private static String getMatchResultByMatchIdQuery="Select * from MatchResult where id=%d";
    public static String getCreateMatchResultQuery() {
        return createMatchResultQuery;
    }



    public static String getGetMatchResultByMatchIdQuery() {
        return getMatchResultByMatchIdQuery;
    }

    public static String getInsertMatchResultQuery() {
        return insertMatchResultQuery;
    }



}
