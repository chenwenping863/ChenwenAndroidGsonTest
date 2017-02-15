package com.example.chenwenping.chenwenandroidgsontest.utils;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.lang.reflect.Type;

/**
 * Created by chenwenping on 17/2/15.
 */

public class GsonUtils {

    public static <T> T jsonStringToClass(String jsonString, Class<T> tClass) {
        return new Gson().fromJson(jsonString, tClass);
    }

    public static <T> T jsonStringToType(String jsonString, Type type) {
        return new Gson().fromJson(jsonString, type);
    }

    public static <T> T jsonObjectToClass(JSONObject jsonObject, Class<T> tClass) {
        return jsonStringToClass(jsonObject.toString(), tClass);
    }

    public static String objectToString(Object object) {
        if (object == null) {
            return null;
        }
        return new Gson().toJson(object);
    }


    public static String getAsString(String s, String key) {
        try {
            return new JSONObject(s).optString(key);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}


