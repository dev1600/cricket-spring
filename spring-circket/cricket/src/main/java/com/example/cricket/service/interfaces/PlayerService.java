package com.example.cricket.service.interfaces;

import com.example.cricket.repository.entity.PlayerEntity;

public interface PlayerService {
    public PlayerEntity getPlayerDataByPlayerId(int playerId);
}
