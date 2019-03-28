package com.example.lenovo_pc.quiz;

import android.media.Image;
import android.media.ImageWriter;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


public class grat extends AppCompatActivity {

    Button quit;
    private TextView score;
    ImageView gwiazdka_on_1;
    ImageView gwiazdka_on_2;
    ImageView gwiazdka_on_3;
    ImageView gwiazdka_on_4;
    ImageView gwiazdka_on_5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grat);

       /* Intent mIntent = getIntent();
        int mScore = mIntent.getIntExtra("mScore", 0);
*/      gwiazdka_on_1 = (ImageView)findViewById(R.id.gwiazdka_on_1);
        gwiazdka_on_2 = (ImageView)findViewById(R.id.gwiazdka_on_2);
        gwiazdka_on_3 = (ImageView)findViewById(R.id.gwiazdka_on_3);
        gwiazdka_on_4 = (ImageView)findViewById(R.id.gwiazdka_on_4);
        gwiazdka_on_5 = (ImageView)findViewById(R.id.gwiazdka_on_5);
        Intent mIntent = getIntent();
        int mscore = mIntent.getIntExtra("MY_KEY", 0);


        quit = (Button)findViewById(R.id.quit);
        score = (TextView)findViewById(R.id.score);
        updateScore(mscore);
        if(mscore==0)
        {
                gwiazdka_on_1.setVisibility(View.INVISIBLE);
                gwiazdka_on_2.setVisibility(View.INVISIBLE);
                gwiazdka_on_3.setVisibility(View.INVISIBLE);
                gwiazdka_on_4.setVisibility(View.INVISIBLE);
                gwiazdka_on_5.setVisibility(View.INVISIBLE);
        }
        if(mscore==1)
        {
            gwiazdka_on_1.setVisibility(View.VISIBLE);
            gwiazdka_on_2.setVisibility(View.INVISIBLE);
            gwiazdka_on_3.setVisibility(View.INVISIBLE);
            gwiazdka_on_4.setVisibility(View.INVISIBLE);
            gwiazdka_on_5.setVisibility(View.INVISIBLE);
        }
        if(mscore==2)
        {
            gwiazdka_on_1.setVisibility(View.VISIBLE);
            gwiazdka_on_2.setVisibility(View.VISIBLE);
            gwiazdka_on_3.setVisibility(View.INVISIBLE);
            gwiazdka_on_4.setVisibility(View.INVISIBLE);
            gwiazdka_on_5.setVisibility(View.INVISIBLE);
        }
        if(mscore==3)
        {
            gwiazdka_on_1.setVisibility(View.VISIBLE);
            gwiazdka_on_2.setVisibility(View.VISIBLE);
            gwiazdka_on_3.setVisibility(View.VISIBLE);
            gwiazdka_on_4.setVisibility(View.INVISIBLE);
            gwiazdka_on_5.setVisibility(View.INVISIBLE);
        }

        if(mscore==4)
        {
            gwiazdka_on_1.setVisibility(View.VISIBLE);
            gwiazdka_on_2.setVisibility(View.VISIBLE);
            gwiazdka_on_3.setVisibility(View.VISIBLE);
            gwiazdka_on_4.setVisibility(View.VISIBLE);
            gwiazdka_on_5.setVisibility(View.INVISIBLE);
        }

        if(mscore==5)
        {
            gwiazdka_on_1.setVisibility(View.VISIBLE);
            gwiazdka_on_2.setVisibility(View.VISIBLE);
            gwiazdka_on_3.setVisibility(View.VISIBLE);
            gwiazdka_on_4.setVisibility(View.VISIBLE);
            gwiazdka_on_5.setVisibility(View.VISIBLE);
        }

        quit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toyy = new Intent(grat.this,MenuActivity.class);
                startActivity(toyy);
            }
        });
    }


    private void updateScore(int point){
        score.setText("" + point);
    }
}
