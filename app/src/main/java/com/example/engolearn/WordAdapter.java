package com.example.engolearn;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_examples_in, parent, false);
        }

        Word cuWord =getItem(position);

        TextView arTxt = (TextView) listItemView.findViewById(R.id.ar_word);

        arTxt.setText(cuWord.getmArabicWord());

        ////////////////////////////////////////

        TextView enTxt = (TextView) listItemView.findViewById(R.id.en_word);
        enTxt.setText(cuWord.getmEnglishWord());



        return listItemView;
    }

}
