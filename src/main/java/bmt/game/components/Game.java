package bmt.game.components;

import bmt.game.Player;

import java.util.ArrayList;
import java.util.List;

public class Game extends Component {
    private static List<Component> components = new ArrayList<>();
    public Player player1;
    public Player player2;

    public Game(Player p1, Player p2){
        this.player1 = p1;
        this.player2 = p2;
        Start();
    }

    @Override
    public void Start(){
        System.out.println("GameStarted");
        Add(new Round(player1, player2));
    }

    @Override
    public void Add(Component c){
        components.add(c);
    }
}
