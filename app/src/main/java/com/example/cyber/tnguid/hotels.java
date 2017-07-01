package com.example.cyber.tnguid;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by cyber on 6/30/17.
 */
public class hotels {
    /**
     * Method Initialization for ArrayList with location object.
     * @param hotel
     * @param context
     */
    public static void hotel(ArrayList<location> hotel, Context context){
        hotel.add(new location(context.getString(R.string.hot_na_1),
                context.getString(R.string.hot_des_1),
                context.getString(R.string.hot_pl_1),
                context.getString(R.string.hot_tel_1),
                R.drawable.hot1));
        hotel.add(new location(context.getString(R.string.hot_na_1),
                context.getString(R.string.hot_des_1),
                context.getString(R.string.hot_pl_1),
                context.getString(R.string.hot_tel_1),
                R.drawable.hot2));
        hotel.add(new location(context.getString(R.string.hot_na_1),
                context.getString(R.string.hot_des_1),
                context.getString(R.string.hot_pl_1),
                context.getString(R.string.hot_tel_1),
                R.drawable.hot3));
        hotel.add(new location(context.getString(R.string.hot_na_1),
                context.getString(R.string.hot_des_1),
                context.getString(R.string.hot_pl_1),
                context.getString(R.string.hot_tel_1),
                R.drawable.hot4));
    }
}
