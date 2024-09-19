package uz.temur.effectivejava.chapter2.item1.disadvantage;

public class MyClass {
    private MyClass() {
        // Private konstruktor
    }

    public static MyClass createInstance() {
        return new MyClass();
    }
}
