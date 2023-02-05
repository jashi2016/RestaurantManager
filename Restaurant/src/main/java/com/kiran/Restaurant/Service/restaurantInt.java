package com.kiran.Restaurant.Service;

import com.kiran.Restaurant.Model.restaurant;

import java.util.List;

public interface restaurantInt {
    restaurant create(restaurant details);

    List<restaurant> getAllRestaurants();

    List<restaurant> getRestaurantByName(String name);

    String deleteRestaurant(String name);

    String updateRestaurantDetails(String name,String location, restaurant res);
}
