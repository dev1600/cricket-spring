package com.example.cricket.service.interfaces;

import com.example.cricket.repository.entity.MatchResultEntity;

public interface MatchResultService {
    public MatchResultEntity getMatchResultTableByMatchId(int matchId);
}
