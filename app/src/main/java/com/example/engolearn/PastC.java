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

public class PastC extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elmawdo3);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView startTxt = (TextView)findViewById(R.id.txt_start);
        startTxt.setText(R.string.past_c);
        startTxt.setTextColor(getResources().getColor(R.color.txtPast));

        TextView allTxt = (TextView)findViewById(R.id.all_txt);
        allTxt.setText(R.string.past_cc);

        TextView afterE = (TextView)findViewById(R.id.after_ex);
        afterE.setText(R.string.past_ccc);

        ImageView goBack = (ImageView)findViewById(R.id.go_back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PastC.this,MainActivity.class);
                startActivity(intent);
            }
        });

        TextView am = (TextView)findViewById(R.id.example);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(PastC.this,TopPastC.class);
                startActivity(tt);
            }
        });
    }
}
