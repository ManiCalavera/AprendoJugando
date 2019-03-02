package com.example.aprendojugando;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuLetras extends AppCompatActivity {

    SoundPool sp;
    int sonido_de_reproduccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_letras);

        //se encarga de cargar el sonido del botón para después reproduciorlo
        sp= new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido_de_reproduccion= sp.load(this, R.raw.selec, 1);
    }

    public void Home (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

        //linkea al menu principal

        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);

    }


    public void A   (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }

    public void E (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void I (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void O (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
    public void U (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
}

