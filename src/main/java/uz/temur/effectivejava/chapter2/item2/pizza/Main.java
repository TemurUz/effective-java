package uz.temur.effectivejava.chapter2.item2.pizza;

import static uz.temur.effectivejava.chapter2.item2.pizza.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        System.out.println(pizza);

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        System.out.println(calzone);
    }
}
