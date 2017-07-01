package com.example.cyber.tnguid;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cyber on 6/29/17.
 */
public class coffee {
    /**
     * Method Initialization for ArrayList with location object.
     * @param coffee ArrayList of Location
     * @param context get text from string.xml
     */

    public static void coffee_shop(ArrayList<location> coffee, Context context){
        coffee.add(new location(context.getString(R.string.co_na_1),
                context.getString(R.string.co_des_1),
                context.getString(R.string.co_pl_1),
                context.getString(R.string.co_tel_1),
                R.drawable.co1));
        coffee.add(new location(context.getString(R.string.co_na_2),
                context.getString(R.string.co_des_2),
                context.getString(R.string.co_pl_2),
                context.getString(R.string.co_tel_2),
                R.drawable.co2));
        coffee.add(new location(context.getString(R.string.co_na_3),
                context.getString(R.string.co_des_3),
                context.getString(R.string.co_pl_3),
                context.getString(R.string.co_tel_3),
                R.drawable.co3));
        coffee.add(new location(context.getString(R.string.co_na_4),
                context.getString(R.string.co_des_4),
                context.getString(R.string.co_pl_4),
                context.getString(R.string.co_tel_4),
                R.drawable.co4));
        coffee.add(new location(context.getString(R.string.co_na_1),
                context.getString(R.string.co_des_1),
                context.getString(R.string.co_pl_1),
                context.getString(R.string.co_tel_1),
                R.drawable.co1));
        coffee.add(new location(context.getString(R.string.co_na_2),
                context.getString(R.string.co_des_2),
                context.getString(R.string.co_pl_2),
                context.getString(R.string.co_tel_2),
                R.drawable.co2));
        coffee.add(new location(context.getString(R.string.co_na_3),
                context.getString(R.string.co_des_3),
                context.getString(R.string.co_pl_3),
                context.getString(R.string.co_tel_3),
                R.drawable.co3));
        coffee.add(new location(context.getString(R.string.co_na_4),
                context.getString(R.string.co_des_4),
                context.getString(R.string.co_pl_4),
                context.getString(R.string.co_tel_4),
                R.drawable.co4));
    }
}
