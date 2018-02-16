package bmt.game;

import bmt.dal.models.User;
import bmt.game.heroes.Hero;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.common.spells.*;
import bmt.game.spells.common.ultimates.*;

import java.util.List;

public class Player {
    public User user;
    public Hero PlayersHero;
    public int HealthPoints;



    //for passive effects
    public void setHealthPoints(int healthPoints) {
        HealthPoints = healthPoints;
    }
    public List<Effect> PassiveEffects;


    public List<Effect> ContinuousEffects;
    public List<Spell> Spells;
    public List<Spell> Ultimates;

    public Player(Hero hero){
        this.PlayersHero = hero;
        this.HealthPoints = hero.Health;
        this.Spells = hero.Spells;
        //this.PassiveEffects = hero.Passives;
        this.Ultimates = hero.Ultimates;
        //FillWithCommons();
    }

    public void CastSpell(Spell spell, Player target1){
        spell.SimulateEffect(target1);
        target1.HealthPoints = spell.Effects.get(0).Target1.HealthPoints;
    }
    public void CastSpell(Spell spell, Player target1, Player target2){
        spell.SimulateEffects(target1, target2);
    }

    private void FillWithCommons(){
        this.Spells.add(new Gallatrix());
        this.Spells.add(new Gratas());
        this.Spells.add(new Naireia());
        this.Spells.add(new Salkartres());
        this.Spells.add(new Sensenia());
        this.Spells.add(new Versaro());

        this.Ultimates.add(new Avendos());
        this.Ultimates.add(new Ertheanos());
        this.Ultimates.add(new Indario());
        this.Ultimates.add(new Laniakreya());
        this.Ultimates.add(new Omnicaidence());
        this.Ultimates.add(new Ontares());
    }
}
