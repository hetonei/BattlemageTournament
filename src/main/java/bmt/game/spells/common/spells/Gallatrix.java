package bmt.game.spells.common.spells;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Gallatrix extends Spell {
    public Gallatrix (){
        this.Name = "Gallatrix";
        this.Description = "Наносит 3 единицы урона цели.";
        this.Ultimate = false;
        Effects = new ArrayList<>();
    }
}
