package com.example.cricket.service.interfaces;

import com.example.cricket.repository.entity.PlayerMatchStatsEntity;

public interface PlayerMatchStatsService {
    public PlayerMatchStatsEntity getPlayerMatchStatsByPlayerIdMatchId(int matchId, int playerId);
}
