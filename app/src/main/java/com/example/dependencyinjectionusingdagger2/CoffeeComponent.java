package com.example.dependencyinjectionusingdagger2;




import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface CoffeeComponent {
    Coffee getCoffee();
    void inject(MainActivity mainActivity);



    @Component.Builder
    interface Builder{

        // qualifiers diff between two objects if it from the same type
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        Builder appComponent(AppComponent appComponent);
        CoffeeComponent build();
    }
}
