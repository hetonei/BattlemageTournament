package bmt.game.spells.necromancer;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class Cadarkhas extends Spell {
    public Cadarkhas (){
        this.Name = "Cadarkhas";
        this.Description = "Наносит вам 2 урона.\n" +
        "Наносит противнику 2 урона каждый ход на протяжении\n" +
        "3-х ходов, начиная с этого";
        this.Ultimate = false;
        Effects = new ArrayList<Effect>();
    }
    @Override
    public void SimulateEffects(Player t1, Player t2){
        CadarkhasDamageSelf(t1);
        CadarkhasDamageOpponent(t2);
        this.ReadyToUse = false;
    }

    private void CadarkhasDamageSelf(Player target){
        Effect effect = new Effect();
        effect.Priority = 4;
        effect.Type = EffectType.Damage;
        effect.StepLength = 1;
        effect.Target1 = target;
        effect.Target1.HealthPoints = effect.Target1.HealthPoints - 2;
        Effects.add(effect);
    }

    private void CadarkhasDamageOpponent(Player target){
        Effect effect = new Effect();
        effect.Priority = 5;
        effect.Type = EffectType.Heal;
        effect.StepLength = 3;
        effect.Target2 = target;
        effect.Target2.HealthPoints = effect.Target2.HealthPoints - 2;
        Effects.add(effect);
    }
}
