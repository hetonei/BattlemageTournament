package bmt.game.spells.necromancer;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.EffectType;

import java.util.ArrayList;

public class Sacronica extends Spell {
    public Sacronica (){
        this.Name = "Sacronica";
        this.Description = "Восполняет 2 единицы здоровья цели и 3 на следующем ходу.";
        this.Ultimate = false;
        Effects = new ArrayList<>();
    }

    @Override
    public void PerformEffect(boolean EnemyCaster){
        this.ReadyToUse = false;
    }

    private void SacronicaHealNow(){

    }
    private void SacronicaHealNextStep(){

    }
}
