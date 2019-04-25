package Fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.example.aprendojugando.ActivityContainer;
import com.example.aprendojugando.R;

import java.io.Serializable;


public class Gano extends AppCompatDialogFragment {

    private FragmentGanoListener listener;


    public Gano() {
    }

    public Gano(FragmentGanoListener listener) {
        this.listener = listener;
    }

    public interface FragmentGanoListener {
        void onInputGanoSiSent();
        void onInputGanoNoSent ();
    }

    Button btn_si;
    Button btn_no;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_gano, null);

        btn_si = view.findViewById(R.id.button_si);
        btn_no = view.findViewById(R.id.button_no);




        builder.setView(view);

        loadbuttons();

        return builder.create();

    }

    private void loadbuttons() {
        btn_si.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onInputGanoSiSent();
                dismiss();
            }
        });

        btn_no.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onInputGanoNoSent();
                dismiss();
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putSerializable("escuchador", (Serializable) listener);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        listener = (FragmentGanoListener) savedInstanceState.getSerializable("escuchador");
    }
}

