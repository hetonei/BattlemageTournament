package bmt.game.heroes;

import java.util.ArrayList;

public class EnergyMage extends Hero {
    public EnergyMage() {
        this.Name = "Энергомаг";
        this.Description = "- Каждый неклассовый спелл добавляет +1 к ультимативной способности.\n" +
                "- Урон со спеллов Энергомага проходит раньше, чем восстановление здоровья у противника.";
        this.Health = 18;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();
        /*this.Spells.add(new Beonic());
        this.Spells.add(new Argonyte());
        this.Ultimates.add(new Bloodheart());*/
    }
}