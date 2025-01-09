package be.ucll.craftsmanship;

public class Rectangle implements Shape {
    private int shortLength;
    private int longLength;

    public Rectangle(int width, int height) {
        this.shortLength = Math.min(width, height);
        this.longLength = Math.max(width, height);
    }

    @Override
    public double area() {
        return shortLength * longLength;
    }
}
