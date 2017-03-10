package com.sebastian_daschner.confoo_lightweight;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BeanOriginInStockValidator implements
        ConstraintValidator<BeanOriginInStock, String> {

    @Inject
    CoffeeShop coffeeShop;

    public void initialize(BeanOriginInStock constraint) {
    }

    public boolean isValid(String string, ConstraintValidatorContext context) {
        return coffeeShop.isInStock(string);
    }

}
