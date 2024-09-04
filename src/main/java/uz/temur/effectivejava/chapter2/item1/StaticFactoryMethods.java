package uz.temur.effectivejava.chapter2.item1;

public class StaticFactoryMethods {

    public static void main(String[] args) {
        Shape circle = StaticFactoryMethods.createShape("circle");
        circle.draw();  // Output: Drawing a circle

        Shape square = StaticFactoryMethods.createShape("square");
        square.draw();  // Output: Drawing a square
    }

    // Static factory method
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        throw new IllegalArgumentException("Unknown shape type");
    }
}
