package com.example.cyber.tnguid;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by cyber on 6/30/17.
 */
public class restaurant {
    /**
     * Method Initialization for ArrayList with location object.
     * @param restaurant
     * @param context
     */
    public static void restaurant(ArrayList<location> restaurant, Context context){
        restaurant.add(new location(context.getString(R.string.res_na_1),
                context.getString(R.string.res_des_1),
                context.getString(R.string.res_pl_1),
                context.getString(R.string.res_tel_1),
                R.drawable.res1));
        restaurant.add(new location(context.getString(R.string.res_na_1),
                context.getString(R.string.res_des_1),
                context.getString(R.string.res_pl_1),
                context.getString(R.string.res_tel_1),
                R.drawable.res2));
        restaurant.add(new location(context.getString(R.string.res_na_1),
                context.getString(R.string.res_des_1),
                context.getString(R.string.res_pl_1),
                context.getString(R.string.res_tel_1),
                R.drawable.res3));
        restaurant.add(new location(context.getString(R.string.res_na_1),
                context.getString(R.string.res_des_1),
                context.getString(R.string.res_pl_1),
                context.getString(R.string.res_tel_1),
                R.drawable.res4));
    }
}


