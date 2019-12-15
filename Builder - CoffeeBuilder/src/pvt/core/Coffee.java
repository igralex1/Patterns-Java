package pvt.core;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Coffee {
    private String nameOfCoffee;
    ArrayList<String> ingredients = new ArrayList<String>();

    public void setNameOfCoffee(String nameOfCoffee) {
        this.nameOfCoffee = nameOfCoffee;
    }

    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }
    public void showOrder() {
        System.out.println("Your order: " + nameOfCoffee + " . Coffee composition: " + ingredients);
    }
}
