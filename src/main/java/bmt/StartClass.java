package bmt;

import bmt.controllers.SpellController;
import bmt.game.Player;
import bmt.game.heroes.Necromancer;
import bmt.game.spells.Spell;

import java.io.IOException;

public class StartClass {
    public static void main(String[] args) throws IOException {
        Test1();
    }
    private static void Test1() throws IOException {
        Player p1 = new Player(new Necromancer());
        Player p2 = new Player(new Necromancer());
        p1.Name += "1";
        p2.Name += "2";
        p1.setEnemy(p2);
        p2.setEnemy(p1);
        ShowHP(p1, p2);

        Spell sp = p2.Spells.get(1);
        sp.EnemyCaster = true;
        SpellController.CastSpell(sp);
        SpellController.UseAllSpells();
        ShowHP(p1, p2);

        sp = p1.Ultimates.get(0);
        sp.EnemyCaster = false;
        SpellController.CastSpell(sp);
        sp = p2.Ultimates.get(1);
        sp.EnemyCaster = false;
        SpellController.CastSpell(sp);
        SpellController.UseAllSpells();
        ShowHP(p1, p2);
    }

    private static void ShowHP(Player p1, Player p2){
        System.out.println(p1.Name + " : " + p1.Health);
        System.out.println(p2.Name + " : " + p2.Health);
    }

}