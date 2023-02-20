package com.example.dependencyinjectionusingdagger2;

import android.app.Application;

public class MainApplication  extends Application {
    private AppComponent appComponent ;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }


}
