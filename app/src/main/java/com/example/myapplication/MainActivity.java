package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a=13;
    }
    public void onButton1(View v){
        Toast.makeText(this,"확인1버튼이눌렸다",Toast.LENGTH_LONG).show();// 작고 간단한 메시지를 잠깐 보여주는 역할을 한다.
    }

    public void Onclick2(View v){

    }
}
