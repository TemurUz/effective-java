package uz.temur.effectivejava.chapter2.item1;

public class StaticFactoryMethods {

    public static void main(String[] args) {
        Shape circle = StaticFactoryMethods.createShape("circle");
        circle.draw();  // Output: Drawing a circle

        Shape square = StaticFactoryMethods.createShape("square");
        square.draw();  // Output: Drawing a square

        Student student = Student.getStudent();
        student.setName("Ali");
        student.setAge(22);
        student.draw();
        student.setName("Humoyun");
        student.setAge(33);
        student.draw();
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

class Student {
    private String name;
    private int age;

    public static Student getStudent() {
        return new Student();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void draw() {
        System.out.println("Student " + name + " is " + age);
    }
}
