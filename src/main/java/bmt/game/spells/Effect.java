package bmt.game.spells;

import bmt.game.Player;

import java.util.Comparator;

public class Effect {
    public int Priority;
    public EffectType Type;
    public Player Target;
    public int Value;
    public int getPriority() {
        return Priority;
    }
    public static Comparator<Effect> PriorityComparator = new Comparator<Effect>() {
        @Override
        public int compare(Effect o1, Effect o2) {
            return o1.getPriority() - o2.getPriority();
        }
    };
}
