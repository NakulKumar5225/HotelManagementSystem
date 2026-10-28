package com.hotel.service;
import com.hotel.model.FoodItem;
import java.util.ArrayList;

public class RestaurantService {

    private ArrayList<FoodItem> foodList = new ArrayList<>();

    public void addFood(FoodItem food) {
        foodList.add(food);
        System.out.println("Food Added Sucsessfully ");
    }

    public void showAllFood() {
        if (foodList.isEmpty()) {
            System.out.println("Noo Food Found");

            return;
        }

        for (FoodItem food : foodList) {
            food.displayFoodItem();
            System.out.println("---------------------");
        }
    }

    public FoodItem findFoodById(int foodId) {
        for (FoodItem food : foodList) {
            if (food.getFoodId() == foodId) { 
                return food;
            }
        }
        return null;

    }

}
