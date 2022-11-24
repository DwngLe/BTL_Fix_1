package com.mycompany.btl;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;



public class API {

    public static JsonResult getJsonData(String city) {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonResult data = null;
        Request res = new Request.Builder().url("http://api.openweathermap.org/data/2.5/forecast?q=" + city + "&APPID=28980acac41997bea41c8f552f243614&units=metric").build();
        try {
            Response response = client.newCall(res).execute();
            ResponseBody body = response.body();
            data = gson.fromJson(body.string(), JsonResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
