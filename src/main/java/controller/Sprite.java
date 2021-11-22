package controller;

import java.awt.*;

public class Sprite {
    private Vector position;
    private Vector velocity;
    private Image image;
    private Hitbox hitbox;

    public Sprite(Vector position, Vector velocity, Image image, Hitbox hitbox) {
        this.position = position;
        this.velocity = velocity;
        this.image = image;
        this.hitbox = hitbox;
    }
}
