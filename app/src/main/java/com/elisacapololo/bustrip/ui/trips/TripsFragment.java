package com.elisacapololo.bustrip.ui.trips;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        list.add(new Trips("Luanda", "Namibia", "08:00", "19:30","16/02/2020","24000","Luanda, Bengo"));
        list.add(new Trips("Luanda", "Namibe", "08:00", "19:30","01/06/2010","4000","Luanda, Bengo"));
        list.add(new Trips("Mbanza-Congo", "Luanda", "05:30", "12:00","30/08/2020","3500","Luanda, Bengo"));
        list.add(new Trips("Luanda", "Huila", "00:30", "10:00","10/03/2020","4500","Luanda, Bengo"));
        list.add(new Trips("Luanda", "Benguela", "19:00", "06:00","16/12/2020","5000","Luanda, Bengo"));
        list.add(new Trips("Namibia", "Cunene", "05:30", "12:00","16/05/2020","3600","Luanda, Bengo"));
        list.add(new Trips("Luanda", "Cabo-Ledo", "05:0", "11:00","9/04/2020","3500","Luanda, Bengo"));
        list.add(new Trips("Caluquembe", "Menongue", "05:30", "12:00","16/05/2020","3500","Luanda, Bengo"));
        list.add(new Trips("Luanda", "Negage", "05:30", "12:00","16/07/2020","3500","Luanda, Bengo"));
    }

    /*@Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(context, "Mostrando Viagens", Toast.LENGTH_SHORT).show();
    }*/


}
