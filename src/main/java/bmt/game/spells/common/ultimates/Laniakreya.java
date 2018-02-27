package bmt.game.spells.common.ultimates;

import bmt.game.Player;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Laniakreya extends Spell {
    public Laniakreya (){
        this.Name = "Laniakreya";
        this.Description = "Восстанавливает цели 10 единиц здоровья.";
        this.Ultimate = true;
        Effects = new ArrayList<>();
    }
}
