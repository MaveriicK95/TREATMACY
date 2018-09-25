package com.example.calo_pc.treatmacy.Objetos;

public final class Mail {

    private final String subject;
    private final String content;
    private final String from;
    private final String to;

    public Mail(String subject, String content, String from, String to) {
        this.subject = "Prueba";
        this.content = "Prueba de email";
        this.from = "carlosgonben@gmail.com";
        this.to = "carlo64@hotmail.es";
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
