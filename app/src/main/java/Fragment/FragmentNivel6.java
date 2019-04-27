package Fragment;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.View.DragShadowBuilder;
import android.content.ClipData;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.Toast;

import com.example.aprendojugando.R;

public class FragmentNivel6 extends Fragment implements OnTouchListener,OnDragListener{

    public ImageView iv1;
    public ImageView iv2;
    public ImageView iv3;
    public ImageView iv4;
    public ImageView iv5;
    public ImageView iv6;
    public ImageView iv7;
    public ImageView iv8;

    ImageButton btn_check;

    private LinearLayout [] linears= new LinearLayout[9];
    private ImageView [] ivs= new ImageView[9];




    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment6 = inflater.inflate(R.layout.fragment_nivel6, container, false);
        ivs [1] = fragment6.findViewById(R.id.lvl6_img1);
        ivs [2] = fragment6.findViewById(R.id.lvl6_img2);
        ivs [3] = fragment6.findViewById(R.id.lvl6_img3);
        ivs [4] = fragment6.findViewById(R.id.lvl6_img4);
        ivs [5] = fragment6.findViewById(R.id.lvl6_img5);
        ivs [6]= fragment6.findViewById(R.id.lvl6_img6);
        ivs [7] = fragment6.findViewById(R.id.lvl6_img7);
        ivs [8] = fragment6.findViewById(R.id.lvl6_img8);

        btn_check = fragment6.findViewById(R.id.lvl6_chck);

        /*ivs [1] = iv1.getId();
        ivs [2] = iv2.getId();
        ivs [3] = iv3.getId();
        ivs [4] = iv4.getId();
        ivs [5] = iv5.getId();
        ivs [6] = iv6.getId();
        ivs [7] = iv7.getId();
        ivs [8] = iv8.getId();*/

        linears [1] = fragment6.findViewById(R.id.lvl6_linear1);
        linears [2]= fragment6.findViewById(R.id.lvl6_linear2);
        linears [3] = fragment6.findViewById(R.id.lvl6_linear3);
        linears [4] = fragment6.findViewById(R.id.lvl6_linear4);
        linears [5] = fragment6.findViewById(R.id.lvl6_linear5);
        linears [6] = fragment6.findViewById(R.id.lvl6_linear6);
        linears [7] = fragment6.findViewById(R.id.lvl6_linear7);
        linears [8] = fragment6.findViewById(R.id.lvl6_linear8);





        for (int i= 1; i<= 8; i++){
            linears [1].setOnDragListener(this) ;
        }

        for (int i= 1; i<= 8; i++){
            ivs [i].setOnTouchListener(this) ;
        }



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
                /*else {
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
                        }*//*
                        if (gano){
                            Toast.makeText(MainActivity.this,"Ganaste!!!!",Toast.LENGTH_SHORT).show();
                        }
                    }
                }*/
                break;
        }
        return true;
    }
    public boolean onDrag(View layoutview, DragEvent event) {

        View view = (View) event.getLocalState();
        LinearLayout container = (LinearLayout) layoutview;
        switch (event.getAction()) {

            case  DragEvent.ACTION_DRAG_ENTERED:
                Toast.makeText(getContext(), "drag entered", Toast.LENGTH_SHORT).show();
            case DragEvent.ACTION_DROP:

                //if (container.getChildCount() == 0) {
                    Toast.makeText(getContext(),"drag drop",Toast.LENGTH_SHORT).show();
                    ViewGroup owner = (ViewGroup) view.getParent();

                    owner.removeView(view);

                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
               //}
                break;

            /*case DragEvent.ACTION_DRAG_ENDED:
                view.setVisibility(View.VISIBLE);
                break;*/
        }
        return true;
    }
}
