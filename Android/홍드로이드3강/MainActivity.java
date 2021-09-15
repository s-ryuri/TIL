package com.example.thirdclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button nate_button;
    private Button emer_button;
    private Button galley_button;
    private Button finish_button;
    private Button move_button;
    private EditText et_test;
    private String str;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nate_button = (Button) findViewById(R.id.nate_button);
        emer_button = (Button) findViewById(R.id.emer_button);
        galley_button = (Button) findViewById(R.id.galley_button);
        finish_button = (Button) findViewById(R.id.finish_button);
        move_button = (Button) findViewById(R.id.move_btn);
        et_test = (EditText) findViewById(R.id.et_text);



        nate_button.setBackgroundColor(Color.GRAY);
        emer_button.setBackgroundColor(Color.GREEN);
        galley_button.setBackgroundColor(Color.RED);
        finish_button.setBackgroundColor(Color.YELLOW);

        nate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com/"));
                startActivity(mIntent);
            }
        });

        emer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });
        galley_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        finish_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        move_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this,subActivity.class);
                intent.putExtra("str",str);
                startActivity(intent);

            }
        });
    }
}
