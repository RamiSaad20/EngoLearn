package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopPresentC extends AppCompatActivity {

    private  AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final ArrayList<Example> examples = new ArrayList<Example>();
        examples.add(new Example("I'm reading a book right now.","أنا أقرا كتاب الآن."));
        examples.add(new Example("She is taking a shower at the moment.","هي تاخد شاور في هذه اللحظه."));
        examples.add(new Example("He is playing very well today.","هو يلعب جيد جدا اليوم."));
        examples.add(new Example("I'm leaving tomorrow.","أنا أغادر غداً (حدث في المستقبل القريب في ميعاد محدد)"));
        examples.add(new Example("Look! it's raining.","أنظر! إنها تمطر"));
        examples.add(new Example("Be quite! I'm trying to study.","كن هادئاً! أنا أحاول أن أذاكر"));
        examples.add(new Example("I'm playing golf regularly these days","أنا ألعب جولف بشكل منتظم هذه الأيام (عاده مؤقته)"));
        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
