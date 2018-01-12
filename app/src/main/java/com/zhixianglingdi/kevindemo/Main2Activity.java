package com.zhixianglingdi.kevindemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
public static void start(Context context) {
    Intent starter = new Intent(context, Main2Activity.class);
    context.startActivity(starter);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void kevin2(View view) {

        Log.i("Kevin-----",PerSon2.getINSTANCE().getActivity().getClass().getName());

    }
}
