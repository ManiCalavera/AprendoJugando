package Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aprendojugando.R;

public class FragmentNivel6 extends Fragment implements OnTouchListener,OnDragListener{


    public Button btn_check;
    private ImageView tv1;
    private ImageView tv2;
    private ImageView tv3;
    private ImageView tv4;
    private ImageView tv5;
    private ImageView tv6;
    private ImageView tv7;
    private ImageView tv8;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private LinearLayout [] linears= new LinearLayout[4];
    private int[] tvs= new int [4];



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment6 = inflater.inflate(R.layout.fragment_nivel6, container, false);
        linear2 = fragment6.findViewById(R.id.linear2);
        linear2.setOnDragListener(this);
        linear3 = fragment6.findViewById(R.id.linear3);
        linear3.setOnDragListener(this);
        linear4 = fragment6.findViewById(R.id.linear4);
        linear4.setOnDragListener(this);
        linear5 = fragment6.findViewById(R.id.linear5);
        linear5.setOnDragListener(this);
        linear6 = fragment6.findViewById(R.id.linear6);
        linear6.setOnDragListener(this);
        linear7 = fragment6.findViewById(R.id.linear7);
        linear7.setOnDragListener(this);
        linear8 = fragment6.findViewById(R.id.linear8);
        linear8.setOnDragListener(this);
        linear9 = fragment6.findViewById(R.id.linear9);
        linear9.setOnDragListener(this);




        tvs [0]= (R.id.tv5);
        tvs [1]= (R.id.tv6);
        tvs [2]= (R.id.tv7);
        tvs [3]= (R.id.tv8);

        linears [0]= (LinearLayout) linear2;
        linears [1]= (LinearLayout) linear3;
        linears [2]= (LinearLayout) linear4;
        linears [3]= (LinearLayout) linear5;



        btn_check=fragment6.findViewById(R.id.btn_check);
        btn_check.setOnTouchListener(this);

        tv1= fragment6.findViewById(R.id.tv1);
        tv1.setOnTouchListener(this);
        tv2= fragment6.findViewById(R.id.tv2);
        tv2.setOnTouchListener(this);
        tv3= fragment6.findViewById(R.id.tv3);
        tv3.setOnTouchListener(this);
        tv4= fragment6.findViewById(R.id.tv4);
        tv4.setOnTouchListener(this);
        tv5= fragment6.findViewById(R.id.tv5);
        tv5.setOnTouchListener(this);
        tv6= fragment6.findViewById(R.id.tv6);
        tv6.setOnTouchListener(this);
        tv7= fragment6.findViewById(R.id.tv7);
        tv7.setOnTouchListener(this);
        tv8= fragment6.findViewById(R.id.tv8);
        tv8.setOnTouchListener(this);










        return fragment6;
    }


    @SuppressLint("ClickableViewAccessibility")
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (view.getId() != btn_check.getId()) {
                    DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                    view.startDrag(null, shadowBuilder, view, 0);
                    view.setVisibility(View.INVISIBLE);
                }
                else {
                    if ((linear9.getChildCount()==0)|(linear2.getChildCount()==0)|(linear3.getChildCount()==0)|(linear4.getChildCount()==0)|(linear5.getChildCount()==0)|(linear6.getChildCount()==0)|(linear7.getChildCount()==0)|(linear8.getChildCount()==0)) {
                        Toast.makeText(getContext(), "UPs! te faltó ubicar todas las imágenes!", Toast.LENGTH_SHORT).show();
                        //btn_check.setText(R.string.txt_view_estado);
                    }
                    else{
                        //int u;
                        //u=0;
                        boolean gano;
                        gano = true;
                        for (Integer i = 0; i<4; i++) {
                            if ((linears[i].getChildAt(0).getId() == tvs[0]) || (linears[i].getChildAt(0).getId() == tvs[1]) || (linears[i].getChildAt(0).getId() == tvs[2]) || (linears[i].getChildAt(0).getId() == tvs[3])) {
                                Toast.makeText(getContext(), "UPs! Te equivocaste! inténtalo de nuevo", Toast.LENGTH_SHORT).show();
                                gano= false;
                                //i = i + 1;
                            }
                        }

                        /*while ((u<4)&&(gano)) {
                            if (linears[u].getChildAt(0).getId() == tv1.getId()) {// | (linears[i].getChildAt(0).getId() == tvs[1]) | (linears[i].getChildAt(0).getId() == tvs[2]) | (linears[i].getChildAt(0).getId() == tvs[3])) {
                                Toast.makeText(MainActivity.this, "UPs! Te equivocaste! inténtalo de nuevo", Toast.LENGTH_SHORT).show();
                                gano= false;
                                u++;
                            }
                        }*/
                        if (gano){
                            Toast.makeText(getContext(),"Ganaste!!!!",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;
        }
        return true;
    }
    public boolean onDrag(View layoutview, DragEvent event) {
        View view = (View) event.getLocalState();
        LinearLayout container = (LinearLayout) layoutview;
        switch (event.getAction()) {


            case DragEvent.ACTION_DROP:

                if (container.getChildCount() == 0) {

                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);

                    container.addView(view);
                    view.setVisibility(View.VISIBLE);


                }
                break;

            case DragEvent.ACTION_DRAG_ENDED:
                view.setVisibility(View.VISIBLE);
                break;
        }
        return true;
    }
}
