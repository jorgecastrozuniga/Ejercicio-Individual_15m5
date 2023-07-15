package com.example.ejercicio_individual_15m5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicio_individual_15m5.databinding.FragmentRespuestaEquivocadaBinding;

public class RespuestaEquivocadaFragment extends Fragment {

    private FragmentRespuestaEquivocadaBinding ebinding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "clave1";
    //private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    //private String mParam2;

    public RespuestaEquivocadaFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static RespuestaEquivocadaFragment newInstance(String param1, String param2) {
        RespuestaEquivocadaFragment fragment = new RespuestaEquivocadaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ebinding= FragmentRespuestaEquivocadaBinding.inflate(inflater,container,false);
        View view=ebinding.getRoot();

        String llenar=getString(R.string.otravez,mParam1);
        ebinding.tvequivocado.setText(llenar);

        ebinding.btagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(ebinding.getRoot()).navigate(R.id.action_respuestaEquivocada_to_inicio);
            }
        });

        return view;
    }
}