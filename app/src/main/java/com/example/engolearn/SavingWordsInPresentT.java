package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class SavingWordsInPresentT extends AppCompatActivity {
    private AdView mAdView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("since","منذ"));
        words.add(new Word("for","لمدة"));
        words.add(new Word("already","مسبقاً"));
        words.add(new Word("yet","بعد- حتى الآن"));
        words.add(new Word("ever","من قبل"));
        words.add(new Word("never","أبداً"));
        words.add(new Word("lately","مؤخراً"));
        words.add(new Word("recently","حديثاً"));
        words.add(new Word("just","للتوّ"));
        words.add(new Word("So far","حتى الآن"));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
