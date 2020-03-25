package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity<str1> extends AppCompatActivity {
    TextView textView1,textView2,textView3;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = (TextView)findViewById(R.id.textView3);
        textView2 = (TextView)findViewById(R.id.textView4);
        textView3 = (TextView)findViewById(R.id.textView5);

        btn1 = (Button)findViewById(R.id.button2);
        btn2 = (Button)findViewById(R.id.button3);
        btn3 = (Button)findViewById(R.id.button4);
        btn4 = (Button)findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a1 = Double.valueOf(textView1.getText().toString());
                double a2 = Double.valueOf(textView2.getText().toString());
                double a3;
                a3 = a1 + a2;
                textView3.setText(String.valueOf(a3));

            }
        });

        Intent intent=getIntent();
        String str1=intent.getStringExtra("s1");
        String str2=intent.getStringExtra("s2");
        StringBuffer sb=new StringBuffer();
        sb.append(str1).append(str2);
        textView1.setText(sb);
        textView2.setText(sb.reverse());




    }
}