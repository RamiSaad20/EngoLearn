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

public class PresentC extends AppCompatActivity {
    private AdView mAdView;

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
        startTxt.setText("زمن المضارع المستمر");
        startTxt.setTextColor(getResources().getColor(R.color.txtPresent)); // this is the right way to set color to your txt

        /**
         * this is all subject txt " allTXT"
         */
        TextView allTxt = (TextView)findViewById(R.id.all_txt);
        allTxt.setText(R.string.present_cc);

        /**
         * this is what happen when click on txt button
         */

        TextView bbb = (TextView)findViewById(R.id.link_ex);
        bbb.setText("الكلمات");
        bbb.setBackground(getResources().getDrawable(R.drawable.edt_links));
        bbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(PresentC.this,SavingWordsInPresentC.class);
                startActivity(ii);
            }
        });

        /**
         * txt after exampels
         */
        TextView afterX = (TextView)findViewById(R.id.after_ex);
        afterX.setText(R.string.present_ccc);

        /// img View to go back

        ImageView goBack = (ImageView)findViewById(R.id.go_back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kk = new Intent(PresentC.this,MainActivity.class);
                startActivity(kk);
            }
        });

        /// top icons "examples" button
        TextView am = (TextView)findViewById(R.id.example);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(PresentC.this,TopPresentC.class);
               startActivity(intent);
            }
        });
    }
}
