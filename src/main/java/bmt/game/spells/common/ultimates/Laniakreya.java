package bmt.game.spells.common.ultimates;

import bmt.game.Player;
import bmt.game.spells.EffectType;
import bmt.game.spells.Spell;
import com.sun.scenario.effect.Effect;

import java.util.ArrayList;

import static bmt.game.spells.EffectType.Heal;

public class Laniakreya extends Spell {
    public Laniakreya(){
        this.Name = "Laniakreya";
        this.Description = "Восстанавливает цели 10 единиц здоровья.";
        this.Ultimate = true;
        Effects = new ArrayList<>();
    }
    @Override
    public void SimulateEffect(Player t1){
        GallatrixDamageTarget(t1);
        this.ReadyToUse = false;
    }

    private void GallatrixDamageTarget(Player target){
        bmt.game.spells.Effect effect = new bmt.game.spells.Effect();
        effect.Priority = 4;
        effect.Type = EffectType.Damage;
        effect.Target1 = target;
        //ACTION
        Effects.add(effect);
    }
}
