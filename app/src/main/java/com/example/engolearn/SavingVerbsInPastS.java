package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class SavingVerbsInPastS extends AppCompatActivity {
    private AdView mAdView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

      final  ArrayList<Word> words = new ArrayList<Word>();
      words.add(new Word("fought - قاتل","fight - يقاتل"));
        words.add(new Word("found - وجد","find - يجد"));
        words.add(new Word("fled - هرب","flee - يهرب"));
        words.add(new Word("flew - طار","fly - يطير"));
        words.add(new Word("forgot - نسي","forget ينسي"));
        words.add(new Word("froze - تجمد","freeze - يتجمد"));
        words.add(new Word("gave - أعطي","give - يعطي"));
        words.add(new Word("went - ذهب","go - يذهب"));
        words.add(new Word("علق _ hung","يعلّق - hang"));
        words.add(new Word("heard - سمع","hear - يسمع"));
        words.add(new Word("held - مسك","hold - يمسك"));
        words.add(new Word("knew _ عرف","know _ يعرف"));
        words.add(new Word("sat _ جلس","sit _ يجلس"));
        words.add(new Word("slept _ نام","sleep _ ينام"));
        words.add(new Word("spoke _ تكلم","speak _ يتكلم"));
        words.add(new Word("stood _ وقف","stand _ يقف"));
        words.add(new Word("stole _ سرق","steal _ يسرق"));
        words.add(new Word("swung _ تأرجح","swing _ يتأرجح"));
        words.add(new Word("took _ أخذ","take _ يأخذ"));
        words.add(new Word("taught _ درس","teach _ يدرس"));
        words.add(new Word("told _ أخبر","tell _ يخبر"));
        words.add(new Word("threw _ رمى","throw _ يرمي"));
        words.add(new Word("woke _ أستيقظ","wake _ يستيقظ"));
        words.add(new Word("wrote _ كتب","write _ يكتب"));
        words.add(new Word("broke _ كسر","break _ يكسر"));
        words.add(new Word("brought _ حضر","bring _ يحضر"));
        words.add(new Word("bought _ أشترى","buy _ يشتري"));
        words.add(new Word("caught _ مسك","catch _ يمسك"));
        words.add(new Word("built _ بنى","build _ يبني"));
        words.add(new Word("cost _ كلف","cost _ يكلف"));
        words.add(new Word("cut _ قطع","cut _ يقطع"));
        words.add(new Word("ate _ أكل","eat _ يأكل"));
        words.add(new Word("saw _ رأى","see _ يرى"));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
