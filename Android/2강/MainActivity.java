package com.example.please;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_id;
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 생명주기
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_id = (EditText) findViewById(R.id.et_id); //숨을 불어 넣어줌
        btn_test = (Button) findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //클릭을 했을 때 action을 취함
                et_id.setText("위성률짱짱맨"); //뭔가를 써주고 싶을 때 동적으로
                // 버튼을 클릭하면 이걸 써
            }
        });

    }
}
