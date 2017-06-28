package com.example.mlrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1  = (EditText) findViewById(R.id.et1);
        t2 = (EditText) findViewById(R.id.et2);
        t3 = (EditText) findViewById(R.id.et3);
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(t1.getText().toString());
                int b =Integer.parseInt(t2.getText().toString());
                int c = a + b;
                t3.setText(Integer.toString(c));

            }
        });



    }
}
