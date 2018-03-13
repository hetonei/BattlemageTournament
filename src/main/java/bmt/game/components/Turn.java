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
        //SpellController.UseAllSpells();
    }



    @Override
    public void Add(Component c){

    }
}
