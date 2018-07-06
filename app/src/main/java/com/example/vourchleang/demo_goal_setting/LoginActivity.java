package com.example.vourchleang.demo_goal_setting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vourchleang on 7/5/2018.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Register Shared element transition
        ViewCompat.setTransitionName(findViewById(R.id.imglogo),"img_LogoStart");
        ViewCompat.setTransitionName(findViewById(R.id.txtlogo),"txt_LogoStart");

    }
}
