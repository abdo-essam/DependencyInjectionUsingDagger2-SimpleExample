package com.example.dependencyinjectionusingdagger2;

import android.app.Application;

public class MainApplication  extends Application {
    private CoffeeComponent coffeeComponent ;
    @Override
    public void onCreate() {
        super.onCreate();
        coffeeComponent = DaggerCoffeeComponent.builder().sugar(16).milk(8).build();
    }

    public CoffeeComponent getComponent() {
        return coffeeComponent;
    }
}
