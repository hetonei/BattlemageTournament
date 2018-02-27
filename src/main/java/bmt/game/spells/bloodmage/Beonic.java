package bmt.game.spells.bloodmage;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Beonic extends Spell {
    public Beonic (){
        this.Name = "Beonic";
        this.Description = "Наносит 3 урона цели и восстанавливает вам 2 здоровья.";
        this.Ultimate = false;
        Effects = new ArrayList<>();
    }
}
