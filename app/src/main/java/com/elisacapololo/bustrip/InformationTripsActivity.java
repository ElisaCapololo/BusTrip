package com.elisacapololo.bustrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InformationTripsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_trips);
        getSupportActionBar().setTitle("Informações da Viagem");
    }
}
