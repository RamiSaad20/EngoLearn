package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class SavingWordsInPresentC extends AppCompatActivity {
    private AdView mAdView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("now","الآن"));
        words.add(new Word("at the moment","في الوقت الحالي"));
        words.add(new Word("at present","في الحاضر"));
        words.add(new Word("Look !","أنظر!"));
        words.add(new Word("Listen !", "إسمع !"));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
