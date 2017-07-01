package com.example.cyber.tnguid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyber on 6/29/17.
 */
public class locationAdapter extends ArrayAdapter<location> {
    public locationAdapter(Context context, List<location> list) {
        super(context, 0, list);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }
        final location currentLocation = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentLocation.getName());

        TextView des = (TextView) listItemView.findViewById(R.id.descriptions);
        des.setText(currentLocation.getDescription());

        TextView number = (TextView) listItemView.findViewById(R.id.number);
        number.setText(currentLocation.getNumber());

        TextView map = (TextView) listItemView.findViewById(R.id.place);
        map.setText(currentLocation.getMap());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentLocation.getImageResourceId());


        return listItemView;
    }
}
