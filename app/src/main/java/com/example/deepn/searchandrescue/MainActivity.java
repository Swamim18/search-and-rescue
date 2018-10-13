package com.example.deepn.searchandrescue;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/AbrilFatface-Regular.otf");
        textView.setTypeface(typeface);
}
