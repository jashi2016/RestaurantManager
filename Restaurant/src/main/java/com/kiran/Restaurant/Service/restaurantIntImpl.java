package com.kiran.Restaurant.Service;

import com.kiran.Restaurant.Error.ListEmptyException;
import com.kiran.Restaurant.Error.RestaurantNotFoundException;
import com.kiran.Restaurant.Model.restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
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
    public String updateRestaurantDetails(String name,String location, restaurant res) {
        int flag=0;
        Iterator<restaurant> iter = restaurants.iterator();
        while(iter.hasNext()){
            restaurant re = iter.next();
            if(re.getName().equalsIgnoreCase(name) &&re.getAddress().equalsIgnoreCase(location)){
                re.setName(res.getName());
                re.setAddress(res.getAddress());
                re.setPhoneNumber(res.getPhoneNumber());
                re.setSpeciality(res.getSpeciality());
                re.setTotalStaffs(res.getTotalStaffs());
                flag=1;
            }
        }
        if(flag==0){
            throw new RestaurantNotFoundException("No Restaurant Found");
        }
        return "Restaurant with name "+name+" address "+location +" updated";
    }

    @Override
    public List<restaurant> getAllRestaurants() {

        if(restaurants.isEmpty()){
            throw new ListEmptyException("No Restaurants exists.Please add some....");
        }
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
            throw new RestaurantNotFoundException("No Restaurant Found");
        }

        return filteredRestaurantsByName;
    }

    @Override
    public String deleteRestaurant(String name) {
        int flag=0;
        Iterator<restaurant> iter = restaurants.iterator();
        while(iter.hasNext()){
            restaurant re = iter.next();
            if(re.getName().equalsIgnoreCase(name)){
                iter.remove();
                flag=1;
            }
        }
        if(flag==0){
            throw new RestaurantNotFoundException("No Restaurant with that name exists");
        }
        if(restaurants.isEmpty()){
            throw new ListEmptyException("No Restaurants exists.Please add some....");
        }
        return "Restaurant With name: "+name+" is deleted..";
    }
}