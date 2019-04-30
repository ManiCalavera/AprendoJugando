package Fragment;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aprendojugando.R;

public class FragmentNivel6 extends Fragment implements OnTouchListener,OnDragListener{


    private ImageButton btn_check;
    private ImageButton btn_home;
    private ImageButton  btn_help;
    private TextView txt2;
    private TextView txt4;
    private ImageView tv1;
    private ImageView tv2;
    private ImageView tv3;
    private ImageView tv4;
    private ImageView tv5;
    private ImageView tv6;
    private ImageView tv7;
    private ImageView tv8;
    private FrameLayout linear2;
    private FrameLayout linear3;
    private FrameLayout linear4;
    private FrameLayout linear5;
    private FrameLayout linear6;
    private FrameLayout linear7;
    private FrameLayout linear8;
    private FrameLayout linear1;
    private FrameLayout [] linears= new FrameLayout [9];
    private ImageView [] tvs= new ImageView[9];



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment6 = inflater.inflate(R.layout.fragment_nivel6, container, false);
        Typeface typeface = ResourcesCompat.getFont(getContext(), R.font.kk26toyblocks123);
        txt2 = fragment6.findViewById(R.id.lvl6_txt2);
        txt4 = fragment6.findViewById (R.id.lvl6_txt4);
        txt2.setTypeface(typeface);
        txt4.setTypeface(typeface);


        linear2 = fragment6.findViewById(R.id.lvl6_linear2);
        linear2.setOnDragListener(this);
        linear3 = fragment6.findViewById(R.id.lvl6_linear3);
        linear3.setOnDragListener(this);
        linear4 = fragment6.findViewById(R.id.lvl6_linear4);
        linear4.setOnDragListener(this);
        linear5 = fragment6.findViewById(R.id.lvl6_linear5);
        linear5.setOnDragListener(this);
        linear6 = fragment6.findViewById(R.id.lvl6_linear6);
        linear6.setOnDragListener(this);
        linear7 = fragment6.findViewById(R.id.lvl6_linear7);
        linear7.setOnDragListener(this);
        linear8 = fragment6.findViewById(R.id.lvl6_linear8);
        linear8.setOnDragListener(this);
        linear1 = fragment6.findViewById(R.id.lvl6_linear1);
        linear1.setOnDragListener(this);





        linears [1]=  linear1;
        linears [2]=  linear2;
        linears [3]=  linear3;
        linears [4]= linear4;
        linears [5]=  linear5;
        linears [6]=  linear6;
        linears [7]=  linear7;
        linears [8]= linear8;




        btn_help=fragment6.findViewById(R.id.lvl6_btn_help);
        btn_check=fragment6.findViewById(R.id.lvl6_btn_check);
        btn_home=fragment6.findViewById(R.id.lvl6_btn_home);
        btn_check.setOnTouchListener(this);
        btn_check.setOnTouchListener(this);
        btn_help.setOnTouchListener(this);

        tvs [1] = fragment6.findViewById(R.id.tv1);
        tvs [1].setOnTouchListener(this);
        tvs [2]= fragment6.findViewById(R.id.tv2);
        tvs [2].setOnTouchListener(this);
        tvs [3]= fragment6.findViewById(R.id.tv3);
        tvs [3].setOnTouchListener(this);
        tvs [4]= fragment6.findViewById(R.id.tv4);
        tvs [4].setOnTouchListener(this);
        tvs [5]= fragment6.findViewById(R.id.tv5);
        tvs [5].setOnTouchListener(this);
        tvs [6]= fragment6.findViewById(R.id.tv6);
        tvs [6].setOnTouchListener(this);
        tvs [7]= fragment6.findViewById(R.id.tv7);
        tvs [7].setOnTouchListener(this);
        tvs [8]= fragment6.findViewById(R.id.tv8);
        tvs [8].setOnTouchListener(this);










        return fragment6;
    }


    @SuppressLint("ClickableViewAccessibility")
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if ( (view.getId() != btn_help.getId()) &(view.getId() != btn_check.getId()) & (view.getId() != btn_home.getId())) {
                    DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                    view.startDrag(null, shadowBuilder, view, 0);
                    view.setVisibility(View.INVISIBLE);
                }
                else {
                    if (view.getId() == btn_check.getId()){
                    if ((linear1.getChildCount()==0)|(linear2.getChildCount()==0)|(linear3.getChildCount()==0)|(linear4.getChildCount()==0)|(linear5.getChildCount()==0)|(linear6.getChildCount()==0)|(linear7.getChildCount()==0)|(linear8.getChildCount()==0)) {
                        Toast.makeText(getContext(), "UPs! te faltó ubicar todas las imágenes!", Toast.LENGTH_SHORT).show();
                        //btn_check.setText(R.string.txt_view_estado);
                    }
                    else{
                        //int u;
                        //u=0;
                        boolean gano;
                        gano = true;
                        for (Integer i = 1; i<=4; i++) {
                            if ((linears[i].getChildAt(0).getId() == tvs[1].getId()) || (linears[i].getChildAt(0).getId() == tvs[4].getId()) || (linears[i].getChildAt(0).getId() == tvs[6].getId()) || (linears[i].getChildAt(0).getId() == tvs[8].getId())) {
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
                }
                break;
        }
        return true;
    }
    public boolean onDrag(View layoutview, DragEvent event) {
        View view = (View) event.getLocalState();
        FrameLayout container = (FrameLayout) layoutview;
        switch (event.getAction()) {


            case DragEvent.ACTION_DROP:

                if (container.getChildCount() == 0) {

                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);


                    FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                            FrameLayout.LayoutParams.MATCH_PARENT,
                            FrameLayout.LayoutParams.MATCH_PARENT,
                            Gravity.CENTER);
                    container.addView(view, params);
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
