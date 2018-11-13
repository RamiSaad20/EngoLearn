package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopFutureT extends AppCompatActivity {
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

        examples.add(new Example("I will have finished my work before you arrive","سأكون قد إنتهيت من عملي قبل أن تأتي"));
        examples.add(new Example("She will have left by the time her parents get here","ستكون قد غادرت في الوقت الذي يأتي والديها فيه"));
        examples.add(new Example("I will graduate in June.I will see you in July","سوف أتخرج في شهر جون. وسأراك في شهر جولاي (يوليو)"));
        examples.add(new Example("By the next time I see you I will have graduated","في المرة القادمة التي سأرها فيك سأكون قد تخرجت"));
        examples.add(new Example("I will have finished my homework by the time I go out tonight","سأكون قد انتهيت من واجبي المنزلي في الوقت الذي سأخرج فيه الليلة"));
        examples.add(new Example("They will have been married for a year on January 2019","سيكونا قد امضيا عاماً من الزواج بحلول العشرين من شهر يناير 2019م"));
        examples.add(new Example("By next year, he will have graduated from university"," بحلول العام القادم، سوف يكون قد تخرج من الجامعة"));
        examples.add(new Example("I shall / will have had my supper by 8 o’clock","سوف اكون قد انتهيت من تناول العشاء فى الثامنة"));
        examples.add(new Example("The thieves will have spent all the money before we catch them","الحرامية راح يصرفو كل الفلوس قبل مانقبض عليهم"));
        examples.add(new Example("The guests will have arrived at the hotel by now","الضيوف حيكونو وصلو الفندق الحين"));
        examples.add(new Example("Don’t worry. They won’t have arrived at my house before I get there","لا تقلق . ماراح يكونو وصلو لبيتي قبل ما اوصل هناك"));
        examples.add(new Example("I will not have started cleaning the house until tomorrow","ما راح اكون بدأت نظافة البيت حتى بكرة"));
        examples.add(new Example("Will you have saved enough to buy a car by the summer?","هل راح تكون جمعت مبلغ كافي لشراء سيارة قبل الصيف ؟"));
        examples.add(new Example("Will you have finished it by the time I come back?","هل ستكون انتهيت قبل ما ارجع ؟"));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
