package com.example.bruger.knowwhere;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bruger on 09-11-2018.
 */

public class CustomList extends ArrayAdapter<String> {
    //private final Activity context;
    private final String[] titles;
    private final Integer[] imageId;
    private final String[] ratings;

    public CustomList(Context context, String[] web, Integer[] imageId, String[] ratings) {
        super(context, R.layout.customlist, web);
        this.titles = web;
        this.imageId = imageId;
        this.ratings = ratings;
    }

    /*
        You need to implement a method with connection to Firebase.
        Check what kind of establishments it is
        Check ratings
        Check Name

        Make an if-statement to get the right picture
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View row = layoutInflater.inflate(R.layout.customlist, parent, false);

        TextView title = (TextView) row.findViewById(R.id.titleText);
        TextView rating = (TextView) row.findViewById(R.id.ratingsText);
        ImageView imgView = (ImageView) row.findViewById(R.id.imageView);

        title.setText(titles[position]);
        rating.setText(ratings[position]);
        imgView.setImageResource(imageId[position]);

        return row;
    }
}
