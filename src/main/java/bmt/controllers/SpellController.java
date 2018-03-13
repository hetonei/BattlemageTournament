package bmt.controllers;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SpellController {

    private static List<Effect> UsedEffects = new ArrayList<>();
    private static List<Spell> UsedSpells = new ArrayList<>();

    private static Logger log = Logger.getLogger(SpellController.class.getName());

    private static void ClearContiniousEffects(Spell spell){
        spell.Caster.ContinuousEffects.stream()
                .filter(e -> e.LifeSpan == 0)
                .forEach(e -> e.Caster.ContinuousEffects.remove(e));
        spell.Enemy.ContinuousEffects.stream()
                .filter(e -> e.LifeSpan == 0)
                .forEach(e -> e.Caster.ContinuousEffects.remove(e));
    }

    public static void CastSpell(Spell spell){
        ClearContiniousEffects(spell);
        UsedEffects.clear();
        UsedSpells.clear();
        GetContiniousEffects(spell.Caster, spell.Enemy);
        UsedSpells.add(spell);
    }

    public static void UseAllSpells(){
        SortSpells();
        UsedSpells.forEach(sp -> {
            switch (sp.Type){
                case Survive:
                    UsedEffects.clear();
                    break;
                case Empty:
                    sp.PerformEffect();
                    UsedEffects.addAll(sp.Effects);
                    break;
            }
        });
        UseAllEffects();
    }

    private static void UseAllEffects(){
        SortEffects();
        UsedEffects.stream()
                .filter(e -> e.isUsable(e.UsableInitValue))
                .forEach(SpellController::UseEffect);

        UsedEffects.forEach(e -> e.LifeSpan-=1);
        UsedEffects.stream()
                .filter(e -> e.LifeSpan != 0)
                .forEach(e -> e.Caster.ContinuousEffects.add(e));
    }

    private static void SortSpells(){
        UsedSpells.sort(Spell.PriorityComparator);
    }

    private static void GetContiniousEffects(Player p1, Player p2){
        UsedEffects.addAll(p1.ContinuousEffects);
        UsedEffects.addAll(p2.ContinuousEffects);
    }

    private static void SortEffects(){
        UsedEffects.sort(Effect.PriorityComparator);
    }

    private static void UseEffect(Effect ef){
        log.info("Using effect with priority "+ ef.getPriority());
            switch (ef.Type){
                case Heal:
                    ef.Target.Health += ef.Value;
                    break;
                case Damage:
                    ef.Target.Health -= ef.Value;
                    break;
                default:

                    break;
            }
    }
}
