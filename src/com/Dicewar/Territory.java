package com.dicewar;

public class Territory extends Map{
    int id;
    int dices;
    int playerId;
    int neighborTerritoryId;

    Territory(int id, int dices, int playerId, int neighborTerritoryId)
    {
        this.id = id;
        this.dices = dices;
        this.playerId = playerId;
        this.neighborTerritoryId = neighborTerritoryId;
    }
}
