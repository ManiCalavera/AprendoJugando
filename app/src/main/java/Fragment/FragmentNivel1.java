package Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.aprendojugando.R;

public class FragmentNivel1 extends Fragment {

    private ImageView imageView1_arbol1;
    private ImageView imageView2_espada1;
    private ImageView imageView3_uno1;
    private ImageView imageView4_oso1;
    private ImageButton btn_check;
    final Boolean[] arreglo = {false, false, false, false};


    public FragmentNivel1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment1 =  inflater.inflate( R.layout.fragment_nivel1, container, false );


        btn_check= fragment1.findViewById(R.id.check);
        imageView1_arbol1= fragment1.findViewById(R.id.imageView1_arbol1);
        imageView2_espada1= fragment1.findViewById(R.id.imageView2_espada1);
        imageView3_uno1= fragment1.findViewById(R.id.imageViewv3_uno1);
        imageView4_oso1= fragment1.findViewById(R.id.imageView4_oso1);







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
                if ((!arreglo[0]) && (!arreglo[1]) && (arreglo[2]) && (!arreglo[3])) {
                    Toast.makeText(getContext(), "Lo hiciste muy bien!!", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getContext(), "Ups! te equivocaste, inténtalo de nuevo", Toast.LENGTH_LONG).show();
                }

            }
        });


        return fragment1;
    }




}
