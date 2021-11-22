package controller;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Play {

    private GraphicsContext context;
    private Room room;
    private Player player;

    public Play(GraphicsContext context) {

        this.context = context;
        this.room = new Room(this.context, 32);
        this.player = new Player(this.context, 16);

        GameLoop();
    }

    private void GameLoop() {
    }
}
