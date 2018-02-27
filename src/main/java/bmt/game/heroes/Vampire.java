package bmt.game.heroes;

import java.util.ArrayList;

public class Vampire extends Hero{
    public Vampire(){
        this.Name = "Вампир";
        this.Description = "- Предела здоровья нет.\n" +
                "- Если у вампира меньше ХП, чем у противника, вампир неультимативными способностями наносит двойной урон.";
        this.Health = 10;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();

    }
}
