package com.example.calo_pc.treatmacy.Objetos;

public class Medicamento {

    private int id;
    private String nombre;
    private String ref;

    public Medicamento() {
    }

    public Medicamento(int id, String nombre, String ref) {
        this.id = id;
        this.nombre = nombre;
        this.ref = ref;
    }

    public Medicamento(String nombre, String ref) {
        this.nombre = nombre;
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ref='" + ref + '\'' +
                '}';
    }
}
