package com.kiran.Restaurant.Service;

import com.kiran.Restaurant.Model.restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class restaurantIntImpl implements restaurantInt {
    List<restaurant> restaurants = new ArrayList<>();

    @Override
    public restaurant create(restaurant details) {
        restaurants.add(details);
        return details;
    }

    @Override
    public List<restaurant> getAllRestaurants() {
        return restaurants;
    }

    @Override
    public List<restaurant> getRestaurantByName(String name) {
        List<restaurant> filteredRestaurantsByName = new ArrayList<>();
        for (restaurant re : restaurants) {
            if (re.getName().equalsIgnoreCase(name)) {
                filteredRestaurantsByName.add(re);
            }
        }
        if (filteredRestaurantsByName.isEmpty()) {
            restaurant Norestaurant = new restaurant("No Restaurant", "None", 0, "None", 0);
            filteredRestaurantsByName.add(Norestaurant);
        }
        return filteredRestaurantsByName;
    }
}