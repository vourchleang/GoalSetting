package com.example.vourchleang.demo_goal_setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

/**
 * Created by vourchleang on 7/5/2018.
 */

public class StartUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }
    public void OnclickStart(View v){
        Intent intent = new Intent(this,LoginActivity.class);
      //   Create Shared element pair
        Pair<View, String> imgLogoPair = new Pair<>(findViewById(R.id.imglogo),"img_LogoStart");
        Pair<View, String>txtLogoPair = new Pair<>(findViewById(R.id.txtlogo),"txt_LogoStart");
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,imgLogoPair,txtLogoPair);
        ActivityCompat.startActivity(this,intent,optionsCompat.toBundle());
   }
}
