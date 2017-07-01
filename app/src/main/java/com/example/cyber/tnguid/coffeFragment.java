package com.example.cyber.tnguid;


import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by cyber on 6/29/17.
 */
public class coffeFragment extends Fragment {
    //Contractor
    public coffeFragment() {
    }

    /**
     * Override Method onCreateView implemented to inflate the fragment layout with adapter using the arraylist.
     */
    @Nullable
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<location> list = new ArrayList<>();
        coffee.coffee_shop(list, getContext());
        locationAdapter adapter = new locationAdapter(getActivity(), list);
        View rootView = inflater.inflate(R.layout.lista, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.lista);
        listView.setAdapter(adapter);
        return rootView;
        //return inflater.inflate(R.layout.lista, container, false);
    }
}
