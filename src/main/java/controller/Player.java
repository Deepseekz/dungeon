package controller;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Player extends Entity {
    Entity entity;
    private int speed;


    public Player(GraphicsContext context) {
        this.entity = new Entity();
        this.speed = 3;
        this.entity.setPosition(10,10);
        this.entity.setImage("file:src/main/ressources/images/entities/player/missingtexture.png");
    }

    public void render(GraphicsContext context) {
        entity.render(context);
    }

    public void goNorth() {
        entity.move(0, -this.speed);
        updateDirection("file:src/main/ressources/images/entities/player/player_up.png");
    }

    private void updateDirection(String path) {
        entity.setImage(path);
    }

    public void goSouth() {
        entity.move(0, this.speed);
        updateDirection("file:src/main/ressources/images/entities/player/player_down.png");
    }

    public void goEast() {
        entity.move(this.speed, 0);
        updateDirection("file:src/main/ressources/images/entities/player/player_east.png");
    }

    public void goWest() {
        entity.move(-this.speed, 0);
        updateDirection("file:src/main/ressources/images/entities/player/player_west.png");
    }

    public void update(ArrayList<String> inputs, Entity entity) {

        updateDirection("file:src/main/ressources/images/entities/player/missingtexture.png");

        if (!this.isColliding(entity)) {
            System.out.println(this.isColliding(entity));
            for (String input : inputs) {
                switch (input) {
                    case "UP":
                        goNorth();
                        break;
                    case "DOWN":
                        goSouth();
                        break;
                    case "RIGHT":
                        goEast();
                        break;
                    case "LEFT":
                        goWest();
                        break;
                }

                if (input.equals("SHIFT")) {
                    run();
                }
                else {
                    this.speed = 3;
                }
            }
        }
        else {
            System.out.println("Collision");
        }


    }

    private void run() {
        this.speed = 5;
    }
}
