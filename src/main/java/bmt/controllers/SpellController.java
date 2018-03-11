package bmt.controllers;

import bmt.game.Player;
import bmt.game.spells.Effect;
import bmt.game.spells.Spell;

import java.awt.peer.ScrollbarPeer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SpellController {

    private static List<Effect> UsedEffects = new ArrayList<>();
    public static List<Spell> UsedSpells = new ArrayList<>();

    private static Logger log = Logger.getLogger(SpellController.class.getName());

    public static void GetSpellEffects(){
        for(Spell sp : UsedSpells){
            UsedEffects.addAll(sp.Effects);
        }
    }

    public static void CastSpell(Player p){
        UsedSpells.add(p.CastedSpell);
    }

    public static void UseAllSpells(){
        SortSpells();
        //GetContiniousEffects();
        GetSpellEffects();
        SortEffects();
        for(Effect ef : UsedEffects){
            UseEffect(ef);
        }
    }

    public static void GetContiniousEffects(Player player){
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

    public static void UseSpell(){
        for(Spell sp : UsedSpells){
            switch (sp.Type){
                default:

                    break;
            }
        }
    }
}
