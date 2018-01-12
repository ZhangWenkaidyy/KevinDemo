package com.zhixianglingdi.kevindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PerSon2.getINSTANCE().setName("asd");
        PerSon2.getINSTANCE().setActivity(this);


    }

    public void kevin(View view) {
        Main2Activity.start(MainActivity.this);
        finish();
    }
}
