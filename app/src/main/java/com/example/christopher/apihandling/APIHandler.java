package com.example.christopher.apihandling;

import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIHandler {
    public static String API_KEY = "RGAPI-bc695097-23e3-4980-8e6f-b780fa5cf8df";

    public APIHandler(String api_key, Region region){

    }

    public void run(){

        String search = "https://euw.api.riotgames.com/lol/summoner/v3/summoners/by-name/RiotSchmick?api_key=RGAPI-bc695097-23e3-4980-8e6f-b780fa5cf8df";
        System.out.println("https://euw.api.riotgames.com/lol/summoner/v3/summoners/by-name/RiotSchmick?api_key=<key>");

        JSONParser jsonParser = null;
        jsonParser =  new JSONParser();

        HttpURLConnection con = null;
        try {

            URL url = new URL(search);

            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");



        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
