package bmt.game.spells.common.ultimates;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Indario extends Spell {
    public Indario (){
        this.Name = "";
        this.Description = "";
        this.Ultimate = true;
        Effects = new ArrayList<>();
    }
}
