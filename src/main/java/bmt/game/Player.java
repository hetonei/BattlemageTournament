package bmt.game;

import bmt.dal.models.User;
import bmt.game.heroes.Hero;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.common.spells.*;
import bmt.game.spells.common.ultimates.*;
import bmt.game.spells.necromancer.Cadarkhas;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public User user;
    public Hero PlayersHero;
    public int HealthPoints;

    public void setEnemy(Player enemy) {
        Enemy = enemy;
        AddTargets();
    }

    public Player Enemy;

    public List<Spell> Spells;
    public List<Spell> Ultimates;

    //for passive effects
    public void setHealthPoints(int healthPoints) {
        HealthPoints = healthPoints;
    }
    public List<Effect> PassiveEffects;
    public List<Effect> ContinuousEffects;

    public Spell CastedSpell;


    public Player(Hero hero){
        this.PlayersHero = hero;
        this.HealthPoints = hero.Health;
        this.Spells = new ArrayList<>();
        this.Spells = hero.Spells;
        //this.PassiveEffects = hero.Passives;
        this.Ultimates = hero.Ultimates;
        FillWithCommons();
    }
    private void AddTargets(){
        for(Spell sp : Spells){
            sp.Caster = this;
            sp.Enemy = this.Enemy;
        }
        for(Spell sp : Ultimates){
            sp.Caster = this;
            sp.Enemy = this.Enemy;
        }
    }
    public void CastSpell(Spell spell, boolean EnemyCaster){
        spell.PerformEffect(EnemyCaster);
        this.CastedSpell = spell;
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
