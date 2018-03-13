package bmt.game.heroes;

import java.util.ArrayList;

public abstract class BloodMage extends Hero{
    public BloodMage(){
        this.Name = "Маг Крови";
        this.Description = "- Когда здоровье Мага Крови понижается до 5-ти и ниже, вражеские заклинания наносят магу крови максимум 1 урон.\n" +
                "- Когда ХП 10 или выше - наносит дополнительно 1 урон атакующими заклинаниями.";
        this.Health = 20;
        Spells = new ArrayList<>();
        Ultimates = new ArrayList<>();
        /*this.Spells.add(new Beonic());
        this.Spells.add(new Argonyte());
        this.Ultimates.add(new Bloodheart());*/
    }
}
