package bmt.game.spells.necromancer;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.EffectType;

import java.util.ArrayList;

public class Sacronica extends Spell {
    public Sacronica(){
        this.Name = "Sacronica";
        this.Description = "Восполняет 2 единицы здоровья и 3 на следующем ходу.";
        this.Ultimate = false;
        Effects = new ArrayList<Effect>();
    }
    public void SimulateEffects(Player t1){
        SacronicaHealNormal(t1);
        SacronicaHealContinious(t1);
        this.ReadyToUse = false;
    }

    private void SacronicaHealNormal(Player target){
        Effect effect = new Effect();
        effect.Priority = 3;
        effect.Type = EffectType.Heal;
        effect.StepLength = 1;
        effect.Target1 = target;
        effect.Target1.HealthPoints = effect.Target1.HealthPoints + 2;
        Effects.add(effect);
    }

    private void SacronicaHealContinious(Player target){
        Effect effect = new Effect();
        effect.Priority = 3;
        effect.Type = EffectType.Heal;
        effect.StepLength = 2;
        effect.Target1 = target;
        if (effect.StepLength == 1)
            effect.Target1.HealthPoints = effect.Target1.HealthPoints + 3;
        Effects.add(effect);
    }
}
