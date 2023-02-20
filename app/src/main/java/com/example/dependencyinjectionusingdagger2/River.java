package com.example.dependencyinjectionusingdagger2;

import android.util.Log;

import javax.inject.Inject;

public class River {
    String TAG = "River";

    // for view
    public River(){
        Log.d(TAG, "Abdo River: Module");
    }
    public String getWater(){
        return "Water";
    }
}
