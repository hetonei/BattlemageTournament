package bmt.game.spells;

import bmt.game.Player;

import java.util.Comparator;
import java.util.List;

public class Spell{

    public String Name;
    public String Description;
    public int Priority;
    public boolean Ultimate;
    public SpellType Type;
    public boolean ReadyToUse = true;
    public List<Effect> Effects;
    public Player Caster;
    public Player Enemy;

    public void PerformEffect(boolean EnemyCaster){};

    public int getPriority() {
        return Priority;
    }
    public static Comparator<Spell> PriorityComparator = new Comparator<Spell>() {
        @Override
        public int compare(Spell o1, Spell o2) {
            return o1.getPriority() - o2.getPriority();
        }
    };
}
