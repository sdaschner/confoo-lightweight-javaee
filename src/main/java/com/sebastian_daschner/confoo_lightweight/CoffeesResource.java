package com.sebastian_daschner.confoo_lightweight;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("coffees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoffeesResource {

    @Inject
    CoffeeShop coffeeShop;

    @Inject
    Event<NewCoffee> newCoffees;

    @GET
    public List<Coffee> getCoffees() {
        return coffeeShop.getCoffees();
    }

    @POST
    public void createCoffee(@Valid @NotNull Coffee coffee) {
        coffeeShop.createCoffee(coffee);
        newCoffees.fire(new NewCoffee(coffee.toString()));
    }

}
