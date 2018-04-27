package com.example.admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        String ACCES_TOKEN = getIntent().getExtras().getString("url").substring(45, 130);
        System.out.println("------------------------------------------------------------");
        System.out.println(ACCES_TOKEN);
        System.out.println("------------------------------------------------------------");

        ArrayList<Parameters> param ;
        Dialogs.getDialogs(ACCES_TOKEN, this, 1);

        //TextView text = findViewById(R.id.textView);


    }
}
