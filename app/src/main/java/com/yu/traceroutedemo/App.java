package com.yu.traceroutedemo;

import android.app.Application;

/**
 * Created by yu on 2017/7/29.
 */

public class App extends Application {
    public static App Instance;
    @Override
    public void onCreate() {
        super.onCreate();
        Instance = this;
    }
}
