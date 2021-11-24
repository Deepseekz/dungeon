package controller;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Entity {
    private Vector position;
    private Image image;
    private final Hitbox hitbox;

    public Entity() {
        this.position = new Vector(0, 0);
        this.hitbox = new Hitbox(0, 0, 0, 0);
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public void setPosition(int x, int y) {
        position.set(x, y);
        getHitbox();
    }

    public void setImage(String fileName) {
        image = new Image(fileName);
        setHitbox(image.getWidth(), image.getHeight());
    }

    private void setHitbox(double width, double height) {
        hitbox.setWidth(width);
        hitbox.setHeight(height);
    }

    public Hitbox getHitbox() {
        hitbox.setX(position.getX());
        hitbox.setY(position.getY());
        return this.hitbox;
    }

    public boolean isColliding(Entity other) {
        return hitbox.isColliding(other.hitbox);
    }

    public void render(GraphicsContext context){
        context.drawImage(image, position.getX(), position.getY());
    }

    public void move(int x, int y) {
        position.set(position.getX() + x, position.getY() + y);
        getHitbox();
    }
}
