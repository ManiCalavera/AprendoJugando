package com.example.aprendojugando;

import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuNiveles extends AppCompatActivity {
    SoundPool sp;
    int sonido_de_reproduccion;
    private ImageButton btn_lvl1;
    private ImageButton btn_lvl6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_niveles);

        btn_lvl1= findViewById(R.id.menu_lvl1);
        btn_lvl6=findViewById(R.id.btn_lvl6);

        //se encarga de cargar el sonido del botón para después reproduciorlo
        sp= new SoundPool(1,AudioManager.STREAM_MUSIC, 1);
        sonido_de_reproduccion= sp.load(this, R.raw.selec, 1);

        btn_lvl1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuNiveles.this, LetraU.class);
                startActivity(intent);

                //Parte que le da sonido al botón
                sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);


            }
        });

        btn_lvl6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuNiveles.this, ActivityTrencito.class);
                startActivity(intent);

                //Parte que le da sonido al botón
                sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);


            }
        });
    }




    public void lvl2 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void lvl3 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void lvl4 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void lvl5 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void lvl6 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void lvl7 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void lvl8 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void Home (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

        //linkea al menu principal

        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);

    }
}
