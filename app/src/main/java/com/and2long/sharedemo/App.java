package com.and2long.sharedemo;

import android.app.Application;

import com.twitter.sdk.android.core.Twitter;

/**
 * Created by and2long on 2017/6/25.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Twitter
        Twitter.initialize(this);
    }
}
