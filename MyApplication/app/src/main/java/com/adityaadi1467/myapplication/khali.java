package com.adityaadi1467.myapplication;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.flipkart.chatheads.ui.ChatHeadContainer;

import java.util.List;

public class khali extends Service {
   public List<View> v;
   public khali(List<View> views)
    {

        v=views;
    }


    private WindowManager windowManager;
    private ImageView chatHead;
    private ChatHeadContainer chatHeadContainer;

    @Override public IBinder onBind(Intent intent) {
        // Not used
        return null;
    }

    @Override public void onCreate() {

        super.onCreate();
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

        chatHead = new ImageView(this);
        chatHead.setImageResource(R.drawable.head);


        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_PHONE,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);

        params.gravity = Gravity.TOP | Gravity.LEFT;
        params.x = 0;
        params.y = 100;


        windowManager.addView( v.get(0), params);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (v.get(0) != null) windowManager.removeView(v.get(0));
    }

}
