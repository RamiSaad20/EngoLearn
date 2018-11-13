package com.example.engolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TopFutureC extends AppCompatActivity {

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

        examples.add(new Example("I will be watching TV at six","سأكون اشاهد التلفاز عند الساعة السادسة"));
        examples.add(new Example("This time tomorrow, I will be driving to the country","في هذا الوقت من يوم غد، سأكون قائدا السيارة للمدينة"));
        examples.add(new Example("This time tomorrow, I shall be flying to Cairo","فى ذلك الوقت غدا ساكون فى الطائرة المتجهة للقاهرة"));
        examples.add(new Example("We shall be waiting for you when you get back tomorrow","نحن سنكون بانتظاركم عند عودتكم غدا"));
        examples.add(new Example("I will be waiting for you when your bus arrives","سأكون في انتظارك عند وصول حافلتك"));
        examples.add(new Example("I will be studying when all of my family sleep tonight.","سوف أدرس عندما تنام أسرتي الليلة."));
        examples.add(new Example("You will be eating dinner when she arrives home from her trip.","سوف تتناول العشاء عندما تصل إلى المنزل من رحلتها."));
        examples.add(new Example("You will not (won't) be eating dinner when she arrives home from her trip.","لن تكون تتناول العشاء عندما تصل إلى المنزل من رحلتها."));
        examples.add(new Example("I am going to be staying at the flat in downtown if anything happens and you need to contact me."
                ,"سأبقى في الشقة في وسط المدينة إذا حدث أي شيء وتحتاج إلى الاتصال بي."));
        examples.add(new Example("I will be studying at the October blue cafe tonight,\n so I will not go to the party when it starts at 9:00 PM."
                ,"سوف أدرس في المقهى الأزرق في أكتوبر ،\n لذا لن أذهب إلى الحفلة عندما تبدأ في الساعة 9:00 مساءً."));
        examples.add(new Example("Today at 2 PM, I am going to be eating lunch in the break time.","اليوم في 2:00 ، سأكون أتناول الغداء في وقت الراحة."));
        examples.add(new Example("At midnight tonight, we will still be driving through the desert.","في منتصف الليل ، سنواصل القيادة في الصحراء."));

        ExampleAdapter adapter = new ExampleAdapter(this,examples);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}