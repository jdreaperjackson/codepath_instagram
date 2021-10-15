package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2Fe9up9MUzBEOzWo3DuK42BeelxKeCwaXwFiVcvz")
                .clientKey("rTeYMHM2gselOTVybMxHaqKDsu9hK0zzAimoxjTR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
