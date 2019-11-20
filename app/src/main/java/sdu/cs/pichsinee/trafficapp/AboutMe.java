package sdu.cs.pichsinee.trafficapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {
    //Explicit
    TextView fbTextView, telTextView, eduTextView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        fbTextView = findViewById(R.id.tv_fb);
        fbTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW);
                fbIntent.setData(Uri.parse("https://www.facebook.com/Aj.Aom"));
                startActivity(fbIntent);
            }
        });

        telTextView = findViewById(R.id.tv_tel);
        telTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telIntent = new Intent(Intent.ACTION_DIAL);
                telIntent.setData(Uri.parse("tel:0897788708"));
                startActivity(telIntent);
            }
        });

        eduTextView = findViewById(R.id.tv_edu);
        final Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.777092,100.511408('มหาวิทยาลัยสวนดุสิต')");
        eduTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                //mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        backButton = findViewById(R.id.bt_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }//end onCreate() method
}//end class
