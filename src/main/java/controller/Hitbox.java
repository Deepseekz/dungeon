package controller;

public class Hitbox {
    private double x;
    private double y;
    private double hitboxWidth;
    private double hitboxHeight;

    public Hitbox(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.hitboxWidth = width;
        this.hitboxHeight = height;
    }

    public boolean isColliding(Hitbox other) {
        return (this.x < other.x + other.hitboxWidth &&
                this.x + this.hitboxWidth > other.x &&
                this.y < other.y + other.hitboxHeight &&
                this.y + this.hitboxHeight > other.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHitboxWidth() {
        return hitboxWidth;
    }

    public double getHitboxHeight() {
        return hitboxHeight;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double hitboxWidth) {
        this.hitboxWidth = hitboxWidth;
    }

    public void setHeight(double hitboxHeight) {
        this.hitboxHeight = hitboxHeight;
    }
}
