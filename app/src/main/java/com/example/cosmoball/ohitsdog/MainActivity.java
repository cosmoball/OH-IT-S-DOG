package com.example.cosmoball.ohitsdog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private ImageView mDogImageView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        int counter;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            counter = counter + 1;
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                    mDogImageView.setVisibility(View.VISIBLE);
                    return true;
                case R.id.navigation_notifications:
                    mDogImageView.setVisibility(View.VISIBLE);
                    return true;
            }

            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDogImageView = (ImageView) findViewById(R.id.image);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
