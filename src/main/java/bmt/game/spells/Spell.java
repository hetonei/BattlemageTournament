package bmt.game.spells;

import bmt.game.Player;

import java.util.List;

public class Spell{
    public String getName() {
        return Name;
    }

    public String Name;
    public String Description;
    public boolean Ultimate;
    public boolean ReadyToUse = true;
    public List<Effect> Effects;
    public void SimulateEffect(Player t1){};
    public void SimulateEffects(Player t1, Player t2){};
}
