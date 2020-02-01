package com.elisacapololo.bustrip.ui.trips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.elisacapololo.bustrip.R;
import com.elisacapololo.bustrip.ui.ticket.FormActivity;

public class InformationTripsActivity extends AppCompatActivity {

    private TextView infDate, infMes, infPartida, infChegada, infParagem,
                     infPreco, infHoraPartida, infHoraChegada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_trips);
        getSupportActionBar().setTitle("Informações da Viagem");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        infDate = findViewById(R.id.infDate);
        infPartida = findViewById(R.id.infoPartida);
        infChegada = findViewById(R.id.infoDestino);
        infParagem = findViewById(R.id.infoParagem);
        infPreco = findViewById(R.id.infoPreco);
        infHoraChegada = findViewById(R.id.infoHoracheg);
        infHoraPartida = findViewById(R.id.infoHoraPart);

        //Receive data

        Intent intent = getIntent();
        String InfDate = intent.getExtras().getString("InfDate");
        String InfPartida = intent.getExtras().getString("InfPartida");
        String InfChegada = intent.getExtras().getString("InfChegada");
        String InfParagem = intent.getExtras().getString("InfParagem");
        String InfPreco = intent.getExtras().getString("InfPreco");
        String InfHoraPartida = intent.getExtras().getString("InfHoraPartida");
        String InfHoraChegada = intent.getExtras().getString("InfHoraChegada");

        //Setting values
        infDate.setText(InfDate);
        infPartida.setText(InfPartida);
        infChegada.setText(InfChegada);
        infParagem.setText(InfParagem);
        infPreco.setText(InfPreco);
        infHoraPartida.setText(InfHoraPartida);
        infHoraChegada.setText(InfHoraChegada);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void callFormActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), FormActivity.class);
        startActivity(intent);
    }
}
