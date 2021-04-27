package com.milkywaylhy.ex27activit2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etname;
    EditText etage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname= findViewById(R.id.et_name);
        etage= findViewById(R.id.et_age);

    }

    public void clickBtn(View view) {
        String name= etname.getText().toString();
        int age= Integer.parseInt(etage.getText().toString());

        //second activity를 실행시켜줄 택배기사(Intent) 객체가 필요
        Intent intent= new Intent(this,SecondActivity.class);

        //택배기사에게 데이터를 가지고 가도록..
        intent.putExtra("name",name);
        intent.putExtra("age",age);
        startActivity(intent);
    }
}