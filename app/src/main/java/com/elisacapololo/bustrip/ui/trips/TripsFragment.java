package com.elisacapololo.bustrip.ui.trips;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.elisacapololo.bustrip.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TripsFragment extends Fragment {

    View view;
    List<Trips> list;
    RecyclerView recyclerView;

    public TripsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_trips, container, false);
        recyclerView = view.findViewById(R.id.recyclerview_trips);
        MyAdapter myAdapter = new MyAdapter(getContext(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(myAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list = new ArrayList<>();
        list.add(new Trips("Luanda", "Namibe", "08:00", "19:30","4000"));
        list.add(new Trips("Cabo-Ledo", "Luanda", "05:30", "12:00","3500"));
        list.add(new Trips("Luanda", "Huila", "00:30", "10:00","4500"));
        list.add(new Trips("Luanda", "Benguela", "19:00", "06:00","5000"));
        list.add(new Trips("Namibia", "Cunene", "05:30", "12:00","3600"));
        list.add(new Trips("Luanda", "Cabo-Ledo", "05:0", "11:00","3500"));
        list.add(new Trips("Caluquembe", "Menongue", "05:30", "12:00","3500"));
        list.add(new Trips("Luanda", "Negage", "05:30", "12:00","3500"));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(context, "Mostrando Viagens", Toast.LENGTH_SHORT).show();
    }


}
