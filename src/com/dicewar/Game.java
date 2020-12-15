package com.dicewar;

import java.util.ArrayList;

public class Game {
    int turn; 
    ArrayList<Player> players;
    Map map;

    Game(int nbPlayers)
    {
        this.turn = 0;
        for(int i = 0; i < nbPlayers; i++)
        {
            this.players.push(new Player(i));
        }
        this.map = 
    }
}
