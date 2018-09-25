package com.example.calo_pc.treatmacy.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.FarmacistFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.ListPatientsFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.ListTreatmentsFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.LoginFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.ProfileFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.RegistroFragment;
import com.example.calo_pc.treatmacy.R;

public class FarmacistActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener, RegistroFragment.OnFragmentInteractionListener, FarmacistFragment.OnFragmentInteractionListener, ListTreatmentsFragment.OnFragmentInteractionListener, ListPatientsFragment.OnFragmentInteractionListener, ProfileFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacist);
        loadFragment();
    }

    public void loadFragment(){

        LoginFragment loginFragment = new LoginFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_farmacist_container, loginFragment).commit();
    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
