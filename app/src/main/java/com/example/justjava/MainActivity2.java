package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private Button order1;
    private TextView placed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        order1=(Button)findViewById(R.id.button);
        placed=(TextView)findViewById(R.id.placed);

        order1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placed.setText("Your order is placed successfully");
            }
        });
    }
}