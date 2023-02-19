package com.example.dependencyinjectionusingdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component  = DaggerCoffeeComponent.create();
        component.getCoffee();

    }
}