package com.example.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button in;
    private Button de;
    private Button  order;
    private TextView quantity;
    private TextView prize;
    private int p;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count+=1;
                compute();
                quantity.setText(String.valueOf(count));
                prize.setText(String.valueOf(p));
            }
        });
        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count-=1;
                if(count<0)
                {count=0;}
                compute();
                quantity.setText(String.valueOf(count));
                prize.setText(String.valueOf(p));
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });

    }


    private void setupUIView(){
        in=(Button)findViewById(R.id.in);
        de=(Button)findViewById(R.id.de);
        order=(Button)findViewById(R.id.order);
        quantity=(TextView)findViewById(R.id.quantity);
        prize=(TextView)findViewById(R.id.prize);


    }
    private void compute(){
        p=count*100;
    }

}