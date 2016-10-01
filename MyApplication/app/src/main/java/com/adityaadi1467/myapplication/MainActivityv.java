/*
 * Copyright Txus Ballesteros 2015 (@txusballesteros)
 *
 * This file is part of some open source application.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Contact: Txus Ballesteros <txus.ballesteros@gmail.com>
 */
package com.adityaadi1467.myapplication;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.txusballesteros.bubbles.BubbleLayout;
import com.txusballesteros.bubbles.BubblesManager;
import com.txusballesteros.bubbles.OnInitializedCallback;

public class MainActivityv extends ActionBarActivity {

    private BubblesManager bubblesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainv);

        initializeBubblesManager();

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewBubble();
            }
        });
    }

    private void addNewBubble() {
        final BubbleLayout bubbleView = (BubbleLayout)LayoutInflater.from(MainActivityv.this).inflate(R.layout.bubble_layout, null);
        bubbleView.setOnBubbleRemoveListener(new BubbleLayout.OnBubbleRemoveListener() {
            @Override
            public void onBubbleRemoved(BubbleLayout bubble) {
            }
        });
        bubbleView.setOnBubbleClickListener(new BubbleLayout.OnBubbleClickListener() {


            @Override
            public void onBubbleClick(BubbleLayout bubble) {

                PopupWindow mpopup;
                View popUpView = getLayoutInflater().inflate(R.layout.fragment_test,
                        null); // inflating popup layout
                mpopup = new PopupWindow(popUpView, FrameLayout.LayoutParams.FILL_PARENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT, true); // Creation of popup
                mpopup.setAnimationStyle(android.R.style.Animation_Dialog);
                mpopup.showAtLocation(popUpView, Gravity.CENTER, 0, 0); // Displaying popup
              Toast.makeText(getApplicationContext(), "Clickefbgd !",
                        Toast.LENGTH_SHORT).show();
            }
        });
        bubbleView.setShouldStickToWall(true);
        bubblesManager.addBubble(bubbleView, 60, 20);
    }

    private void initializeBubblesManager() {
        bubblesManager = new BubblesManager.Builder(this)
                                    .setTrashLayout(R.layout.bubble_trash_layout)
                                    .setInitializationCallback(new OnInitializedCallback() {
                                        @Override
                                        public void onInitialized() {
                                            addNewBubble();
                                        }
                                    })
                                    .build();
        bubblesManager.initialize();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        bubblesManager.recycle();
    }



}
