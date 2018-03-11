package bmt.game.components;

import bmt.game.Player;

public abstract class Component {
    public Player player1;
    public Player player2;

    public abstract void Add(Component c);
    public abstract void Start();
}
