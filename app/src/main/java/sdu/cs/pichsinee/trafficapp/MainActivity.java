package sdu.cs.pichsinee.trafficapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    Button moreinfoButton,aboutmeButton;
    ListView listView;
    int[] ints = new int[]{R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04,
            R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
            R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
            R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_19, R.drawable.traffic_20};

    String[] titleStrings, detailStrings, subStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร JAVA กับ XML
        moreinfoButton = findViewById(R.id.btn_moreinfo);
        aboutmeButton = findViewById(R.id.btn_aboutme);
        listView = findViewById(R.id.listview);

        //Get ค่าจาก DB ที่ไฟล์ my_context มาแสดงผล
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        //ทำการ SubString detail ตัดคำใน detail ให้เหลือ 20 char
        subStrings = new String[detailStrings.length];
        for (int i = 0; i < detailStrings.length; i++) {
            subStrings[i] = detailStrings[i].substring(0, 20)+"...";
        }

        //แสดงผลบน Listview
            MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints, titleStrings, subStrings);
        listView.setAdapter(myAdapter);


        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutmeIntent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(aboutmeIntent);
            }
        });

        moreinfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreinfoIntent = new Intent(Intent.ACTION_VIEW);
                moreinfoIntent.setData(Uri.parse("https://www.dlt.go.th/th/"));
                startActivity(moreinfoIntent);
            }
        });
    }//end onCreate() method
}//end Class
