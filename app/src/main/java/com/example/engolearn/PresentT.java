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

public class PresentT extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elmawdo3);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //////// startTxt

        TextView startTxt = (TextView)findViewById(R.id.txt_start);
        startTxt.setText("زمن المضارع التام");
        startTxt.setTextColor(getResources().getColor(R.color.txtPresent));

        /**
         * all subject txt
         */
        TextView allSub = (TextView)findViewById(R.id.all_txt);
        allSub.setText(R.string.present_tt);

        /**
         * link txt
         */

        TextView linkEx = (TextView)findViewById(R.id.link_ex);
        linkEx.setText("الكلمات");
        linkEx.setBackground(getResources().getDrawable(R.drawable.edt_links));
        linkEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(PresentT.this,SavingWordsInPresentT.class);
                startActivity(ii);
            }
        });

        /**
         * after all txt
         */

        TextView aterEx = (TextView)findViewById(R.id.after_ex);
        aterEx.setText(R.string.present_ttt);

        /// img View to go back

        ImageView goBack = (ImageView)findViewById(R.id.go_back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kk = new Intent(PresentT.this,MainActivity.class);
                startActivity(kk);
            }
        });

        /// top icons "examples" button
        TextView am = (TextView)findViewById(R.id.example);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent top = new Intent(PresentT.this,TopPresntT.class);
                startActivity(top);
            }
        });


    }
}
