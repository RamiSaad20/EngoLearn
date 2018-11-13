package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopFutureS extends AppCompatActivity {
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

        examples.add(new Example("I am going to paint my bedroom tomorrow","سأطلي غرفة البدروم غدا"));
        examples.add(new Example("Watch out you are going to hurt your self","إنتبه ستؤذي نفسك"));
        examples.add(new Example("according to weather report ,it will be cloudy tomorrow","تبعا لتقرير النشرة الجوية فإنه ستصبح السماء مكثفة بالغيوم غدا"));
        examples.add(new Example("I won't leave until I've seen the manager","لن أغادر قبل أن أري المدير"));
        examples.add(new Example("Shall we go to the cinema tonight?","هل سنذهب للسينما الليله"));
        examples.add(new Example("Will you marry me?","هل ستتزوجني ؟"));
        examples.add(new Example("You will do exactly as I say","ستفعل بالضبط مثلما أقول"));
        examples.add(new Example("She will travel to Cairo next week","هي سوف تسافر الى القاهره الأسبوع القادم"));
        examples.add(new Example("He will not be able to celebrate his birthday next week as he is so sick.","لن يتمكن من الاحتفال بعيد ميلاده الأسبوع المقبل لأنه مريض للغاية."));
        examples.add(new Example("She is going to visit us tomorrow","ستزورنا غداً"));
        examples.add(new Example("Don’t worry, I‘ll take care of myself.","لا تقلق ، سأهتم بنفسي"));
        examples.add(new Example("The year 2019 will be a very interesting year.","سيكون عام 2019 عام مثير للأهتمام"));
        examples.add(new Example("The year 2019 is going to be a very interesting year.","سيكون عام 2019 عام مثير للأهتمام"));
        examples.add(new Example("As soon as you send me an Email with all instructions,\n I will send you other personal information."
                ,"بمجرد أن ترسل لي رسالة بالبريد الإلكتروني تحتوي على جميع التعليمات ، \nسأرسل لك معلومات شخصية أخرى."));
        examples.add(new Example("You will never help him.","لن تساعده أبداً"));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
