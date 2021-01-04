package com.example.projectpkk.User.BottomNavigationView.Menu1Home.Home1Categories.Categories3Event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.projectpkk.Common.SearchActivity;
import com.example.projectpkk.R;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_categories_event);
    }

    public void callBackScreen(View view) {
        super.onBackPressed();
    }

    public void callSearchScreen(View view) {
        startActivity(new Intent(getApplicationContext(), SearchActivity.class));
    }

}