package com.example.engolearn;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // presentS intent
        TextView tt = (TextView) findViewById(R.id.modare3);
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent psIntent = new Intent(MainActivity.this, PresentS.class);
                startActivity(psIntent);
            }
        });

        //presentC intent
        TextView mostamer = (TextView) findViewById(R.id.mod_mostmr);
        mostamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pcIntent = new Intent(MainActivity.this, PresentC.class);
                startActivity(pcIntent);
            }
        });

        // presentT intent
        TextView presntT = (TextView) findViewById(R.id.mod_tam);
        presntT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ptIntent = new Intent(MainActivity.this, PresentT.class);
                startActivity(ptIntent);
            }
        });

        // pastS intent
        TextView pastS = (TextView) findViewById(R.id.mady_basit);
        pastS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent msIntent = new Intent(MainActivity.this, PastS.class);
                startActivity(msIntent);
            }
        });

        // pastC intent
        TextView pastC = (TextView) findViewById(R.id.mady_mostmr);
        pastC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mcIntent = new Intent(MainActivity.this, PastC.class);
                startActivity(mcIntent);
            }
        });

        // pastT intent
        TextView pastT = (TextView) findViewById(R.id.mady_tam);
        pastT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mtIntent = new Intent(MainActivity.this, PastT.class);
                startActivity(mtIntent);
            }
        });

        //futureS intent
        TextView fut = (TextView) findViewById(R.id.future_simple);
        fut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ff = new Intent(MainActivity.this, FutureS.class);
                startActivity(ff);
            }
        });

        //futureC intent
        TextView futC = (TextView) findViewById(R.id.future_cont);
        futC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cc = new Intent(MainActivity.this, FutureC.class);
                startActivity(cc);
            }
        });

        //futureT intent
        TextView futT = (TextView) findViewById(R.id.future_tam);
        futT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(MainActivity.this, FutureT.class);
                startActivity(tt);
            }
        });


        // about us intent
        TextView ab = (TextView) findViewById(R.id.about);
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kkk = new Intent(MainActivity.this, AboutUs.class);
                startActivity(kkk);
            }
        });

        /// contact Us Button
        TextView vv = (TextView) findViewById(R.id.contact);
        vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Intent.ACTION_SENDTO);
                ii.setData(Uri.parse("mailto:appdev.rami@gmail.com"));
                ii.putExtra(Intent.EXTRA_SUBJECT, "U here from EngoLearn : your NAME plz");
                ii.putExtra(Intent.EXTRA_TEXT, " ");
                Toast.makeText(MainActivity.this,"شكرا لك على مراسلتك لي",Toast.LENGTH_LONG).show();
                if (ii.resolveActivity(getPackageManager()) != null) {
                    startActivity(ii);
                }
            }
        });
    }


    /////////////// menu ///////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mShare:
                Toast.makeText(MainActivity.this,"wait update",Toast.LENGTH_LONG).show();
//                Intent i = new Intent(
//                        android.content.Intent.ACTION_SEND);
//                i.setType("text/plain");
//                i.putExtra(
//                        android.content.Intent.EXTRA_TEXT, "EngoLearn أتعلم القواعد https://drive.google.com/open?id=1SdhNXMGxT5iILU9vN3eNT-BniocSmf75");
//                startActivity(Intent.createChooser(
//                        i,
//                        "Share Via"));
                return true;

            case R.id.privacy:
                Intent p = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/note-privacy-policy-rami/home"));
                startActivity(p);

                return true;

            case R.id.rate:
                Toast.makeText(MainActivity.this,"wait update",Toast.LENGTH_LONG).show();

                return true;

            case R.id.help:
                AlertDialog.Builder bb = new AlertDialog.Builder(this);
                bb.setMessage("تطبيق سهل وبسيط لتعلم أزمنه الأنجليزيه ، \n به شرح الزمن والكلمات المستخدمه معه \n وامثله على كل زمن لتفهم أكثر تكوينه وفي أي المواقف نستخدمه \n " +
                        "\n أنتظروا التحديث القادم ،أمثله أكثر وأضافه صوت لكل مثال لتتعلم كيفية النطق الصحيح\n ENGO LEARN!!")
                        .setTitle("Help!")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //closeDialog
                            }
                        }).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
