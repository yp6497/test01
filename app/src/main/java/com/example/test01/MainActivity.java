package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn=(Button)findViewById(R.id.btn);
        setContentView(R.layout.activity_main);


    }

    public void go(View view) {
        String str="oh yea,i have been clicked";
        tv.setText(str);
    }
}
