package com.solu.daewha.surveillant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by zino on 2017-10-13.
 */

public class IntroActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intro);
    }

    public void next(View view){
        Intent intent = new Intent( this, MainActivity.class );
        startActivity(intent);
    }

}
