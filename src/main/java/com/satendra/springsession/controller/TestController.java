package com.satendra.springsession.controller;

import com.satendra.springsession.cart.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ShoppingCart shoppingCart;

    //add item to cart
    @GetMapping("/cart/add-items")
    public void addItemToCart(@RequestParam("item") String item){
        shoppingCart.getItemName().add(item);
    }

    //view all item in cart
    @GetMapping("/cart/view")
    public List<String> viewAllCartItems(){
        return shoppingCart.getItemName();
    }

    //view principle
    @GetMapping("/user")
    public Principal principle(Principal principal){
        return principal;
    }
}
