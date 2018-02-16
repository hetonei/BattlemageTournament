package bmt.game.spells.bloodmage;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Beonic extends Spell {
    public Beonic(){
        this.Name = "Beonic";
        this.Description = "Наносит 3 урона цели и восстанавливает вам 2 здоровья.";
        this.Ultimate = false;
        Effects = new ArrayList<Effect>();
    }
    @Override
    public void SimulateEffects(Player t1, Player t2){
        BeonicHealSelf(t1);
        BeonicDamageTarget(t2);
        this.ReadyToUse = false;
    }

    private void BeonicHealSelf (Player t1){
        Effect effect = new Effect();
        effect.Priority = 4;
        effect.Type = EffectType.Heal;
        effect.StepLength = 1;
        effect.Target1 = t1;
        //ACTION
        Effects.add(effect);
    }
    private void BeonicDamageTarget(Player t2){
        Effect effect = new Effect();
        effect.Priority = 3;
        effect.Type = EffectType.Damage;
        effect.StepLength = 1;
        effect.Target2 = t2;
        //ACTION
        Effects.add(effect);
    }
}
