package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopPastC extends AppCompatActivity {

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

        examples.add(new Example("I was eating dinner when Sami called me","حينما دعاني سامي كنت أتناول العشاء"));
        examples.add(new Example("While they were playing tennis it rained","لقد أمطرت حينما كانوا يلعبون التنس"));
        examples.add(new Example("I was walking home when I met Mosa","لقد قابلت موسى حينما كنت ماشيا للمنزل"));
        examples.add(new Example("This time last year I was living In Brazil","في نفس هذا الوقت من السنة الماضية كنت أعيش في البرازيل"));
        examples.add(new Example("At eight O’clock last night I was studying","في الساعة الثامنة تماما ليلة البارحة كنت أذاكر"));
        examples.add(new Example("It was snowing","انها كانت تثلج"));
        examples.add(new Example("The cat was sleeping while I was eating","القطه كانت نائمه بينما كنت أكل"));
        examples.add(new Example("She was not eating when he called","هي لم تكن تأكل عندما اتصل"));
        examples.add(new Example("All last week, I was preparing for the exam","طوال الأسبوع الماضي كنت أستعد للإختبار"));
        examples.add(new Example("When Dad called me, I was washing the car","عندما دعاني أبي كنت أغسل السياره"));
        examples.add(new Example("What were you doing when you broke your hand?","ماذا كنت تفعل عندما كسرت يدك ؟"));
        examples.add(new Example("I was playing basketball","كنت ألعب كرة السله (أجابه السؤال)"));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
