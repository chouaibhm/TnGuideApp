package com.example.cyber.tnguid;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by cyber on 6/30/17.
 */
public class restaurantFragment extends Fragment {
    //Contractor
    public restaurantFragment() {
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    /**
     * Override Method onCreateView implemented to inflate the fragment layout with adapter using the arraylist.
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<location> list = new ArrayList<>();
        restaurant.restaurant(list, getContext());
        locationAdapter adapter = new locationAdapter(getActivity(), list);
        View rootView = inflater.inflate(R.layout.lista, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.lista);
        listView.setAdapter(adapter);
        return rootView;
    }
}
