package com.example.aprendojugando;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class ActivityContainer extends AppCompatActivity {

    //public static String modoAcercaDe;
    public static String modoNiveles;
    public static String modoLetras;

    private Fragment fragment;

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_container );
        fragmentManager = getSupportFragmentManager();
        load();

    }
    private void load() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            modoNiveles = bundle.getString( "modoNiveles" );
            modoLetras = bundle.getString( "modoLetras" );
            loadFragmentsNiveles(modoNiveles);
            loadFragmentsLetras(modoLetras);
        }
    }

   /* private void loadFragmentLetras(String modoLetras) {
    }*/

    private void loadFragmentsNiveles(String selectedMode) {
        switch (selectedMode) {
            case ActivityMenuNiveles.MODO_NIVEL_1:
                FragmentNivel1 fragmentNivel1 = new FragmentNivel1();
                loadFragments(fragmentNivel1);
                break;
            case ActivityMenuNiveles.MODO_NIVEL_2:
                FragmentNivel2 fragmentNivel2 = new FragmentNivel2();
                loadFragments(fragmentNivel2);
                break;
            case ActivityMenuNiveles.MODO_NIVEL_3:
                FragmentNivel3 fragmentNivel3 = new FragmentNivel3();
                loadFragments(fragmentNivel3);
                break;
            case ActivityMenuNiveles.MODO_NIVEL_4:
                FragmentNivel4 fragmentNivel4 = new FragmentNivel4();
                loadFragments(fragmentNivel4);
                break;
            case ActivityMenuNiveles.MODO_NIVEL_5:
                FragmentNivel5 fragmentNivel5 = new FragmentNivel5();
                loadFragments(fragmentNivel5);
                break;
            case ActivityMenuNiveles.MODO_NIVEL_6:
                FragmentNivel6 fragmentNivel6 = new FragmentNivel6();
                loadFragments(fragmentNivel6);
                break;
            case ActivityMenuNiveles.MODO_NIVEL_7:
                FragmentNivel7 fragmentNivel7 = new FragmentNivel7();
                loadFragments(fragmentNivel7);
                break;
            case ActivityMenuNiveles.MODO_NIVEL_8:
                FragmentNivel8 fragmentNivel8 = new FragmentNivel8();
                loadFragments(fragmentNivel8);
                break;
            default:
                break;
        }
    }

    private void loadFragmentsLetras(String selectedMode) {
        switch (selectedMode) {
            case ActivityMenuLetras.MODO_LETRA_A:
                FragmentNivel1 fragmentLetraA = new FragmentNivel1();
                loadFragments(fragmentLetraA);
                break;
            case ActivityMenuLetras.MODO_LETRA_E:
                FragmentNivel2 fragmentLetraE = new FragmentNivel2();
                loadFragments(fragmentLetraE);
                break;
            case ActivityMenuLetras.MODO_LETRA_I:
                FragmentNivel3 fragmentLetraI = new FragmentNivel3();
                loadFragments(fragmentLetraI);
                break;
            case ActivityMenuLetras.MODO_LETRA_O:
                FragmentNivel4 fragmentLetraO = new FragmentNivel4();
                loadFragments(fragmentLetraO);
                break;
            case ActivityMenuLetras.MODO_LETRA_U:
                FragmentNivel5 fragmentLetraU = new FragmentNivel5();
                loadFragments(fragmentLetraU);
                break;
            default:
                break;
        }
    }

    public void loadFragments(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer,fragment);
        fragmentTransaction.commit();
    }
}
