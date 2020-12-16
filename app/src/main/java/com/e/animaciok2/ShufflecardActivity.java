package com.e.animaciok2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ShufflecardActivity extends AppCompatActivity {
    Button butt_shuffle, butt_vissza_s;
    ImageView IV_cb1, IV_cb2, IV_cb3, IV_cb4, IV_cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shufflecard);

        init();

    }
    private void shuffle() {
    }

    private void listeners() {
        butt_shuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shuffle();
            }
        });
        butt_vissza_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vissza = new Intent (ShufflecardActivity.this, MainActivity.class);
                startActivity(vissza);
                finish();
            }
        });
    }

    private void init() {
        butt_shuffle = findViewById(R.id.butt_shuffle);
        butt_vissza_s = findViewById(R.id. butt_vissza_s);
        IV_cb1 = findViewById(R.id.IV_cb1 );
        IV_cb2 = findViewById(R.id.IV_cb2);
        IV_cb3 = findViewById(R.id.IV_cb3 );
        IV_cb4 = findViewById(R.id.IV_cb4 );
        IV_cb5 = findViewById(R.id.IV_cb5 );

      //  adatbazis = new DBHelper(RogzitActivity.this);
    }
}