package com.example.christopher.relativeleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.christopher.apihandling.APIHandler;
import com.example.christopher.apihandling.Region;

public class Landing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        APIHandler api = new APIHandler("123", Region.EUW);
        api.run();
    }
}
