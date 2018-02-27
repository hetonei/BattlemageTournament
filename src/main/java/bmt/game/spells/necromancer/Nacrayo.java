package bmt.game.spells.necromancer;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.EffectType;

import java.util.ArrayList;

public class Nacrayo extends Spell {
    public Nacrayo (){
        this.Name = "Nacrayo";
        this.Description = "Наносит противнику 8 урона.";
        this.Ultimate = true;
        Effects = new ArrayList<>();
    }

    @Override
    public void PerformEffect(boolean EnemyCaster){
        NacrayoDamageTarget(EnemyCaster);
        this.ReadyToUse = false;
    }

    private void NacrayoDamageTarget(boolean EnemyCaster){
        Effect effect = new Effect();
        effect.Priority = 4;
        effect.Type = EffectType.Damage;
        effect.Target = EnemyCaster ? this.Enemy : this.Caster;
        effect.Value = 8;
        Effects.add(effect);
    }
}
