package bmt.game.heroes;

import bmt.game.spells.Effect;
import bmt.game.spells.Spell;

import java.util.List;

public class Hero {
    public String Name;
    public String Description;
    public int Health;
    public List<Effect> Passives;
    public List<Spell> Spells;
    public List<Spell> Ultimates;
}
