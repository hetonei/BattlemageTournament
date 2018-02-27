package bmt.game.controllers;

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
    public static void GetSpellEffects(){
        for(Spell sp : UsedSpells){
            UsedEffects.addAll(sp.Effects);
        }
    }

    public static void UseAllSpells(Player p1, Player p2){
        UsedSpells.add(p1.CastedSpell);
        UsedSpells.add(p2.CastedSpell);
        SortSpells();
        GetSpellEffects();
        SortEffects();
        for(Effect ef : UsedEffects){
            UseEffect(ef);
        }


    }
    public void GetContiniousEffects(Player player){
        UsedEffects.addAll(player.ContinuousEffects);
    }

    public static void SortEffects(){
        UsedEffects.sort(Effect.PriorityComparator);
    }

    public static void SortSpells(){
        UsedSpells.sort(Spell.PriorityComparator);
    }

    public static void UseEffect(Effect ef){
        log.info("Using effect with priority "+ ef.getPriority());
            switch (ef.Type){
                case Heal:
                    ef.Target.HealthPoints += ef.Value;
                    break;
                case Damage:
                    ef.Target.HealthPoints -= ef.Value;
                    break;
                default:

                    break;
            }
    }
    public void UseSpell(){
        for(Spell sp : UsedSpells){
            switch (sp.Type){
                default:

                    break;
            }
        }
    }
}
