package com.example.android.travel_isfahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sightEntrance = (ImageView) findViewById(R.id.sight);


        sightEntrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sightsIntent = new Intent(MainActivity.this, Sight.class);
                startActivity(sightsIntent);
            }
        });




    }
}
