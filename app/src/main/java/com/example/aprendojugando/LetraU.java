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


    private ImageView imageView1_arbol1;
    private ImageView imageView2_espada1;
    private ImageView imageView3_uno1;
    private ImageView imageView4_oso1;
    private ImageButton btn_check;
    final Boolean[] arreglo = {false, false, false, false};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_u);

        btn_check= findViewById(R.id.check);
        imageView1_arbol1= findViewById(R.id.imageView1_arbol1);
        imageView2_espada1= findViewById(R.id.imageView2_espada1);
        imageView3_uno1= findViewById(R.id.imageViewv3_uno1);
        imageView4_oso1= findViewById(R.id.imageView4_oso1);







        imageView1_arbol1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                imageView1_arbol1.setImageResource(R.drawable.arbolseleccionado);
                imageView2_espada1.setImageResource(R.drawable.espada);
                imageView3_uno1.setImageResource(R.drawable.uno);
                imageView4_oso1.setImageResource(R.drawable.oso);
                arreglo[0] = true;
                arreglo[1] = false;
                arreglo[2] = false;
                arreglo[3] = false;
            }

        });

        imageView2_espada1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                imageView1_arbol1.setImageResource(R.drawable.arbol);
                imageView2_espada1.setImageResource(R.drawable.espadaseleccionado);
                imageView3_uno1.setImageResource(R.drawable.uno);
                imageView4_oso1.setImageResource(R.drawable.oso);
                arreglo[0] = false;
                arreglo[1] = true;
                arreglo[2] = false;
                arreglo[3] = false;
            }
        });

        imageView3_uno1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                imageView1_arbol1.setImageResource(R.drawable.arbol);
                imageView2_espada1.setImageResource(R.drawable.espada);
                imageView3_uno1.setImageResource(R.drawable.unoseleccionado);
                imageView4_oso1.setImageResource(R.drawable.oso);
                arreglo[0] = false;
                arreglo[1] = false;
                arreglo[2] = true;
                arreglo[3] = false;
            }
        });

        imageView4_oso1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                imageView1_arbol1.setImageResource(R.drawable.arbol);
                imageView2_espada1.setImageResource(R.drawable.espada);
                imageView3_uno1.setImageResource(R.drawable.uno);
                imageView4_oso1.setImageResource(R.drawable.ososeleccionado);
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
                }
                else {
                    Toast.makeText(LetraU.this, "Ups! te equivocaste, inténtalo de nuevo", Toast.LENGTH_LONG).show();
                }

            }
        });
    }




}