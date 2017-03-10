package com.sebastian_daschner.confoo_lightweight;

import javax.ejb.Asynchronous;
import javax.ejb.Singleton;
import javax.enterprise.event.Observes;
import java.util.concurrent.locks.LockSupport;

@Singleton
public class NewCoffeeListener {

    @Asynchronous
    public void onNewCoffee(@Observes NewCoffee newCoffee) {
        LockSupport.parkNanos(2_000_000_000L);
        System.out.println(newCoffee);
    }

}
