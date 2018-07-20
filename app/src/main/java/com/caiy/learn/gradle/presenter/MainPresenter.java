package com.caiy.learn.gradle.presenter;

import android.content.Context;
import android.util.Log;

/**
 * Created by caiyong on 2018/7/20.
 */

public class MainPresenter {

    private static final String TAG = "MainPresenter";
    private Context mContext;

    public MainPresenter(Context context){
        mContext = context;
    }

    public void method1(String canshu1){
        Log.i(TAG,"method1:" + canshu1);
    }

    public void method2(String canshu1, String canshu2){
        Log.i(TAG,"method2:" + canshu1 + "," + canshu2);
    }

    public void method3(String canshu1, String canshu2, String canshu3){
        Log.i(TAG,"method2:" + canshu1 + "," + canshu2 + "," + canshu3);
    }
}
