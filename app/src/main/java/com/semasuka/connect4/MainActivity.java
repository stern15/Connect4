package com.semasuka.connect4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view){

        ImageView counter=(ImageView) view;

        counter.setTranslationY(-1000f);
        counter.setImageResource(R.drawable.yellow);
        counter.animate().translationYBy(1000f).rotationBy(360).setDuration(500);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
