package com.aysu.cookbook.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aysu.cookbook.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        Intent intent=new Intent(this, LOGIN.class);
        startActivity(intent);
    }
    public void signup(View view){
        Intent intent=new Intent(this, SIGNUP.class);
        startActivity(intent);
    }
}