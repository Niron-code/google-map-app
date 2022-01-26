package com.assignment.googlemapapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private EditText textLocation;
    private ImageButton btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLocation = (EditText) findViewById(R.id.textLocation);
        btn_search = (ImageButton) findViewById(R.id.btn_search);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = textLocation.getText().toString();

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("keylocation",location);
                startActivity(intent);
            }
        });

    }
}