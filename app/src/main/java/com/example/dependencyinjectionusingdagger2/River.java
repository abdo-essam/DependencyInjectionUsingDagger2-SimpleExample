package com.example.dependencyinjectionusingdagger2;

import android.util.Log;

import javax.inject.Inject;

public class River {
    String TAG = "River";
    @Inject
    public River(){
        Log.d(TAG, "Abdo River: constructor injection");
    }
    public String getWater(){
        return "Water";
    }
}
