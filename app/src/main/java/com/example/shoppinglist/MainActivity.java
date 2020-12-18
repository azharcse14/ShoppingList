package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int raspberryPrice = 5;
        display1("1 box: $" + raspberryPrice);
        raspberryPrice = 10;
        display2("2 boxes: $" + (raspberryPrice));
        display3("3 boxes: $" + (raspberryPrice * 3));
    }

    public void display1(String i){
        TextView textView = findViewById(R.id.display1Tv);
        textView.setText(""+i);
    }
    public void display2(String i){
        TextView textView = findViewById(R.id.display2Tv);
        textView.setText(""+i);
    }
    public void display3(String  i){
        TextView textView = findViewById(R.id.display3Tv);
        textView.setText(""+i);
    }
}