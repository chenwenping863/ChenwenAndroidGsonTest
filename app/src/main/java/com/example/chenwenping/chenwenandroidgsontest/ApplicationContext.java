package com.example.chenwenping.chenwenandroidgsontest;

import android.app.Application;

/**
 * Created by chenwenping on 17/2/15.
 */

public class ApplicationContext {
    private static ApplicationContext sInstance;
    private static Application sApplication;

    public static synchronized ApplicationContext getsInstance() {
        if (sInstance == null) {
            sInstance = new ApplicationContext();
        }
        return sInstance;
    }

    public Application getApplicationContext() {
        return sApplication;
    }

}
