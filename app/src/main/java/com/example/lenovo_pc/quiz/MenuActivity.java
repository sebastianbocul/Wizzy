package com.example.lenovo_pc.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button quit;
    Button xizzy;
    Button zizzy;
    Button yizzy;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        quit = (Button)findViewById(R.id.quit);
        zizzy = (Button)findViewById(R.id.zizzy);
        yizzy = (Button) findViewById(R.id.yizzy);
        xizzy = (Button) findViewById(R.id.xizzy);

        zizzy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toyy = new Intent(MenuActivity.this,zizzy.class);
                startActivity(toyy);
            }


        });


        yizzy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activ = new Intent(MenuActivity.this, yizzy.class);
                startActivity(activ);
            }
        });


        quit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               // finish();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }


        });

        xizzy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent opcje = new Intent(MenuActivity.this, xizzy.class);
                startActivity(opcje);
            }
        });


    }
}
