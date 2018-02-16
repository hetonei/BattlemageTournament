package bmt.game.heroes;

import bmt.game.spells.Spell;
import bmt.game.spells.bloodmage.Argonyte;
import bmt.game.spells.bloodmage.Beonic;
import bmt.game.spells.bloodmage.Bloodheart;

import java.util.ArrayList;

public class BloodMage extends Hero{
    public BloodMage(){
        this.Name = "Маг Крови";
        this.Description = "";
        this.Health = 20;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();
        this.Spells.add(new Beonic());
        this.Spells.add(new Argonyte());
        this.Ultimates.add(new Bloodheart());
    }
}
