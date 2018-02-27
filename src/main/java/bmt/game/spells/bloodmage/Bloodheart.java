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
}
