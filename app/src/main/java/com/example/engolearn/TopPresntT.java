package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopPresntT extends AppCompatActivity {

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final ArrayList<Example> examples = new ArrayList<Example>();
        examples.add(new Example("My watch has stopped.", "ساعتي قد توقفت."));
        examples.add(new Example("I have lost my book.", "لقد فقدت كتابي."));
        examples.add(new Example("My brother has not received my letter.", "أخي لم يستلم خطابي."));
        examples.add(new Example("I have finished my lunch.", "لقد انتهيت من تناول الغداء."));
        examples.add(new Example("The train has arrived.", "القطار قد وصل."));
        examples.add(new Example("He has bought a car.", "لقد اشتري سياره."));
        examples.add(new Example("Tina has been missing since Monday.", "تينا مفقوده منذ يوم الأثنين."));
        examples.add(new Example("We have known each other for a long time.", "لقد عرفنا بعضنا لفتره طويله."));
        examples.add(new Example("He has already got two tickets.", "لديه بالفعل تذكرتين."));
        examples.add(new Example("I haven't asked her yet.", "أنا لم أسألها بعد."));
        examples.add(new Example("She has just eaten her lunch.", "لقد اكلت طعامها للتو."));
        examples.add(new Example("I have been to USA two times.", "لقد كنت في الولايات المتحده الأمريكيه مرتين."));
        examples.add(new Example("I've been awake since half past four this morning.", "لقد استيقظت منذ الرابعد والنصف هذا الصباح."));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
