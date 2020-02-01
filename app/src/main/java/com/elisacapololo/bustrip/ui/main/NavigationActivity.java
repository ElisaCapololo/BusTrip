package com.elisacapololo.bustrip.ui.main;

import android.os.Bundle;
import androidx.annotation.NonNull;

import com.elisacapololo.bustrip.ui.about.AboutFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

import com.elisacapololo.bustrip.ui.maps.BlankFragmentMaps;
import com.elisacapololo.bustrip.R;
import com.elisacapololo.bustrip.ui.info.InfoFragment;
import com.elisacapololo.bustrip.ui.trips.TripsFragment;

public class NavigationActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.frame_content, new BlankFragmentMaps()).commit();
                    return true;
                case R.id.navigation_trips:
                   transaction.replace(R.id.frame_content, new TripsFragment()).commit();
                    return true;
                case R.id.navigation_profile:
                    transaction.replace(R.id.frame_content, new InfoFragment()).commit();
                    return true;
                case R.id.navigation_menu:
                    transaction.replace(R.id.frame_content, new AboutFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        getSupportActionBar().setTitle("Macon");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.frame_content, new BlankFragmentMaps()).commit();
    }


}
