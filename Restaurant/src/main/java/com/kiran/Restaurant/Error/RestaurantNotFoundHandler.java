package com.kiran.Restaurant.Error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kiran.Restaurant.Model.error;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestaurantNotFoundHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RestaurantNotFoundException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public error restaurantNotFoundHandler(RestaurantNotFoundException restaurantNotFoundException){
        return new error(HttpStatus.NOT_FOUND,restaurantNotFoundException.getMessage());
    }

    @ExceptionHandler(ListEmptyException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public error restaurantNotFoundHandler(ListEmptyException listEmptyException){
        return new error(HttpStatus.NOT_FOUND,listEmptyException.getMessage());
    }
}
