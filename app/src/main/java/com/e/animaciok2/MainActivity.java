package com.e.animaciok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button butt_fadein, butt_fadeout, butt_Rotate, butt_zoomin, butt_zoomout, buttbounce, butt_lefttoright, butt_righttoleft, butt_submit;
    EditText et_gondolat;
    TextView tv_gondolatolvaso;
    ImageView IV_ang2, IV_rect, IV_ang3;

   // private boolean running;
    private Animation fadeIn;
    private Animation fadeOut;
    private Animation zoomIn;
    private Animation zoomOut;
    private Animation bounce;
    private Animation rotate;
    private Animation lefttoright;
    private Animation righttoleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();




/*       butt_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!running) {
                    ((AnimationDrawable) IV_anim.getBackground()).start();
                    running = true;
                } else {
                    ((AnimationDrawable) IV_anim.getBackground()).stop();
                    running = false;
                }
            }
        });*/

        butt_fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IV_ang2.startAnimation(fadeIn);            }
        });

        butt_zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IV_ang3.startAnimation(zoomIn);
            }
        });

        butt_Rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IV_rect.startAnimation(rotate);
            }
        });

        butt_fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IV_ang2.startAnimation(fadeOut);
            }
        });

        butt_zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IV_ang3.startAnimation(zoomOut);
            }
        });

        butt_righttoleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IV_rect.startAnimation(righttoleft);
            }
        });

      butt_lefttoright.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              IV_rect.startAnimation(lefttoright);
          }
      });

      buttbounce.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              IV_ang3.startAnimation(bounce);
          }
      });

      butt_submit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String str = et_gondolat.getText().toString();
              tv_gondolatolvaso.setText(str);
          }
      });

    } // OnCreate vége




    private void init() {

        butt_fadein = findViewById(R.id.butt_fadein);
        butt_fadeout = findViewById(R.id.butt_fadeout);
        butt_Rotate = findViewById(R.id. butt_Rotate);

        butt_zoomin = findViewById(R.id.butt_zoomin);
        butt_zoomout = findViewById(R.id.butt_zoomout);
        buttbounce = findViewById(R.id.buttbounce);

        butt_lefttoright = findViewById(R.id.butt_lefttoright);
        butt_righttoleft = findViewById(R.id.butt_righttoleft);



        et_gondolat = findViewById(R.id.et_gondolat);
        tv_gondolatolvaso = findViewById(R.id.tv_gondolatolvaso);
        butt_submit = findViewById(R.id. butt_submit);




        IV_ang2 = findViewById(R.id.IV_ang2);
        IV_rect = findViewById(R.id. IV_rect);
        IV_ang3 = findViewById(R.id.IV_ang3);

      // running = false;

         fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
       fadeOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
       zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        zoomOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_out);
        rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
         bounce = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);

        //Animation sample_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sample_anim);
       // Animation blink = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
        lefttoright = AnimationUtils.loadAnimation(MainActivity.this, R.anim.lefttoright);
         righttoleft = AnimationUtils.loadAnimation(MainActivity.this, R.anim.righttoleft);



    }


}