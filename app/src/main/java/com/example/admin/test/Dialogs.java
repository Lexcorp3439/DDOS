package com.example.admin.test;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.JsonReader;

import com.example.admin.test.Parser.Message;

import java.io.IOException;
import java.util.ArrayList;

public class Dialogs {

    static ArrayList<Parameters> param;

    @SuppressLint("StaticFieldLeak")
    private static Context contextTo;

    static void getDialogs(String token, Context context, int count) {
        contextTo = context;

        VKrequest.lamda(() -> {
            String request = "https://api.vk.com/method/messages.getDialogs?count=" + count + "&v=5.74&access_token=" + token;

            JsonReader json = VKrequest.getJSON(request);

            if (json == null)
                System.out.println("LexaLOH");

            try {
                param = new Message(json, count).param;

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
