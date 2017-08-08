package com.putao.library;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by andy on 2017/8/8.
 */

public class ToastUtils {

    private static Context sContext;

    private ToastUtils(){}

    public static void init(Context context){
       if(context == null){
           throw new IllegalArgumentException("ToastUtils method init context is null");
       }
       sContext = context.getApplicationContext();
    }

    public static void show(String msg){
        checkInit();
        Toast.makeText(sContext, msg, Toast.LENGTH_SHORT).show();
    }


    private static void checkInit(){
        if(sContext == null){
            throw new IllegalArgumentException("ToastUtils not init");
        }
    }
}
