package com.elisacapololo.bustrip.ui.trips;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
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
    public void onBindViewHolder(@NonNull TripsViewHolder tripsViewHolder, int i) {
        tripsViewHolder.cityFrom.setText(tripsList.get(i).getCity_form());
        tripsViewHolder.cityDestination.setText(tripsList.get(i).getCity_destination());
        tripsViewHolder.partida.setText(tripsList.get(i).getPartida());
        tripsViewHolder.chegada.setText(tripsList.get(i).getChegada());
        tripsViewHolder.preco.setText(tripsList.get(i).getPreco());
        tripsViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, InformationTripsActivity.class);
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
        TextView preco;
        CardView cardView;
        public TripsViewHolder(@NonNull View itemView) {
            super(itemView);
            cityFrom = itemView.findViewById(R.id.city_from);
            cityDestination = itemView.findViewById(R.id.city_destination);
            partida = itemView.findViewById(R.id.hour_partida);
            chegada = itemView.findViewById(R.id.hour_chegada);
            preco = itemView.findViewById(R.id.money);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
