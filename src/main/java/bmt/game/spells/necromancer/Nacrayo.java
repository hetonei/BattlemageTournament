package bmt.game.spells.necromancer;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.EffectType;

import java.util.ArrayList;

public class Nacrayo extends Spell {
    public Nacrayo(){
        this.Name = "Nacrayo";
        this.Description = "Наносит противнику 8 урона.";
        this.Ultimate = true;
        Effects = new ArrayList<Effect>();
    }
    @Override
    public void SimulateEffect(Player t1){
        NacrayoDamageTarget(t1);
    }

    private void NacrayoDamageTarget(Player target){
        Effect effect = new Effect();
        effect.Priority = 4;
        effect.Type = EffectType.Damage;
        effect.StepLength = 1;
        effect.Target1 = target;
        effect.Target1.HealthPoints = effect.Target1.HealthPoints - 8;
        Effects.add(effect);
    }
}
