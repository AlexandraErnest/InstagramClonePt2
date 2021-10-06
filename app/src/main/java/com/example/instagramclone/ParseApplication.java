package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TZRuCjBmufb1BxXDLOSv8tVeJolMy97nT3JDA6wk")
                .clientKey("b2G9rjMBgdBzRm7R2NnnpICHtRmxqXbHPMn80Oq0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
