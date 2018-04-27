package com.example.admin.test;

import android.support.annotation.Nullable;
import android.util.JsonReader;
import android.util.Log;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class VKrequest {
    static BlockingQueue<Runnable> request = new ArrayBlockingQueue<Runnable>(100);
    static MyThread secThread = new MyThread(request);



    static void lamda(Runnable runnable){
        request.add(runnable);
    }

    @Nullable
    static JsonReader getJSON(String url) {
        HttpURLConnection connection = null;

        try {
            connection = (HttpURLConnection) new URL(url).openConnection();

            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setConnectTimeout(250);
            connection.setReadTimeout(250);

            connection.connect();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()){

                return new JsonReader(new InputStreamReader(connection.getInputStream()));
            } else{
                Log.d("VKrequest", "Fail: " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }
        } catch (Exception cause){
            Log.d("VKrequestTEXT", cause.getMessage());
        } finally {
            if (connection != null){
                connection.disconnect();
            }
        }
        return null;
    }
}
