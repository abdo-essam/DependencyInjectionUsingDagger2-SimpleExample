package com.example.dependencyinjectionusingdagger2;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {
    @Provides
    @Singleton
    River provideRiver(){
        return new River();
    }
}
