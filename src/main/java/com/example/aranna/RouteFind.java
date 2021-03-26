package com.example.aranna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RouteFind extends AppCompatActivity {

    ImageView mainImageView;
    TextView title;

    String data1;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_find);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title);

        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1")
            && getIntent().hasExtra("data2")) {

            data1 = getIntent().getStringExtra("data1");
            myImage = getIntent().getIntExtra("myImage", 1);
        }
    }

    private void setData() {
        title.setText(data1);
        mainImageView.setImageResource(myImage);
    }
}

