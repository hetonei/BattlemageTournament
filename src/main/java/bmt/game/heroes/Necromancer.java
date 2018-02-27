package bmt.game.heroes;

import bmt.game.spells.necromancer.Cadarkhas;
import bmt.game.spells.necromancer.Nacrayo;
import bmt.game.spells.necromancer.Sacronica;

import java.util.ArrayList;

public class Necromancer extends Hero {
    public Necromancer(){
        this.Name = "Некромант";
        this.Description = "- Когда здоровье некроманта понижается до 5-ти и ниже - некромант наносит дополнительно 2 урона атакующими заклинанями.\n" +
                "- Когда здоровье понижается до 1-го противник получает 4 урона в ход.";
        this.Health = 15;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();
        this.Spells.add(new Cadarkhas());
        this.Spells.add(new Sacronica());
        this.Ultimates.add(new Nacrayo());
    }
}
