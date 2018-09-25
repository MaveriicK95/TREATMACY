package com.example.calo_pc.treatmacy.Controller;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.calo_pc.treatmacy.Objetos.Paciente;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PatientController {

    private static final String TAG = "FarmacistController";
    private Context context;
    private Gson gson;
    private List<Paciente> listaPacientes;

    public PatientController(Context context, Gson gson, List<Paciente> listaPacientes) {
        this.context = context;
        this.gson = gson;
        this.listaPacientes = new ArrayList<>();
    }

    public void insertPatient(Paciente paciente) {

        HashMap<String, String> pacienteMap = new HashMap<>();
        pacienteMap.put("nombre", paciente.getNombre());
        pacienteMap.put("apellido1", paciente.getApellido1());
        pacienteMap.put("apellido2", paciente.getApellido2());
        pacienteMap.put("tarjeta_sanitaria", paciente.getTarjSanitaria());
        pacienteMap.put("fecha_nacimiento", paciente.getFecha_nacimiento().toString());
        pacienteMap.put("pin", String.valueOf(paciente.getPin()));
        pacienteMap.put("dni", paciente.getDni());

        JSONObject jsonpatient = new JSONObject(pacienteMap);

        Log.d(TAG, "JSONOBJECT" + jsonpatient.toString());

        VolleySingleton.getInstance(context).addToRequestQueue(new JsonObjectRequest(Request.Method.POST, Constantes.INSERT_PATIENT, jsonpatient,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d(TAG, "onResponse"+ response.toString());
                        procesarInsercion(response); // Procesar la respuesta Json
                        Log.d(TAG, "Inserción correcta");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error volley: ",  error.getMessage());
                    }
                })  //Fin de JsonObjectRequest
        );

    }

    private void procesarInsercion(JSONObject response) {

        try {
            Log.d(TAG,"Respuesta: "+response.toString());
            String estado = response.getString("estado de insercion");  // Obtener atributo estado
            switch (estado) {
                case "1": // Correcto
                    Toast.makeText(context,"Usuario insertado", Toast.LENGTH_LONG).show();
                    //getFarmaceuticos();
                    break;
                case "2": // error
                    Toast.makeText(context, response.getString("mensaje"), Toast.LENGTH_LONG).show();
                    break;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}