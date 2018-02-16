package bmt.game.spells.common.ultimates;

import bmt.game.Player;
import bmt.game.spells.Spell;

import static bmt.game.spells.EffectType.Heal;

public class Laniakreya extends Spell {
    public Laniakreya(){
        this.Name = "Laniakreya";
        this.Description = "Восстанавливает цели 10 единиц здоровья.";
        this.Ultimate = true;
    }
}
