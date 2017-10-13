package com.example.zhangqi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView =(TextView) findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().equals("Hello git")){
                    textView.setText("HELLO GIT,change test");
                    textView.setTextColor(145524);
                }else
                    textView.setTextColor(000000);
            }
        });
    }
public int sumTest(int a,int b){
	int a = 12;
	int b = 22;
	int sum = a+b;
return sum;	
	}
}
