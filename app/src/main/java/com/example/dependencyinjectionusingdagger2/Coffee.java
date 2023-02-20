package com.example.dependencyinjectionusingdagger2;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    // field injection
    @Inject
    Farm farm;

    River river;



    // constructor injection
    @Inject
    public Coffee(River river) {
        this.river = river;
    }

    String TAG = "Coffee";

    // method injection
    // this function automatically will be called
    @Inject
    public void connectElectricity(){
        Log.d(TAG, "Abdo connectElectricity: connecting.... method injection");
    }

    public String getCoffeeCup(){
        return farm.getBeans() +"+"+river.getWater();
    }


}
