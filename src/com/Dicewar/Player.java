package com.dicewar;

public class Player extends Game{
    int id;

    Player(int id)
    {
        this.id = id;
    }

    public int attackTerritory(Territory currentTerritory, Territory targetTerritory)
    {
        if(this.id == targetTerritory.playerId || this.id != currentTerritory.playerId)
        {
            return 0;
        }
        else if(currentTerritory.nbDice == 1)
        {
            return 1;
        }
        else
        {
            int targetDices = targetTerritory.dices;
            int currentDices = currentTerritory.dices;
            int targetDicesSum = throwDices(targetDices);
            int currentDicesSum = throwDices(currentDices);
            if(targetDicesSum <= currentDicesSum)
            {
                targetTerritory.playerId = currentTerritory.playerId;
            }
            currentTerritory.dices = 1;
        }
    }

    private int throwDices(int nb)
    {
        int sum = 0;
        for(int i = 0; i < nb; i++)
        {
            sum += 1 + (int)(Math.random() * 6);
        }
        return sum;
    }
}
