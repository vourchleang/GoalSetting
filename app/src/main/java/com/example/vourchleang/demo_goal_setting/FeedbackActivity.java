package com.example.vourchleang.demo_goal_setting;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sendfeedback;
    private EditText email,subject,writemessage;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        sendfeedback = findViewById(R.id.btnfeedback);
        email = findViewById(R.id.edit1);
        subject = findViewById(R.id.edit2);
        writemessage = findViewById(R.id.edit3);

        sendfeedback.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Email = email.getText().toString();
        String Subject = subject.getText().toString();
        String Message = sendfeedback.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        //intent.putExtra(Intent.Extra_Email,new String[] Email));
        intent.putExtra(Intent.EXTRA_EMAIL, Email);
        intent.putExtra(Intent.EXTRA_SUBJECT,Subject);
        intent.putExtra(Intent.EXTRA_TEXT,Message);

        intent.setType("Message/rfc822");// get this in description
        startActivity(Intent.createChooser(intent,"Choose app to send mail"));

    }
}
//dimennsion file for limiting size
    //name