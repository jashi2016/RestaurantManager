package com.kiran.Restaurant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kiran.Restaurant.Service.restaurantInt;
import com.kiran.Restaurant.Model.restaurant;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    restaurantInt restaurantint;

    @PostMapping("/add")
    public restaurant create(@RequestBody restaurant details){
        restaurantint.create(details);
        return details;
    }

    @GetMapping("/allDetails")
    public List<restaurant> getAllRestaurants(){
        return restaurantint.getAllRestaurants();
    }

    @GetMapping("/get")
    public List<restaurant> getRestaurantByName(@RequestParam String name){
        return restaurantint.getRestaurantByName(name);
    }
    @GetMapping("/get/{name}")
    public List<restaurant> getRestaurantByName2(@PathVariable String name){
        return restaurantint.getRestaurantByName(name);
    }
}
