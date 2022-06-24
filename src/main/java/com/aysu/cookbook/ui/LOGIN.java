package com.aysu.cookbook.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aysu.cookbook.R;

public class LOGIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login2(View view){
        Intent intent =new Intent(this,MainActivity2.class);
        startActivity(intent);
    }



}