package controller;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Room {
    private int roomWidth;
    private int roomHeight;
    private GraphicsContext context;
    private Hitbox[] wallHitboxes;

    public Room(GraphicsContext context, int roomSize) {
        this.context = context;
        this.roomWidth = roomSize;
        this.roomHeight = roomSize;

        DrawWalls();


    }



    private void DrawWalls() {
        context.setFill(Color.GRAY);
        for (int i = 0; i < roomWidth; i++) {
            for (int j = 0; j < roomHeight; j++) {
                if (i == 0 || i == roomWidth - 1 || j == 0 || j == roomHeight - 1) {
                    this.context.fillRect(i * 10, j * 10, 10, 10);
                }
            }
        }
    }
}
