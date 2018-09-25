package com.example.calo_pc.treatmacy.Controller;

import android.content.Context;
import android.widget.Toast;
import java.util.Date;
import java.util.Calendar;

public class ControladorRecordatorios {

    private int dias;
    private int diferenciaAnos;
    private int diferenciaDias;

    private int repeticiones;
    private Date fecha_actual;
    private Context context;


    public ControladorRecordatorios(int fecha_actual) {
        this.fecha_actual = Calendar.getInstance().getTime();
    }

    public int comprobacionFechas(Date fecha) {

        //Separamos año, meses y dias de la fecha para calcular las repeticiones
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);

        int dia = calendar.get(Calendar.DAY_OF_YEAR);
        int ano = calendar.get(Calendar.YEAR);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(fecha_actual);

        int diaActual = calendar2.get(Calendar.DAY_OF_YEAR);
        int anoActual = calendar2.get(Calendar.YEAR);

        //Comprobamos si el tratamiento ocurre en años diferentes

        if (ano - anoActual > 0) {
            diferenciaAnos = ano - anoActual;

            if (dia - diaActual < 0) {
                diferenciaDias = Math.abs(dia - diaActual);
                dias = diferenciaAnos * 365 + diaActual - diferenciaDias;
            } else {
                dias = diferenciaAnos * 365 + diaActual + dia;
            }

        } else {
            dias = dia - diaActual;
        }

        return dias;
    }

}
