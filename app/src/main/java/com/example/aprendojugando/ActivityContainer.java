package com.example.aprendojugando;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import Fragment.FragmentNivel1;
import Fragment.FragmentNivel6;
import Fragment.Gano;

public class ActivityContainer extends AppCompatActivity implements Gano.FragmentGanoListener {



    private FragmentManager fragmentManager;

    private Fragment[] array_fragments;

    private  int modoNiveles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_container );
        fragmentManager = getSupportFragmentManager();
        load();

        cargararray ();


        loadFragments(array_fragments [modoNiveles]);

    }
    private void load() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            modoNiveles = bundle.getInt( "modoNiveles" );
        }
        else {
            modoNiveles = 0;
        }


    }

   /* private void loadFragmentLetras(String modoLetras) {
    }*/





    public void loadFragments(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ContenedorFragment, fragment);
        fragmentTransaction.commit();
    }


    private void cargararray (){

        array_fragments = new Fragment [6];
        array_fragments[1] = new FragmentNivel1();
        array_fragments[2] = new FragmentNivel6();


    }

    @Override
    public void onInputGanoSent(Boolean input) {
        if (input) {
            loadFragments(array_fragments [2]);
        }

    }
}
