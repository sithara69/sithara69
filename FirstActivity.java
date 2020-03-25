package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.view.Gravity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public Button button;

    TextView Number1, Number2;
    EditText num1, num2;
    Button OK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Number1 = (TextView) findViewById(R.id.textView1);
        Number2 = (TextView) findViewById(R.id.textView2);

        num1 = (EditText) findViewById(R.id.editText1);
        num2 = (EditText) findViewById(R.id.editText2);

        OK = (Button) findViewById(R.id.button1);
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("s1", s1);
                intent.putExtra("s2", s2);
                startActivity(intent);
            }
        });
    }

    ;


    public void displayToast(View v) {
        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);

    }
}
