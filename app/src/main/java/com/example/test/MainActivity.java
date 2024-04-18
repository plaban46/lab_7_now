package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv;

    int val1,val2;

    Button bt1,bt2,bt3,bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editTextTextPersonName);
        et2 = findViewById(R.id.editTextTextPersonName2);
        tv = findViewById(R.id.textView2);

        bt1 = findViewById(R.id.button5);
        bt2 = findViewById(R.id.button6);
        bt3 = findViewById(R.id.button7);
        bt4 = findViewById(R.id.button8);
        addFunction();



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("1");
                et2.setText("2");
                //tv.setText("Hello");

                val1 = Integer.parseInt(et1.getText().toString());
                val2 = Integer.parseInt(et2.getText().toString());
                tv.setText(""+(val1+val2));
            }
        });
    }

    private void addFunction() {
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //val1 = Integer.parseInt(et1.getText().toString());
                //val2 = Integer.parseInt(et2.getText().toString());
                //tv.setText("Result is : "+(val1+val2));

            }
        });
    }

    private void subFunction() {

    }

    private void mulFunction() {

    }

    private void divFunction() {

    }


}