package com.example.a1_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setBackgroundColor(Color.BLUE);

        TextView today = (TextView)findViewById(R.id.dateText);

        SimpleDateFormat data = new SimpleDateFormat("'   Date\n' dd-MM-yyyy '\n   Time\n  ' HH:mm");
        String currentDate = data.format(new Date());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                today.setText(currentDate);
                if (today.getVisibility()==View.INVISIBLE){
                    today.setVisibility(View.VISIBLE);
                    btn.setText("HIDE DATE");
                } else {
                    today.setVisibility(View.INVISIBLE);
                    btn.setText("SHOW DATE");
                }



            }
        });

    }
}