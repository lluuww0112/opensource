# **opensource**
## 1. **Doc**
### project sujestion-웹툰 플랫폼 비교어플 
1. 목표

_서로 다른 웹툰 플랫폼에서 제공되는 작품들을 한 곳에 모아 정리하여 독자가 편리하게 자신이 소비할 컨텐츠를 찾도록 함._

2. 필요성

_현존하는 웹툰 서비스 플랫폼의 수가 많은 만큼 **_어느 곳에서 어느 작품들을 다루고 있는지 비교하는 것은 쉽지않다._** 독자들은 보다 다양한 작품들을 보다 간편하게 비교하길 원하므로 각기 다른 플랫폼에서 서비스되는 다양한 작품들의 정보를 한 번에 정리해주는 서비스가 필요하다._


3. 사례(비슷한 예시)
> JustWatch: 사용자가 보고자 하는 영화나 드라마를 검색하면 그 컨텐츠를 어느 서비스를 통해 볼 수 있는지에 대한 정보를 제공하는 서비스이다.

[JustWatch 링크](https://www.justwatch.com/kr)


## 2. **Src**
### Mainactivity.java

 
```java
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
```
