package com.example.dependencyinjectionusingdagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class Farm {
    String TAG ="Farm";
    @Inject
    public Farm(){
        Log.d(TAG, "Abdo Farm: field injection");
    }

    public String getBeans(){
        return "Beans";
    }
}
