package bmt;

import bmt.controllers.GameController;
import bmt.controllers.SpellController;
import bmt.game.Player;
import bmt.game.components.Game;
import bmt.game.heroes.Necromancer;

public class StartClass {
    public static void main(String[] args) {

    }
    private static void Test1(){
        //User1 выбирает героя
        Player p1 = new Player(new Necromancer());

        //User2 выбирает героя
        Player p2 = new Player(new Necromancer());

        ///надо подождать, пока будет больше 1 игрока

        //надо решить проблему, если сразу оба нажали
        //например, сделать очередь для вызова стартгейма, если игра началась
        //то удалить из списка игроков противника
        Game game = GameController.StartGame(p1);

        p1.CastSpell(p1.Ultimates.get(0), true);
        p2.CastSpell(p2.Ultimates.get(0), false);


    }

    private static void Test2(){

    }

}