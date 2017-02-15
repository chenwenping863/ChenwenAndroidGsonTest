package com.example.chenwenping.chenwenandroidgsontest.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenwenping on 17/2/15.
 */

public class GsonUtils {
    private static Gson sGson = new Gson();
    /**
     * jsonStringToClass
     * @param jsonString
     * @param tClass
     * @return
     */
    public static <T> T jsonStringToClass(String jsonString, Class<T> tClass) {
        return sGson.fromJson(jsonString, tClass);
    }

    /**
     * jsonStringToList
     * @param jsonString
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonStringToList(String jsonString , Class<T> cls){
        List<T> list = new ArrayList<T>();
        JsonArray array = new JsonParser().parse(jsonString).getAsJsonArray();
        for(final JsonElement elem : array){
            list.add(sGson.fromJson(elem, cls));
        }
        return list ;
    }


    public static <T> T jsonStringToType(String jsonString, Type type) {
        return sGson.fromJson(jsonString, type);
    }

    public static <T> T jsonObjectToClass(JSONObject jsonObject, Class<T> tClass) {
        return jsonStringToClass(jsonObject.toString(), tClass);
    }

    /**
     * objectToString
     * @param object
     * @param <T>
     * @return
     */
    public static <T> String objectToString(T object) {
        if (object == null) {
            return null;
        }
        return sGson.toJson(object);
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


