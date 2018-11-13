package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopPastT extends AppCompatActivity {

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        MobileAds.initialize(this, "ca-app-pub-2905685190226847~4351934202");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ArrayList<Example> examples = new ArrayList<Example>();

        examples.add(new Example("He had learned English before he went to England","لقد تعلم اللغة الإنجليزية قبل أن يذهب إلى إنجلترا"));
        examples.add(new Example("After I had had my breakfast, I left for school.","بعد أن تناولت طعام الإفطار ، غادرت إلى المدرسة."));
        examples.add(new Example("When I was a child, I had studied mathematics.","بعد أن تناولت طعام الإفطار ، غادرت إلى المدرسة."));
        examples.add(new Example("I had just poured a cup of tea when the phone rang.","عندما كنت طفلاً ، كنت قد درست الرياضيات."));
        examples.add(new Example("I had finished the exercise before you came.","لقد صببت فقط كوبًا من الشاي عندما رن الهاتف."));
        examples.add(new Example("After they had gone out, I sat down and took rest.","بعد أن خرجوا ، جلست وأخذت الراحة."));
        examples.add(new Example("He thanked me for what I had done.","لقد شكرني على ما قمت به."));
        examples.add(new Example("If he had arrived yesterday, he would have met us","لو كان قد وصل أمس ، لكان قد قابلنا"));
        examples.add(new Example("I wish he had succeeded last year.","أتمنى لو أنه نجح العام الماضي."));
        examples.add(new Example("after she had come he finished his homework","بعد ان اتت هو انهى واجبه المنزلى"));
        examples.add(new Example("after they had visited us we opened the windows","after they had visited us we opened the windows"));
        examples.add(new Example("before she finished her homework he had come","قبل ان تنهى واجبها هو اتى"));
        examples.add(new Example("by the time my mother came she had called me","قبل ان تاتى امى هى اتصلت بى"));
        examples.add(new Example("she had never seen the film before","هى لم تشاهد الفيلم من قبل"));
        examples.add(new Example("they had already seen the film","هم شاهدو الفيلم بالفعل"));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
