package com.example.calo_pc.treatmacy.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.FarmacistFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.ListPatientsFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.ListTreatmentsFragment;
import com.example.calo_pc.treatmacy.Fragmentos.Farmaceuticos.ProfileFragment;
import com.example.calo_pc.treatmacy.R;

public class MainActivity extends AppCompatActivity implements  FarmacistFragment.OnFragmentInteractionListener, ProfileFragment.OnFragmentInteractionListener, ListPatientsFragment.OnFragmentInteractionListener, ListTreatmentsFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadActivities();
    }

    public void loadActivities () {

        ImageButton btnFarmacist = findViewById(R.id.btnAreaFarmaceuticos);
        btnFarmacist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FarmacistActivity.class));
            }
        });

        ImageButton btnPatient = findViewById(R.id.btnAreaPacientes);
        btnPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PatientActivity.class));
            }
        });
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
