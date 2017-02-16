package com.example.chenwenping.chenwenandroidgsontest.utils;

import android.content.Context;
import android.content.res.Resources;

import com.example.chenwenping.chenwenandroidgsontest.ApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chenwenping on 17/2/15.
 */

public class DataUtils {

    private static Context getContext() {
        return ApplicationContext.getsInstance().getApplicationContext();
    }

    public static Resources getResources() {
        return getContext().getResources();
    }

    public static String readRawFile(int rawResId) throws IOException {
        InputStream inputStream = getResources().openRawResource(rawResId);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        inputStream.close();
        return new String(bytes, "UTF-8");
    }
}
