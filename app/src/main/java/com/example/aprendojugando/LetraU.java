package com.example.aprendojugando;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class LetraU extends AppCompatActivity implements View.OnTouchListener {

    public ImageView iv1;
    public ImageView iv2;
    public ImageView iv3;
    public ImageView iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_u);

        iv1= (ImageView)findViewById(R.id.iv1_letrau);
        iv1= (ImageView)findViewById(R.id.iv2_letrau);
        iv1= (ImageView)findViewById(R.id.iv3_letrau);
        iv1= (ImageView)findViewById(R.id.iv4_letrau);

        iv1.setOnTouchListener(new View.OnTouchListener);








    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if MotionEvent.ACTION_UP {
            return true;
        }
    }






}
