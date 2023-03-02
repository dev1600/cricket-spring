package com.example.cricket.service.interfaces;

import com.example.cricket.service.player.Player;

import java.util.HashMap;
import java.util.List;

public interface StartNewGameService {
    public void startNewGame(int matchId, HashMap<String, List<Player>> details);
}
