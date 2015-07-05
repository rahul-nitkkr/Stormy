package com.rahul.stormy;

import android.app.Application;
import android.util.Log;


import com.parse.Parse;

import java.text.ParseException;

public class StormyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "PGyg33OBVvySUIgAEgrWXQkDNHxygk43V2WPXrLi", "IFSdonn8088rl63yQEnXmlsZafKrGxXgQZX1ZSzL");




    }

}
