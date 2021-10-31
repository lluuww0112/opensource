package com.example.intent_switching_display;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;//버튼 선언(로컬)
    private EditText edit_text1;
    private EditText edit_text2;
    private String str1;
    private  String str2;

    private ImageView toast_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move); //속성 가져오기
        edit_text1 = findViewById(R.id.edit_text1);
        edit_text2 = findViewById(R.id.edit_text2);
        toast_test = findViewById(R.id.toast_test);


        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = edit_text1.getText().toString();
                str2 = edit_text2.getText().toString();
                Intent intent = new Intent(MainActivity.this, Subactivity.class);//인텐트 선언(인텐트=화면객체)
                intent.putExtra("str1", str1);//전달할 데이터 설정
                intent.putExtra("str2", str2);
                startActivity(intent); //액티비티 이동
            }
        });

        toast_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pop!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
