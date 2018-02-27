package bmt.game.heroes;

import java.util.ArrayList;

public class Demonic extends Hero {
    public Demonic(){
        this.Name = "Демон";
        this.Description = "- Автодиспелл первого проклятья в раунде.\n" +
                "- Хилится на 2 ХП в ход, в случае, если ему не наносят урон.";
        this.Health = 13;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();

    }
}
