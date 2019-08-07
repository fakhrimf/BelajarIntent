package com.pwpb.belajarintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEx = findViewById(R.id.explicit);
        btnEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exClick();
            }
        });
        Button btnIm = findViewById(R.id.implicit);
        btnIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imClick();
            }
        });
    }

    public void exClick(){
        Intent intent = new Intent(MainActivity.this, intentActivity.class);
        startActivity(intent);
    }

    public void imClick(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
        startActivity(intent);
    }
}
