package bmt.game.spells.common.ultimates;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;
import bmt.game.spells.SpellType;

import java.util.ArrayList;

public class Avendos extends Spell {
    public Avendos (){
        this.Name = "Avendos";
        this.Description = "Отменяет весь ход";
        this.Priority = 0;
        this.Ultimate = true;
        this.Type = SpellType.Survive;
    }
}
