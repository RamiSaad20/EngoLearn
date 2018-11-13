package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopPresntS extends AppCompatActivity {

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

        examples.add(new Example("You come to school late","أنتِ تأتين إلى المدرسة متأخرة"));
        examples.add(new Example("They play in the garden","هم يلعبون في الحديقة "));
        examples.add(new Example("My colleague and I go to work together","أنا وزميلي نذهب إلى العمل معاً "));
        examples.add(new Example("He does his homework","هو يقوم بعمل واجبه"));
        examples.add(new Example("Sarah goes to the library with her friend every Tuesday","سارة تذهب إلي المكتبة مع صديقتها كل ثلاثاء "));
        examples.add(new Example(" He relaxes when he meditates","هو يسترخي عندما يتأمل"));
        examples.add(new Example("She pays attention when she crosses the road","هي تنتبه عندما تعبر الطريق"));
        examples.add(new Example("My sister tidies her room before she studies","أختي تنظف غرفتها قبل أن تذاكر"));
        examples.add(new Example("Your hair dries quickly","شعرك يجف بسرعة "));
        examples.add(new Example("The merchant carries the merchandise on his shoulder","التاجر يحمل البضاعة على كتفه "));
        examples.add(new Example("Flowers bloom in spring","تتفتح الأزهار في الربيع"));
        examples.add(new Example("The trains leaves at three o’clock","يغادر القطار الساعة الثالثة"));
        examples.add(new Example("We watch the T.V every day","نحن نشاهد جهاز التلفاز يوميا"));
        examples.add(new Example("The earth goes round the sun","الأرض تدور حول الشمس"));
        examples.add(new Example("She does not like rice","هي لا تحب الأرز"));
        examples.add(new Example("She never eats rice","هي لا تأكل الأرض أبداً"));
        examples.add(new Example("never - do not - does not","تستخدم مع النفي"));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
