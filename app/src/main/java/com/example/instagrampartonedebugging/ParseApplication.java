package com.example.instagrampartonedebugging;

import android.app.Application;

import com.example.instagrampartonedebugging.model.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kvzwnTKyIWrlqsVe1B5rmKbBxWe5c30BSmkHOk2U")
                .clientKey("ZKoOgEA6Ogw5Slb8R8QDz2BaLyuKQeWOsOeUnwvo")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
