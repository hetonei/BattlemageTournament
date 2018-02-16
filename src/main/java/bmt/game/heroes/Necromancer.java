package bmt.game.heroes;

import bmt.game.spells.Spell;
import bmt.game.spells.necromancer.Cadarkhas;
import bmt.game.spells.necromancer.Nacrayo;
import bmt.game.spells.necromancer.Sacronica;

import java.util.ArrayList;
import java.util.List;

public class Necromancer extends Hero {
    public Necromancer(){
        this.Name = "Некромант";
        this.Description = "";
        this.Health = 15;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();
        this.Spells.add(new Sacronica());
        this.Spells.add(new Cadarkhas());
        this.Ultimates.add(new Nacrayo());
    }
}
