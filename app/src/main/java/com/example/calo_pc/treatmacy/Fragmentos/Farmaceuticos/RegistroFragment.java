package com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calo_pc.treatmacy.Controller.FarmacistController;
import com.example.calo_pc.treatmacy.Objetos.Farmaceutico;
import com.example.calo_pc.treatmacy.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RegistroFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RegistroFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegistroFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText etNombre;
    private EditText etApellido1;
    private EditText etApellido2;
    private EditText etNumColegiado;
    private EditText etTelefono;
    private EditText etUsername;
    private EditText etPassword;
    private EditText etPassword2;

    private Button btnRegistroFarmaceutico;

    private OnFragmentInteractionListener mListener;

    public RegistroFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegistroFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegistroFragment newInstance(String param1, String param2) {
        RegistroFragment fragment = new RegistroFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_registro, container, false);

        etNombre = view.findViewById(R.id.etNombre);
        etApellido1 = view.findViewById(R.id.etApellido1);
        etApellido2 = view.findViewById(R.id.etApellido2);
        etNumColegiado = view.findViewById(R.id.etNumColegiado);
        etTelefono = view.findViewById(R.id.etTelefono);
        etUsername = view.findViewById(R.id.etUsername);
        etPassword = view.findViewById(R.id.etPassword);
        etPassword2 = view.findViewById(R.id.etPassword2);
        btnRegistroFarmaceutico = view.findViewById(R.id.btFinalizarRegistro);

        cargarBoton();
            

        return view;
    }

    private void cargarBoton() {

        btnRegistroFarmaceutico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((etNombre.getText().toString().isEmpty())||(etApellido1.getText().toString().isEmpty())||(etApellido2.getText().toString().isEmpty()) ||
                        (etNumColegiado.getText().toString().isEmpty()) || (etTelefono.getText().toString().isEmpty()) || (etUsername.getText().toString().isEmpty()) ||
                        (etPassword.getText().toString().isEmpty()) || (etPassword2.getText().toString().isEmpty())) {

                    CharSequence text = "Rellene todos los campos";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getContext(), text, duration);
                    toast.show();

                }else if (etPassword2.getText().toString() == etPassword.getText().toString()) {

                    Toast.makeText(getContext(),"Las contraseñas deben coincidir", Toast.LENGTH_LONG).show();

                }else {

                    registrar();
                    //etNombre.setText("");
                    //etApellido1.setText("");
                    //etApellido2.setText("");
                    //etNumColegiado.setText("");
                    //etTelefono.setText("");
                    //etUsername.setText("");
                    //etPassword.setText("");
                    //etPassword2.setText("");

                }

            }
        });

    }

    private void registrar() {

        Farmaceutico nuevo = new Farmaceutico();
        FarmacistController farmacistController = new FarmacistController(getContext());

        farmacistController.getFarmacuticos();

        nuevo.setNombre(etNombre.getText().toString());
        nuevo.setApellido1(etApellido1.getText().toString());
        nuevo.setApellido2(etApellido2.getText().toString());
        nuevo.setNumColegiado((etNumColegiado.getText().toString()));
        nuevo.setTelefono(etTelefono.getText().toString());
        nuevo.setUsername(etUsername.getText().toString());
        nuevo.setPassword(etPassword.getText().toString());
        nuevo.setId_farmacia("1");

        farmacistController.insertFarmacist(nuevo);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
