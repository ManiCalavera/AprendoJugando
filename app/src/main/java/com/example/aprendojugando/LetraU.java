package com.example.aprendojugando;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class LetraU extends AppCompatActivity {

    public ImageView iv1;
    public ImageView iv2;
    public ImageView iv3;
    public ImageView iv4;
    public ImageButton btn_check;
    final Boolean[] arreglo = {false, false, false, false};
    TextView tv1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_u);

        btn_check= findViewById(R.id.check);
        iv1= findViewById(R.id.iv1_letrau);
        iv2= findViewById(R.id.iv2_letrau);
        iv3= findViewById(R.id.iv3_letrau);
        iv4= findViewById(R.id.iv4_letrau);
        tv1= findViewById(R.id.txt_mensaje);

        tv1.setText("Mucha suerte!");






        iv1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                arreglo[0] = true;
                arreglo[1] = false;
                arreglo[2] = false;
                arreglo[3] = false;

            }

        });

        iv2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                arreglo[0] = false;
                arreglo[1] = true;
                arreglo[2] = false;
                arreglo[3] = false;
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                arreglo[0] = false;
                arreglo[1] = false;
                arreglo[2] = true;
                arreglo[3] = false;
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                arreglo[0] = false;
                arreglo[1] = false;
                arreglo[2] = false;
                arreglo[3] = true;
            }
        });

        btn_check.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if ((arreglo[0] == false) && (arreglo[1] == false) && (arreglo[2] == true) && (arreglo[3] == false)) {
                    Toast.makeText(LetraU.this, "Lo hiciste muy bien!!", Toast.LENGTH_LONG).show();
                    tv1.setText("Congratulations!");


                }

            }
            });
    }




}
