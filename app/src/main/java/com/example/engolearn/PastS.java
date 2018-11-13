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

public class PastS extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elmawdo3);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView stTxt = (TextView) findViewById(R.id.txt_start);
        stTxt.setText(R.string.past_s);
        stTxt.setTextColor(getResources().getColor(R.color.txtPast));

        TextView allSub = (TextView) findViewById(R.id.all_txt);
        allSub.setText(R.string.past_ss);

        TextView linkV = (TextView) findViewById(R.id.link_ex);
        linkV.setText("الأفعال");
        linkV.setBackground(getResources().getDrawable(R.drawable.edt_links));
        linkV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(PastS.this, SavingVerbsInPastS.class);
                startActivity(ii);
            }
        });


        TextView afterEX = (TextView) findViewById(R.id.after_ex);
        afterEX.setText(R.string.past_sss);


        ImageView goBack = (ImageView) findViewById(R.id.go_back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kk = new Intent(PastS.this, MainActivity.class);
                startActivity(kk);
            }
        });

        /// top icons "examples" button
        TextView am = (TextView) findViewById(R.id.example);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(PastS.this,TopPastS.class);
                startActivity(tt);
            }
        });
    }
}
