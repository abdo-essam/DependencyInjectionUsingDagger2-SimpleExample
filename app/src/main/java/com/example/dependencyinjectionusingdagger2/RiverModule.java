package com.example.dependencyinjectionusingdagger2;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {
    @Provides
    @Singleton
    River provideRiver(){
        return new River();
    }
}
