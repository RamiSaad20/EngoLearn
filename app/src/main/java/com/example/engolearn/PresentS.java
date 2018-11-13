package com.example.engolearn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class PresentS extends AppCompatActivity {
    private AdView mAdView;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elmawdo3);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        /**
         * this is name of subject "startTXT"
         */
        TextView startTxt = (TextView)findViewById(R.id.txt_start);
        startTxt.setText(R.string.presnt_s);
        startTxt.setTextColor(getResources().getColor(R.color.txtPresent));

        /**
         * this is all subject txt " allTXT"
         */
        TextView allTxt = (TextView)findViewById(R.id.all_txt);
        allTxt.setText(R.string.present_ss);

        /**
         * this is the last txt of lesson " after examples"
         */
        TextView afterEx = (TextView)findViewById(R.id.after_ex);
        afterEx.setText(R.string.present_after_ex);

        /**
         *  this is Intent call to go to SavingWords Activity
         */

        TextView examplsTxt = (TextView)findViewById(R.id.link_ex);
        examplsTxt.setText("الكلمات");
        examplsTxt.setBackground(getResources().getDrawable(R.drawable.edt_links));
        examplsTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(PresentS.this,SavingWordsInPresentS.class);
                startActivity(ii);
            }
        });

        /// img View to go back

        ImageView goBack = (ImageView)findViewById(R.id.go_back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kk = new Intent(PresentS.this,MainActivity.class);
                startActivity(kk);
            }
        });

        /// top icons "examples" button
        TextView am = (TextView)findViewById(R.id.example);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(PresentS.this,TopPresntS.class);
                startActivity(t);
            }
        });
    }


}
