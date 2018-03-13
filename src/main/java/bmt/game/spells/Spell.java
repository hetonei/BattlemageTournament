package bmt.game.spells;

import bmt.game.Player;

import java.util.Comparator;
import java.util.List;

public abstract class Spell{

    public String Name;
    public String Description;
    public int Priority;
    public boolean Ultimate;
    public SpellType Type;
    public boolean ReadyToUse = true;
    public List<Effect> Effects;
    public Player Caster;
    public Player Enemy;
    public boolean EnemyCaster;

    public void PerformEffect(){};

    public int getPriority() {
        return Priority;
    }
    public static Comparator<Spell> PriorityComparator = Comparator.comparingInt(Spell::getPriority);
}
