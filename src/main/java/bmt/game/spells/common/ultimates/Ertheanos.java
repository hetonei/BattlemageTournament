package bmt.game.spells.common.ultimates;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.EffectType;

import java.util.ArrayList;

public class Ertheanos extends Spell{
    public Ertheanos (){
        this.Name = "Ertheanos";
        this.Description = "Наносит 5 единиц урона противнику и 4 единицы урона себе.";
        this.Ultimate = true;
        Effects = new ArrayList<>();
    }
}
