package bmt.game.components;

import bmt.game.Player;

import java.util.ArrayList;
import java.util.List;

public class Round extends Component{
    private List<Component> components = new ArrayList<>();
    public Player player1;
    public Player player2;
    public Round(Player p1, Player p2){
        player1 = p1;
        player2 = p2;
        Start();
    }
    @Override
    public void Start(){
        Add(new Turn(player1, player2));
    }
    @Override
    public void Add(Component c){
        components.add(c);
    }
}
