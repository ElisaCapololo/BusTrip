package com.elisacapololo.bustrip.ui.trips;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.elisacapololo.bustrip.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.TripsViewHolder> {

    private Context mContext;
    private List<Trips> tripsList;

    public MyAdapter(Context mContext, List<Trips> tripsList) {
        this.mContext = mContext;
        this.tripsList = tripsList;
    }

    @NonNull
    @Override
    public TripsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.item_bus, viewGroup, false);
        return new TripsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TripsViewHolder tripsViewHolder, final int i) {
        tripsViewHolder.cityFrom.setText(tripsList.get(i).getCity_form());
        tripsViewHolder.cityDestination.setText(tripsList.get(i).getCity_destination());
        tripsViewHolder.partida.setText(tripsList.get(i).getHour_chegada());
        tripsViewHolder.chegada.setText(tripsList.get(i).getHour_partida());
        tripsViewHolder.date.setText(tripsList.get(i).getDate());
        //tripsViewHolder.month.setText(tripsList.get(i).getMonth());
        tripsViewHolder.preco.setText(tripsList.get(i).getPreco());
        tripsViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, InformationTripsActivity.class);
                //passing data to the informationTrip

                intent.putExtra("InfDate",tripsList.get(i).getDate());
                //intent.putExtra("InfMes", tripsList.get(i).getMonth());
                intent.putExtra("InfPartida", tripsList.get(i).getCity_form());
                intent.putExtra("InfChegada", tripsList.get(i).getCity_destination());
                intent.putExtra("InfParagem", tripsList.get(i).getParagens());
                intent.putExtra("InfPreco", tripsList.get(i).getPreco());
                intent.putExtra("InfHoraPartida", tripsList.get(i).getHour_partida());
                intent.putExtra("InfHoraChegada", tripsList.get(i).getHour_chegada());

                //start the activity
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tripsList.size();
    }

    public static class TripsViewHolder extends RecyclerView.ViewHolder {
        TextView cityFrom;
        TextView cityDestination;
        TextView partida;
        TextView chegada;
        TextView date;
        TextView month;
        TextView preco;
        CardView cardView;

        public TripsViewHolder(@NonNull View itemView) {
            super(itemView);
            cityFrom = itemView.findViewById(R.id.city_from);
            cityDestination = itemView.findViewById(R.id.city_destination);
            partida = itemView.findViewById(R.id.hour_partida);
            chegada = itemView.findViewById(R.id.hour_chegada);
            date = itemView.findViewById(R.id.date);
            //month = itemView.findViewById(R.id.month);
            preco = itemView.findViewById(R.id.money);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
