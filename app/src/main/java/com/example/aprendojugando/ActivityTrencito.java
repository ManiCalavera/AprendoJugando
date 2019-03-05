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

    private int[] arrayIconos = new int[8];

    private int moviendo;

    private ImageView imageViewAla;
    private ImageView imageViewOreja;
    private ImageView imageViewOjo;
    private ImageView imageViewOlla;
    private ImageView imageViewOveja;
    private ImageView imageViewAnillo;
    private ImageView imageViewArania;
    private ImageView imageViewAro;

    private ImageView imageViewLetraO1;
    private ImageView imageViewLetraO2;
    private ImageView imageViewLetraO3;
    private ImageView imageViewLetraO4;
    private ImageView imageViewLetraA1;
    private ImageView imageViewLetraA2;
    private ImageView imageViewLetraA3;
    private ImageView imageViewLetraA4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_trencito );

        for (int i = 0; i < arrayIconos.length; i++) {
            arrayIconos[i] = 0;
        }

        initViews();
        setButtons();
    }

    private void initViews() {
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewHome = findViewById( R.id.imageViewHome );
        imageViewCheck = findViewById((R.id.imageViewCheck));
        imageViewHome = findViewById((R.id.imageViewHome));
        imageViewRefresh = findViewById((R.id.imageViewRefresh));
    }

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
              /*aca va logica del chekeo de los elementos blabla*/
            }
        } );
        imageViewRefresh.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityTrencito.this.finish();
                startActivity(new Intent(ActivityTrencito.this, ActivityTrencito.class));
            }
        } );
    }

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
}
