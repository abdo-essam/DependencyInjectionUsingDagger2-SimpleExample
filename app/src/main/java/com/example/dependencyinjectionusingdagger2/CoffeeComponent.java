package com.example.dependencyinjectionusingdagger2;




import dagger.BindsInstance;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent()
public interface CoffeeComponent {
    Coffee getCoffee();
    void inject(MainActivity mainActivity);



    @Subcomponent.Builder
    interface Builder{

        // qualifiers diff between two objects if it from the same type
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeeComponent build();
    }
}
