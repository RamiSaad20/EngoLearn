package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class SavingWordsInPresentS extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("always","دائما"));
        words.add(new Word("often","كثيرا"));
        words.add(new Word("usually","غالبا"));
        words.add(new Word("sometimes","احيانا"));
        words.add(new Word("never","ابدا"));
        words.add(new Word("ever","فى وقت ما"));
        words.add(new Word("daily","كل يوم"));
        words.add(new Word("weekly","كل أسبوع"));
        words.add(new Word("monthly","كل شهر"));
        words.add(new Word("rarely","نادرا"));
        words.add(new Word("seldom","نادرا"));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
