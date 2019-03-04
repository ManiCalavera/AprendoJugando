package com.example.aprendojugando;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    SoundPool sp;
    int sonido_de_reproduccion;

    private ImageButton btn_lvl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_lvl1= findViewById(R.id.niveles);


        //se encarga de cargar el sonido del botón para después reproduciorlo
        sp= new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido_de_reproduccion= sp.load(this, R.raw.selec, 1);


        btn_lvl1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MenuNiveles.class);
                startActivity(intent);

                //Parte que le da sonido al botón
                //sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);


            }
        });

    }

    public void Letras (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

        Intent siguiente = new Intent(this, MenuLetras.class);
        startActivity(siguiente);



    }
    public void Acercade (View view){

        //Parte que le da sonido al botón
        sp.play (sonido_de_reproduccion, 1, 1, 1, 0, 0);

    }
}
