package jp.techacademy.ryota.kishimoto.taskapp;

/**
 * Created by ryotakishimoto on 2017/11/13.
 */


import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}