package sdu.cs.pichsinee.trafficapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    //Explicit
    TextView titleTextView, detailTextView;
    ImageView iconImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ผูกตัวแปร JAVA กับ XML
        titleTextView = findViewById(R.id.tvTitle);
        detailTextView = findViewById(R.id.tvDetail);
        iconImageView = findViewById(R.id.imvIcon);
        backButton = findViewById(R.id.btBack);

        //แสดงผลบนหน้าแอปโดยรับค่าจากการ Intent
        

    }//end onCreate() method
}//end class
