package com.example.dependencyinjectionusingdagger2;


import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();
}
