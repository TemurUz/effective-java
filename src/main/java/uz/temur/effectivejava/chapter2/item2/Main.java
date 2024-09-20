package uz.temur.effectivejava.chapter2.item2;

public class Main {
    public static void main(String[] args) {
        var cocaCola = new NutritionFacts.Builder(1,2).build();
        System.out.println("cocaCola: " + cocaCola);

        var pepse = new NutritionFacts.Builder(1,2)
                .calories(200)
                .carbohydrate(100)
                .fat(40)
                .sodium(502)
                .build();
        System.out.println("pepse: " + pepse.toString());
    }
}
