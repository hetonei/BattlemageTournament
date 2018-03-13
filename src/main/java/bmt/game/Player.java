package bmt.game;

import bmt.controllers.GameController;
import bmt.game.components.Turn;
import bmt.game.heroes.Hero;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;
import bmt.game.spells.common.spells.*;
import bmt.game.spells.common.ultimates.*;

import java.util.ArrayList;
import java.util.List;

public class Player extends Hero{

    public Player Enemy;
    public List<Effect> ContinuousEffects;

    public Player(Hero hero){
        this.Name = hero.Name;
        this.Description = hero.Description;
        this.Health = hero.Health;
        this.Spells = hero.Spells;
        //this.PassiveEffects = hero.Passives;
        this.Ultimates = hero.Ultimates;
        this.ContinuousEffects = new ArrayList<>();
        FillWithCommons();
    }

    public void setEnemy(Player enemy) {
        Enemy = enemy;
        AddTargets();
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
