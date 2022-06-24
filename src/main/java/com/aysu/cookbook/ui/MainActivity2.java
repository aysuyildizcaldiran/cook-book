package com.aysu.cookbook.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aysu.cookbook.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        HomeFragment homeFragment =new HomeFragment();

        fragmentTransaction.replace(R.id.framelayout, homeFragment).commit();


    }

    public void home(View view){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        HomeFragment homeFragment =new HomeFragment();

        fragmentTransaction.replace(R.id.framelayout, homeFragment).commit();
    }
    public void add(View view){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        AddFragment addFragment=new AddFragment();
       fragmentTransaction.replace(R.id.framelayout,addFragment).commit();
    }
    public void setting(View view){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        SettingsActivity.SettingsFragment settingsFragment=new SettingsActivity.SettingsFragment();
        fragmentTransaction.replace(R.id.framelayout,settingsFragment).commit();
    }


}