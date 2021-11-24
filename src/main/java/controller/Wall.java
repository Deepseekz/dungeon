package controller;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wall extends Entity {
    Entity entity;

    public Wall(GraphicsContext context) {
        this.entity = new Entity();
        this.entity.setImage("file:src/main/ressources/images/entities/obstacles/wall.png");
        this.entity.setPosition(0, 0);
    }

    public void render(GraphicsContext context) {
        entity.render(context);
    }
}
