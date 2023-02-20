package com.example.dependencyinjectionusingdagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Coffee {

    // field injection
    @Inject
    Farm farm;

    River river;
    int sugar;
    int milk;

    @Inject
    // qualifiers diff between two objects if it from the same type
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.milk = milk;
        this.sugar = sugar;
        this.river = river;
    }

    String TAG = "Coffee";

    // method injection
    // this function automatically will be called
    @Inject
    public void connectElectricity() {
        Log.d(TAG, "Abdo connectElectricity: connecting.... method injection");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + "+" + river.getWater() + " sugar: " + sugar + " milk: " + milk;
    }


}
