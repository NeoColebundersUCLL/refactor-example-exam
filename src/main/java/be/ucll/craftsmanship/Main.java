package be.ucll.craftsmanship;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Square square = new Square(8);
        Circle circle = new Circle(8);

        System.out.println("Rectangle: " + rectangle.area());
        System.out.println("Square: " + square.area());
        System.out.println("Circle: " + circle.area());
    }
}
