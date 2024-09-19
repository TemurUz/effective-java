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

5. A fifth advantage of static factories is that the class of the returned object
   need not exist when the class containing the method is written.

#### For Example

* Service Interfeys: Bu mijoz foydalanishi mumkin bo'lgan xizmatning asosiy interfeysi.
```java
public interface PaymentService {
    void processPayment(double amount);
}
```

* Service Provider: Bu esa implementatsiya bo'lib, biz turli provayderlarni (masalan, PayPal, Stripe) yaratishimiz mumkin.

```java
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal orqali to'lov amalga oshirildi: " + amount);
    }
}

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe orqali to'lov amalga oshirildi: " + amount);
    }
}
```

* Static Factory Method: Bu metod mijozlarga implementatsiyani tanlashga imkon beradi. Bu metod yozilgan vaqtda ham, u kelajakda ko'proq xizmatlar qo'shilishiga tayyor bo'ladi.

```java
public class PaymentServiceFactory {
    public static PaymentService getPaymentService(String provider) {
        switch (provider) {
            case "PayPal":
                return new PayPalPaymentService();
            case "Stripe":
                return new StripePaymentService();
            default:
                throw new IllegalArgumentException("Not known provider: " + provider);
        }
    }
}
```

* Qo'llanishi: Mijoz static factory orqali xohlagan provayderni tanlashi mumkin

```java
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = PaymentServiceFactory.getPaymentService("PayPal");
        paymentService.processPayment(100.0);
        
        PaymentService anotherService = PaymentServiceFactory.getPaymentService("Stripe");
        anotherService.processPayment(200.0);
    }
}

```

#### Explanation

* Static factory metoddan foydalangan holda `PaymentService` yaratamiz.
* `PayPal` va `Stripe` provayderlari yaratib qo'yilgan, lekin biz yangi provayderlarni 
qo'sha olamiz va bu bilan `PaymentServiceFactory`ni o'zgartirishimiz shart bo'lmaydi. 
Masalan, `Square` yoki boshqa to'lov xizmatlarini qo'shishimiz mumkin.

<b>In Summary. Bu static factory metod ining asosiy afzalliklaridan biridir — u yozilgan paytda barcha mumkin bo'lgan calass larni bilish shart emas.</b>