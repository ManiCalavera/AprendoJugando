package Fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.aprendojugando.R;





public class Gano extends AppCompatDialogFragment {

    private FragmentGanoListener listener;
    public interface FragmentGanoListener {
        void onInputGanoSent(Boolean input);
    }
    Button btn_si;
    Button btn_no;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_gano, null);

        btn_si= view.findViewById(R.id.button_si);
        btn_no= view.findViewById(R.id.button_no);

        builder.setView(view);

               /* .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                */
        return builder.create();

    }

    private void loadbuttons (){
        btn_si.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                listener.onInputGanoSent(true);
                dismiss();
            }
        });

        btn_no.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                listener.onInputGanoSent(true);
                dismiss();
            }
        });
}
}
