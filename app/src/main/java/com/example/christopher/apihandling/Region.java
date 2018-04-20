package com.example.christopher.apihandling;

/**
 * Created by christopher on 18/04/2018.
 */

public enum Region {

    EUW("euw"),
    EUNE("eune"),
    NA("na"),
    KR("kr");


    private String name;

    private Region(String region){
        this.name = region;
    }

    public String toString(){
        return this.name;
    }
}
