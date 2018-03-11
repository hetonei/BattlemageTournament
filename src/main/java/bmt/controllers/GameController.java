package bmt.controllers;

import bmt.game.Player;
import bmt.game.components.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController {

    public static List<Player> Players= new ArrayList<>();
    private static final Random random = new Random();

    private static Player SearchEnemy(Player p){
        while(true) {
            int randId = random.nextInt(Players.size() - 1);
            if (Players.get(randId)!=p)
            {
                return Players.get(randId);
            }
        }
    }

    public static Game StartGame(Player p1){
        Player p2 = SearchEnemy(p1);
        p1.setEnemy(p2);
        p2.setEnemy(p1);
        return new Game(p1, p2);
    }
}
