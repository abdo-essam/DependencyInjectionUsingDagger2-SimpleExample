package com.example.dependencyinjectionusingdagger2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Coffee coffee ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      /*  CoffeeComponent component  = DaggerCoffeeComponent.create();
        component.getCoffee();*/
        String TAG = "MainActivity";
        CoffeeComponent component = DaggerCoffeeComponent.builder().coffeeModule(new CoffeeModule(5)).build();
        component.inject(this);
        Log.d(TAG, "Abdo onCreate: " + coffee.getCoffeeCup());
    }
}