package com.example.calo_pc.treatmacy.Objetos;

public class Posologia {

    private int id;
    private int id_medicamento;
    private int dosis;
    private int tiempo;

    public Posologia(int id, int id_medicamento, int dosis, int tiempo) {
        this.id = id;
        this.id_medicamento = id_medicamento;
        this.dosis = dosis;
        this.tiempo = tiempo;
    }

    public Posologia(int id_medicamento, int dosis, int tiempo) {
        this.id_medicamento = id_medicamento;
        this.dosis = dosis;
        this.tiempo = tiempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Posologia{" +
                "id=" + id +
                ", id_medicamento=" + id_medicamento +
                ", dosis=" + dosis +
                ", tiempo=" + tiempo +
                '}';
    }
}
