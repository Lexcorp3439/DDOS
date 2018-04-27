package com.example.admin.test.Parser;

import android.util.JsonReader;

import com.example.admin.test.Parameters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Message {
    private boolean unread = false;
    private int user_id;
    public String title = "";
    private String body = "";
    private JsonReader json;
    public ArrayList<Parameters> param = new ArrayList<>();

    public Message(JsonReader json,int count) throws IOException {
        this.json = json;

        json.beginObject();                                                                         // {
        json.nextName();                                                                          // response
        json.beginObject();                                                                         // {
        json.nextName();                                                                           // count
        json.skipValue();                                                                           // 37
        if (Objects.equals(json.nextName(), "unread_dialogs")) {
            json.skipValue();
            json.nextName();
        }
        json.beginArray();
        for (int i = 0; i < count; i++) {
            json.beginObject();                                                                     // {
            if (Objects.equals(json.nextName(), "unread")){
                json.skipValue();
                json.nextName();
            }                                                                    // {
            param.add(messageObject());

            json.nextName();                                                                       // in_read
            json.skipValue();                                                                       // 31019
            json.nextName();                                                                       // out_read
            json.skipValue();                                                                       // 31019
            json.endObject();                                                                       // }
        }
        json.endArray();                                                                            // ]
        json.endObject();                                                                           // }
        json.endObject();                                                                           // }
    }

    private Parameters messageObject() throws IOException {
        json.beginObject();
        while (json.hasNext()){
            switch (json.nextName()){
                case "unread":
                    json.skipValue();
                    unread = true;
                case "user_id":
                    user_id = json.nextInt();
                    break;
                case "title":
                    title = json.nextString();
                    break;
                case "body":
                    body = json.nextString();
                    System.out.println(body);
                    break;
                default:
                    json.skipValue();
                    break;
            }
        }
        json.endObject();
        return new Parameters(body, user_id, title, unread);
    }
}
