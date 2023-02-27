package com.example.cricket.repository.Query;

public class MatchResultQuery {
    private static String createMatchResultQuery="Insert ignore into MatchResult(MatchId) Values(%d)";
    private static String insertMatchResultQuery="Update MatchResult " +
            "Set TargerRuns=%d, ChaseRuns=%d, WicketsTarget=%d, WicketsChasing=%d, BallsFacedChasing=%d, " +
            "BallsFacedTarget=%d, Result='%s' where MatchId=%d";

    public static String getCreateMatchResultQuery() {
        return createMatchResultQuery;
    }

    private static String getMatchResultByMatchIdQuery="Select * from MatchResult where MatchId=%d";

    public static String getGetMatchResultByMatchIdQuery() {
        return getMatchResultByMatchIdQuery;
    }

    public static String getInsertMatchResultQuery() {
        return insertMatchResultQuery;
    }



}
