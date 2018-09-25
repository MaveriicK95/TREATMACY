package com.example.calo_pc.treatmacy.Util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.se.omapi.Session;

import com.example.calo_pc.treatmacy.Actividades.FarmacistActivity;
import com.example.calo_pc.treatmacy.Objetos.Mail;

import java.net.PasswordAuthentication;
import java.security.Security;
import java.util.Properties;


public class EmailNotificationSender extends AsyncTask<Email, Void, Void> {

    private String[] addresses;
    private String asunto;
    private String cuerpo;
    private Context context;




    public EmailNotificationSender(String[] addresses, String asunto, String cuerpo, Context context) {
        this.addresses = new String[]{"carlosgonben@gmail.com"};
        this.asunto = "Asunto";
        this.cuerpo = "Cuerpo";
        this.context = context.getApplicationContext();
    }


    public void sendEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }
}
