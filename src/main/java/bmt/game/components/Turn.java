package bmt.game.components;

import bmt.controllers.SpellController;
import bmt.game.Player;

public class Turn extends Component{
    public Player player1;
    public Player player2;

    public Turn(Player p1, Player p2){
        player1 = p1;
        player2 = p2;
    }

    @Override
    public void Start(){
        /*while () {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        //действие
        notify();*/
        SpellController.UseAllSpells();

    }

    public synchronized void WaitForCastSpell(Player p) throws InterruptedException{
        while(SpellController.UsedSpells.size()<2){
            wait();
        }
        SpellController.CastSpell(p);
        System.out.println(p.PlayersHero.Name + " casted " + p.CastedSpell);
    }

    @Override
    public void Add(Component c){

    }
}
