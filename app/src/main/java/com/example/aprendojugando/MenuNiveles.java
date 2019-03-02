package com.example.aprendojugando;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuNiveles extends AppCompatActivity {
    SoundPool sp;
    int sonido_de_reproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_niveles);

        //se encarga de cargar el sonido del botón para después reproduciorlo
        sp= new SoundPool(1,AudioManager.STREAM_MUSIC, 1);
        sonido_de_reproduccion= sp.load(this, R.raw.selec, 1);
    }



    public void lvl1 (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

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

    }
}
