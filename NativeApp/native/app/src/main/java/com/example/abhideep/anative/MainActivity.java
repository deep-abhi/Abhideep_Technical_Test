package com.example.abhideep.anative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.example1.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity {

    public Button onclickBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclickBtn = (Button) findViewById(R.id.unityButton) ;
    }
    public void openUnity(View v){
        Intent intentObj = new Intent(MainActivity.this,UnityPlayerActivity.class);
        startActivity(intentObj);
    }
}
