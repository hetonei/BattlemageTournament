package bmt;

import bmt.connection.telegram.TgBot;
import bmt.dal.models.User;
import bmt.game.Player;
import bmt.game.controllers.SpellController;
import bmt.game.heroes.BloodMage;
import bmt.game.heroes.Necromancer;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartClass {
    public static void main(String[] args) {
        /*ApiContextInitializer.init();

        TelegramBotsApi botsApi = new TelegramBotsApi();

        try {
            botsApi.registerBot(new TgBot());
            System.out.println("Telegram Bot started successfully!");
        } catch (TelegramApiException e) {

            e.printStackTrace();*/

        /*Player pl1 = new Player(new Necromancer());
        Player pl2 = new Player(new Necromancer());

        //System.out.println(Arrays.toString(pl1.Spells.toArray()));
        pl2.CastSpell(pl2.Ultimates.get(0), pl2);



        System.out.println(pl1.HealthPoints);
        System.out.println(pl2.HealthPoints);*/

        /*Effect e1 = new Effect();
        e1.Priority = 12;
        Effect e2 = new Effect();
        e2.Priority = 1;
        Effect e3 = new Effect();
        e3.Priority = 13;
        ArrayList<Effect> eff = new ArrayList<Effect>(){{
           add(e1);add(e2);add(e3);
        }};
        for(Effect e:eff){
            System.out.println(e.Priority);
        }
        eff.sort(Effect.PriorityComparator);
        for(Effect e:eff){
            System.out.println(e.Priority);
        }*/
        Player pl1 = new Player(new Necromancer());
        Player pl2 = new Player(new Necromancer());
        pl1.setEnemy(pl2);
        pl2.setEnemy(pl1);
        for (Spell s: pl1.Spells){
            System.out.println(s.Name);
        }
        for (Spell s: pl2.Spells){
            System.out.println(s.Name);
        }
        pl1.CastSpell(pl1.Ultimates.get(0), true);
        pl2.CastSpell(pl2.Ultimates.get(0), false);
        System.out.println(pl1.HealthPoints);
        System.out.println(pl2.HealthPoints);
        SpellController.UseAllSpells(pl1, pl2);
        System.out.println(pl1.HealthPoints);
        System.out.println(pl2.HealthPoints);
        /*A a = new A();
        A.B b = new A.B();
        System.out.println(a.vA);
        System.out.println(b.vB);
        b.doS();
        System.out.println(a.vA);
        System.out.println(b.vB);*/

    }
}