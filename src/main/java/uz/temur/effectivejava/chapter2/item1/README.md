### Item 1: consider static factory methods instead of constructors

1. One advantage of static factory methods is that, unlike constructors, they have names.
2. A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they’re invoked. 
3. A third advantage of static factory methods is that, unlike constructors, they can return an object of <b>any subtype</b> of their return type.

### Example: Shape Interface and Subclasses
<p>Suppose we have a Shape interface and two concrete classes, Circle and Square, that implement this interface.</p>

```java
public interface Shape {
    void draw();
}

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}


```
<p>Now, let’s create a StaticFactoryMethods class that uses a static factory method to return an object of type Shape, which could be any subtype like Circle or Square.</p>

```java
public class StaticFactoryMethods {

   // Static factory method
   public static Shape createShape(String type) {
      if (type.equalsIgnoreCase("circle")) {
         return new Circle();
      } else if (type.equalsIgnoreCase("square")) {
         return new Square();
      }
      throw new IllegalArgumentException("Unknown shape type");
   }

   //We can now use the StaticFactoryMethods to create different types of Shape objects:
   public static void main(String[] args) {
      Shape circle = StaticFactoryMethods.createShape("circle");
      circle.draw();  // Output: Drawing a circle

      Shape square = StaticFactoryMethods.createShape("square");
      square.draw();  // Output: Drawing a square
   }
}

```

<b>In summary, static factory methods offer greater flexibility compared to constructors because they can return instances of different subtypes, depending on the logic in the method.</b>

4. A fourth advantage of static factories is that the class of the returned
   object can vary from call to call as a function of the input parameters.