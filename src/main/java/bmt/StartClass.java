package bmt;

import bmt.connection.telegram.TgBot;
import bmt.game.Player;
import bmt.game.heroes.BloodMage;
import bmt.game.heroes.Necromancer;
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
        Player pl1 = new Player(new Necromancer());
        Player pl2 = new Player(new Necromancer());

        //System.out.println(Arrays.toString(pl1.Spells.toArray()));
        pl2.CastSpell(pl2.Ultimates.get(0), pl2);



        System.out.println(pl1.HealthPoints);
        System.out.println(pl2.HealthPoints);
    }
}