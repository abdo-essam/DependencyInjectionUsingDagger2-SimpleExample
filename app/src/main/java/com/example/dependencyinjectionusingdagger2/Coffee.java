package com.example.dependencyinjectionusingdagger2;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    // field injection
    @Inject
    Farm farm;

    River river;
    int sugar ;
    @Inject
    public Coffee(River river,int sugar)
    {
        this.sugar = sugar;
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
        return farm.getBeans() +"+"+river.getWater() +" sugar: "+ sugar;
    }


}
