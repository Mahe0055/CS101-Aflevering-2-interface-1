import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwichPlace = new Sandwich();
        Pizza pizzaPlace = new Pizza();

        ArrayList<FastFood> fastFoodArrayList = new ArrayList<>();
        fastFoodArrayList.add(sandwichPlace);
        fastFoodArrayList.add(pizzaPlace);

        for (FastFood food: fastFoodArrayList) {
            System.out.println(food.isVegan());
            food.foodServing();
        }
    }
}