package com.example.appsdklibrary;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;

public class Lck {
    private String mString;
    public static void init(@NonNull Context context) {
        Handler handler=new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
