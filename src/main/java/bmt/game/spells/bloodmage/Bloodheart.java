package bmt.game.spells.bloodmage;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;

import java.util.ArrayList;

public class Bloodheart extends Spell {
    public Bloodheart (){
        this.Name = "Bloodheart";
        this.Description = "Воспольняет здоровья в количестве урона нанесённого на прошлом ходу умноженного на 2";
        this.Ultimate = true;
        Effects = new ArrayList<>();
    }
    @Override
    public void SimulateEffect(Player t1){
        BloodheartHealTarget(t1);
        this.ReadyToUse = false;
    }

    private void BloodheartHealTarget(Player target){
        Effect effect = new Effect();
        effect.Priority = 3;
        effect.Type = EffectType.Heal;
        effect.StepLength = 1;
        effect.Target1 = target;
        //ACTION
        Effects.add(effect);
    }
}
