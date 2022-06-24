package com.aysu.cookbook.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aysu.cookbook.R;

public class SIGNUP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signup2(View view){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


}