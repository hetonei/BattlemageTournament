package bmt.game.heroes;

import java.util.ArrayList;

public class VampireVanila extends Hero{
    public VampireVanila(){
        this.Name = "Ванильный вампир";
        this.Description = "- Предела здоровья нет.\n" +
                "- Если у вампира меньше ХП, чем у противника, наносит двойной урон";
        this.Health = 10;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();
    }
}
