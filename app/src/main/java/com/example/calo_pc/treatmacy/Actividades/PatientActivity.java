package com.example.calo_pc.treatmacy.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.LoginFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Pacientes.LoginPatientFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Pacientes.PatientFragment;
import com.example.calo_pc.treatmacy.R;

public class PatientActivity extends AppCompatActivity implements LoginPatientFragment.OnFragmentInteractionListener, PatientFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        loadFragment();
    }

    public void loadFragment(){

        LoginPatientFragment loginPatientFragment = new LoginPatientFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_patient_container,loginPatientFragment).addToBackStack("Vuelta actividad principal").commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
