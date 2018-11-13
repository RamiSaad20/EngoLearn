package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopPastS extends AppCompatActivity {

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final ArrayList<Example> examples = new ArrayList<Example>();

        examples.add(new Example("I went home early last night.","ذهبت إلى المنزل مبكرا في الليله الماضيه."));
        examples.add(new Example("He wrote his homework two hours ago.","كتب واجبه المنزلي منذ ساعتين."));
        examples.add(new Example("He didn't write his homework.","لم يكتب واجبه المنزلي(حالة النفي)"));
        examples.add(new Example("She saw her mother last night.","رأت أمها الليله الماضيه."));
        examples.add(new Example("She didn't see her mother last night.","لم تري أمها الليله الماضيه."));
        examples.add(new Example("they went cinema last month.","ذهبوا للسينما الشهر الماضي."));
        examples.add(new Example("they didn't go cinema last month.","لم يذهبوا للسينما الشهر الماضي(نلاحظ في حالة النفي نضيف did not ونضع الفعل في المصدر)"));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
