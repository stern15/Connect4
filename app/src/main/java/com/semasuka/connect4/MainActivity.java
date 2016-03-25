package com.semasuka.connect4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //0 for yellow and 1 for red
    int ActiveUser=0;
    //2 means it is an unplayed slot within the grid(2 is placeholder temporary)
    int[] gameStatus={2,2,2,2,2,2,2,2,2};

    public void dropIn(View view) {


        //here we use view only use view because the view containt an empty image so there is no id
        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());


        if (gameStatus[tappedCounter] == 2) {

            gameStatus[tappedCounter]=ActiveUser;


            //set the translation above the layout
            counter.setTranslationY(-1000f);
            if (ActiveUser == 0) {


                //we give the translation a yellow counter
                counter.setImageResource(R.drawable.yellow);
                ActiveUser = 1;
            } else {
                counter.setImageResource(R.drawable.red);

                ActiveUser = 0;
            }
            //now we animate it by the translation
            counter.animate().translationYBy(1000f).rotationBy(360).setDuration(500);

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
