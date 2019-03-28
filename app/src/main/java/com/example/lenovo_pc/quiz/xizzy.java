package com.example.lenovo_pc.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class xizzy extends AppCompatActivity {

    Button quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);



        quit = (Button) findViewById(R.id.quit);

        quit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toyy = new Intent(xizzy.this,MenuActivity.class);
                startActivity(toyy);
            }
        });



    }
}
