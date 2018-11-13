package com.example.engolearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class PastT extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elmawdo3);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView stTxt = (TextView)findViewById(R.id.txt_start);
        stTxt.setText(R.string.past_t);
        stTxt.setTextColor(getResources().getColor(R.color.txtPast));

        TextView allTxt = (TextView)findViewById(R.id.all_txt);
        allTxt.setText(R.string.past_tt);

        TextView afterEx = (TextView)findViewById(R.id.after_ex);
        afterEx.setText(R.string.past_ttt);

        ImageView goBack = (ImageView)findViewById(R.id.go_back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PastT.this,MainActivity.class);
                startActivity(i);
            }
        });

        TextView examples = (TextView)findViewById(R.id.example);
        examples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(PastT.this,TopPastT.class);
                startActivity(tt);
            }
        });
    }
}
