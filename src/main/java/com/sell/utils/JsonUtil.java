package com.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/

public class JsonUtil {

    public static String tojson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = new Gson();
        return gson.toJson(object);
    }

}
