package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstScreen extends AppCompatActivity {

    private Button myBestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBestButton = (Button) findViewById(R.id.button);
        myBestButton.setBackgroundColor(Color.BLACK);
        myBestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity();
            }
        });
    }

    public void startActivity() {
        Intent intent = new Intent(this, SecondScreen.class);
        startActivity(intent);
    }
}