package com.example.thuanhuynh.giuaky_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by thuanhuynh on 4/13/18.
 */

public class Contain_Main extends AppCompatActivity{
    private Button btnPlay;
    private TextView tvTurn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contain_main);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contain_Main.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
