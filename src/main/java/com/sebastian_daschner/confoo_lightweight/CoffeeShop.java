package com.sebastian_daschner.confoo_lightweight;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class CoffeeShop {

    public List<Coffee> getCoffees() {
        return Arrays.asList(new Coffee(Type.CAPPUCCHINO, Size.MEDIUM, "Ethiopia"),
                new Coffee(Type.ESPRESSO, Size.LARGE, "Colombia"));
    }

    public void createCoffee(final Coffee coffee) {
        System.out.println(coffee);
    }

    public boolean isInStock(String origin) {
        return "Colombia".equals(origin);
    }

}
