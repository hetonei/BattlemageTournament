package bmt.game.spells.necromancer;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Cadarkhas extends Spell {
    public Cadarkhas (){
        this.Name = "Cadarkhas";
        this.Description = "Наносит вам 2 урона.\n" +
        "Наносит противнику 2 урона каждый ход на протяжении\n" +
        "3-х ходов, начиная с этого.";
        this.Ultimate = false;
        Effects = new ArrayList<>();
    }
    @Override
    public void PerformEffect(boolean EnemyCaster){
        CadarkhasDamageSelf();
        CadarkhasDamageEnemy();
        this.ReadyToUse = false;
    }

    private void CadarkhasDamageSelf(){
        Effect effect = new Effect();
        effect.Priority = 4;
        effect.Type = EffectType.Damage;
        effect.Target = this.Caster;
        effect.Value = 2;
        Effects.add(effect);
    }
//continious
    private void CadarkhasDamageEnemy(){
        Effect effect = new Effect();
        effect.Priority = 5;
        effect.Type = EffectType.Damage;
        effect.Target = this.Enemy;
        effect.Value = 3;
        Effects.add(effect);
    }
}
