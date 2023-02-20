package com.example.dependencyinjectionusingdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      /*  CoffeeComponent component  = DaggerCoffeeComponent.create();
        component.getCoffee();*/
        String TAG = "MainActivity";


        CoffeeComponent component = ((MainApplication) getApplication()).getComponent();
        component.inject(this);


        Log.d(TAG, "Abdo onCreate: " + coffee.getCoffeeCup() + "\n river for coffee 1 :" + coffee.river + "\n river for coffee 2 :" + coffee2.river);
    }
}