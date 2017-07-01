package com.example.cyber.tnguid;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by cyber on 6/30/17.
 */
public class sightseeing {
    /**
     * Method Initialization for ArrayList with location object.
     * @param sights
     * @param context
     */
    public static void sights(ArrayList<location> sights, Context context) {
        sights.add(new location(context.getString(R.string.seg_na_1),
                context.getString(R.string.seg_des_1),
                context.getString(R.string.seg_pl_1),
                context.getString(R.string.seg_tel_1),
                R.drawable.seg1));
        sights.add(new location(context.getString(R.string.seg_na_1),
                context.getString(R.string.seg_des_1),
                context.getString(R.string.seg_pl_1),
                context.getString(R.string.seg_tel_1),
                R.drawable.seg2));
        sights.add(new location(context.getString(R.string.seg_na_1),
                context.getString(R.string.seg_des_1),
                context.getString(R.string.seg_pl_1),
                context.getString(R.string.seg_tel_1),
                R.drawable.seg3));
        sights.add(new location(context.getString(R.string.seg_na_1),
                context.getString(R.string.seg_des_1),
                context.getString(R.string.seg_pl_1),
                context.getString(R.string.seg_tel_1),
                R.drawable.seg4));
    }
}
