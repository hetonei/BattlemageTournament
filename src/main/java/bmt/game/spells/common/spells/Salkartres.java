package bmt.game.spells.common.spells;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Salkartres extends Spell {
    public Salkartres(){
        this.Name = "";
        this.Description = "";
        this.Ultimate = false;
        Effects = new ArrayList<>();
    }
    @Override
    public void SimulateEffect(Player t1){
        GallatrixDamageTarget(t1);
        this.ReadyToUse = false;
    }

    private void GallatrixDamageTarget(Player target){
        Effect effect = new Effect();
        effect.Priority = 4;
        effect.Type = EffectType.Damage;
        effect.Target1 = target;
        //ACTION
        Effects.add(effect);
    }
}
