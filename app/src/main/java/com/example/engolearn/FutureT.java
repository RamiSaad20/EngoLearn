package com.example.engolearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FutureT extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elmawdo3);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView fs = (TextView)findViewById(R.id.txt_start);
        fs.setText(R.string.future_t);
        fs.setTextColor(getResources().getColor(R.color.txtFuture));

        TextView all = (TextView)findViewById(R.id.all_txt);
        all.setText(R.string.future_tt);

        ImageView goback = (ImageView) findViewById(R.id.go_back);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(FutureT.this,MainActivity.class);
                startActivity(ii);
            }
        });

        TextView am = (TextView) findViewById(R.id.example);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(FutureT.this,TopFutureT.class);
                startActivity(tt);
            }
        });
    }
}
