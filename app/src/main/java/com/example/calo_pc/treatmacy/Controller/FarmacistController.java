package com.example.calo_pc.treatmacy.Controller;

import android.app.DownloadManager;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.calo_pc.treatmacy.Objetos.Farmaceutico;
import com.example.calo_pc.treatmacy.R;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FarmacistController {

    private static final String TAG = "FarmacistController";
    private Context context;
    private Gson gson;
    private List<Farmaceutico> listaFarmaceuticos;

    public FarmacistController (Context context) {
        this.context = context;
        gson = new Gson();
        listaFarmaceuticos = new ArrayList<>();
    }

    public void insertFarmacist (Farmaceutico farmaceutico) {

        HashMap<String, String> map = new HashMap<>();

        map.put("nombre",farmaceutico.getNombre());
        map.put("apellido1",farmaceutico.getApellido1());
        map.put("apellido2", farmaceutico.getApellido2());
        map.put("num_colegiado", farmaceutico.getNumColegiado());
        map.put("telefono", farmaceutico.getTelefono());
        map.put("id_farmacia", String.valueOf(farmaceutico.getId_farmacia()));
        map.put("username", farmaceutico.getUsername());
        map.put("password", farmaceutico.getPassword());

        JSONObject jsonObject = new JSONObject(map);

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsonObject);

        Log.d("JSONOBJECT",jsonObject.toString());

        //Volley
        VolleySingleton.getInstance(context).addToRequestQueue(
                new JsonObjectRequest(Request.Method.POST, Constantes.INSERT_FARMACIST,jsonObject,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d(TAG, "onResponse");
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

    public void getFarmacuticos() {
        VolleySingleton.getInstance(context).addToRequestQueue(
                new JsonObjectRequest(Request.Method.GET, Constantes.GET_FARMACISTS, null,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                procesarRespuesta(response);// Procesar la respuesta Json
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d(TAG, "Error volley" + error.getMessage());
                            }
                        }

                )
        );
    }


    private void procesarRespuesta(JSONObject response) {
        try {
            Log.d(TAG, "Respuesta: " + response.toString());
            String estado = response.getString("estado");

            switch (estado) {
                case "1": // correcto
                    JSONArray mensaje = response.getJSONArray("farmaceuticos");

                    Farmaceutico[] usuarios = gson.fromJson(mensaje.toString(), Farmaceutico[].class); // preparar con Gson
                    // Inicializar adaptador
                    listaFarmaceuticos = new ArrayList<>(Arrays.asList(usuarios));
                    Log.d(TAG, "Conectado");
                    Log.d(TAG, listaFarmaceuticos.get(0).toString());
                    break;
                case "2": // error
                    String mensaje2 = response.getString("mensaje");
                    Toast.makeText(
                            context,
                            mensaje2,
                            Toast.LENGTH_LONG).show();
                    break;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
