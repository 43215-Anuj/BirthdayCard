package com.example.anuj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv=findViewById(R.id.textView);
        Bundle bundle=getIntent().getExtras();

        if(bundle==null)
        {
            return;
        }
        String ThisName=bundle.getString("Name");
        tv.setText(ThisName);
    }
}
