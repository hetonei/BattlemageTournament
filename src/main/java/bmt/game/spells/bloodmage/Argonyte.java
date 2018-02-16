package bmt.game.spells.bloodmage;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Argonyte extends Spell {
    public Argonyte(){
        this.Name = "Argonyte";
        this.Description = "Весь полученный урон наносит урон врагу.";
        this.Ultimate = false;
        Effects = new ArrayList<Effect>();
    }
    @Override
    public void SimulateEffects(Player t1, Player t2){

    }

    private void ArgonyteDamageReflection(Player target1, Player target2){
        Effect effect = new Effect();
        effect.Priority = 5;
        effect.Type = EffectType.Damage;
        effect.StepLength = 1;
        //ACTION
        Effects.add(effect);
    }
}
