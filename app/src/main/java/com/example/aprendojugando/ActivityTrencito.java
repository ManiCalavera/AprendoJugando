package com.example.aprendojugando;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ActivityTrencito extends AppCompatActivity {
    private ImageView imageViewHome;
    private ImageView imageViewCheck;
    private ImageView imageViewRefresh;

    private int[] arrayDestino = new int[8];

    private int moviendo;

    private ImageView imageViewAla;
    private ImageView imageViewOreja;
    private ImageView imageViewOjo;
    private ImageView imageViewOlla;
    private ImageView imageViewOveja;
    private ImageView imageViewAnillo;
    private ImageView imageViewArania;
    private ImageView imageViewAro;

    private ImageView destino1 ;
    private ImageView destino2 ;
    private ImageView destino3 ;
    private ImageView destino4 ;
    private ImageView destino5 ;
    private ImageView destino6 ;
    private ImageView destino7 ;
    private ImageView destino8 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_trencito );

        for (int i = 0; i < arrayDestino.length; i++) {
            arrayDestino[i] = 0;
        }

        initViews();
        setButtons();
        setImageViewMove();
        setDestinos();
    }

    private void initViews() {
        imageViewAla = findViewById( R.id.imageViewAla );
        imageViewOreja = findViewById( R.id.imageViewOreja );
        imageViewOjo = findViewById( R.id.imageViewOjo );
        imageViewOlla = findViewById( R.id.imageViewOlla );
        imageViewOveja = findViewById( R.id.imageViewOveja );
        imageViewAnillo = findViewById( R.id.imageViewAnillo );
        imageViewArania = findViewById( R.id.imageViewArania );
        imageViewAro = findViewById( R.id.imageViewAro );
        destino1 = findViewById( R.id.destino1 );
        destino2 = findViewById( R.id.destino2 );
        destino3 = findViewById( R.id.destino3 );
        destino4 = findViewById( R.id.destino4 );
        destino5 = findViewById( R.id.destino5 );
        destino6 = findViewById( R.id.destino6 );
        destino7 = findViewById( R.id.destino7 );
        destino8 = findViewById( R.id.destino8 );
        imageViewCheck = findViewById((R.id.imageViewCheck));
        imageViewHome = findViewById((R.id.imageViewHome));
        imageViewRefresh = findViewById((R.id.imageViewRefresh));
    }


    //Setea las funciones de los botones:





    private void setButtons() {
        imageViewHome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ActivityTrencito.this, MainActivity.class );
                startActivity(intent);
            }
        } );
        imageViewCheck.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean gano = true;
                boolean compite = true;
                //recorro los 2 array y comparo el que arme con el arrastre contra el que yo tenia guardado.

                for (int i = 0 ; i < arrayDestino.length; i++){
                    if(arrayDestino[i]==0){
                        compite = false;
                    }
                }
                if(compite){
                    for (int i = 0 ; i < 4; i++) {
                        if ((arrayDestino[i] == imageViewAla.getId()) || (arrayDestino[i] == imageViewAnillo.getId()) || (arrayDestino[i] == imageViewArania.getId()) || (arrayDestino[i] == imageViewAro.getId())) {
                            compite = false;
                        }
                    }
                    for (int i = 4 ; i < 8; i++) {
                        if ((arrayDestino[i] == imageViewOjo.getId()) || (arrayDestino[i] == imageViewOlla.getId()) || (arrayDestino[i] == imageViewOreja.getId()) || (arrayDestino[i] == imageViewOveja.getId())) {
                            compite = false;
                        }
                    }
                    if (compite){
                        Toast.makeText(ActivityTrencito.this, "Felicidades!! lo hiciste muy bien!", Toast.LENGTH_LONG).show();
                    }
                    else
                        Toast.makeText(ActivityTrencito.this, "Uy te equivocaste! inténtalo de nuevo", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(ActivityTrencito.this, "Uy! no usaste todas las imágenes", Toast.LENGTH_SHORT).show();

                }

            }
        });

        imageViewRefresh.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityTrencito.this.finish();
                startActivity(new Intent(ActivityTrencito.this, ActivityTrencito.class));
            }
        } );
    }




    //Le da la función de arrastre y guarda el id de la imagen en movimiento en la variable "moviendo":





    @SuppressLint("ClickableViewAccessibility")
    private void setImageViewMove() {

        imageViewAla.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                return true;
            }
        });

        imageViewAnillo.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                Toast.makeText(ActivityTrencito.this, String.valueOf(moviendo), Toast.LENGTH_LONG).show();
                return true;

            }
        });

        imageViewArania.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                return true;
            }
        });

        imageViewAro.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                return true;
            }
        });

        imageViewOreja.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                return true;
            }
        });

        imageViewOjo.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                return true;
            }
        });

        imageViewOlla.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                return true;
            }
        });

        imageViewOveja.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, null, DragEvent.ACTION_DRAG_ENTERED);
                moviendo = v.getId();
                return true;
            }
        });
    }


    //Guarda en un verctor de destinos, las id de las imagenes en el orden que fueron ubicadas:



    private void setDestinos() {
        destino1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[0] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });

        destino2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[1] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });

        destino3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[2] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }

                return true;
            }
        });

        destino4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[3] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });

        destino5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[3] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });

        destino6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[3] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });

        destino7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[3] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });

        destino8.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        arrayDestino[3] = moviendo;
                        (findViewById(moviendo)).setX(v.getX() + v.getWidth()/4);
                        (findViewById(moviendo)).setY(v.getY() + v.getWidth()/4);
                        v.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });
    }
}
