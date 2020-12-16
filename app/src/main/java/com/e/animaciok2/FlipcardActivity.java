package com.e.animaciok2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FlipcardActivity extends AppCompatActivity {
    Button butt_flipcard, butt_vissza_fc;
    ImageView IV_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipcard);

        init();

    }
    private void flip() {
    }

    private void listeners() {
        butt_flipcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               flip();
            }
        });
        butt_vissza_fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vissza = new Intent (FlipcardActivity.this, MainActivity.class);
                startActivity(vissza);
                finish();
            }
        });
    }

    private void init() {
        butt_flipcard = findViewById(R.id.butt_flipcard);
        butt_vissza_fc = findViewById(R.id.butt_vissza_fc);
        IV_card = findViewById(R.id.IV_card);


        //  adatbazis = new DBHelper(RogzitActivity.this);
    }
}