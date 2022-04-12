package com.example.myapplicationtesting;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    Button button;
    EditText editText;
    private static final String TAG = "MyActivity";
    private static final String MSG = "Sannan";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textview1);
        textView.setText("Hello Sannan");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonclicked();
            }
        });

    }
   public void buttonclicked()
    {
        Log.v("Hello","Thanks for the message" +
                editText.getText().toString());
    }
}