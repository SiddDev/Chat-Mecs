package com.sidddev.chatmecs;

import com.parse.Parse;

import android.app.Application;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class chatmecs extends Application
{

    /* (non-Javadoc)
     * @see android.app.Application#onCreate()
     */
    @Override
    public void onCreate()
    {
        super.onCreate();

        Parse.initialize(this, "I9r5xurYP2ZpFNEtTWCXMVZnDfSzBreAOG89Sahv", "WxXKkjOT4Z2j1lGUryE2PMU8WTix15eT18SxTtyf");

    }
}
