package com.example.engolearn;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class ExampleAdapter extends ArrayAdapter<Example> {
    public ExampleAdapter(Activity context , ArrayList<Example> examples) {
        super(context,0,examples);
    }

@Override
    public View getView (int position, View convertView, ViewGroup parent){
    // Check if the existing view is being reused, otherwise inflate the view
    View listItem = convertView;
    if(listItem == null){
        listItem = LayoutInflater.from(getContext()).inflate(
                R.layout.examples_top,parent,false
        );
    }
    Example cuExaple = getItem(position);
    TextView ar = (TextView)listItem.findViewById(R.id.ar_example);

    ar.setText(cuExaple.getmArabicEx());

    ///english//

    TextView en = (TextView)listItem.findViewById(R.id.en_example);
    en.setText(cuExaple.getmEnglishEx());

    return listItem;
}
}
