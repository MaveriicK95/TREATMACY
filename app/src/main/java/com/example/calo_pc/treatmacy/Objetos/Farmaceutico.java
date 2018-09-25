package com.example.calo_pc.treatmacy.Objetos;

public class Farmaceutico {

    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String numColegiado;
    private String username;
    private String password;
    private String telefono;
    private String id_farmacia;

    public Farmaceutico(int id, String nombre, String apellido1, String apellido2, String telefono, String numColegiado, String username, String password, String id_farmacia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.numColegiado = numColegiado;
        this.username = username;
        this.password = password;
        this.id_farmacia = id_farmacia;
    }

    public Farmaceutico(String nombre, String apellido1, String apellido2, String telefono, String numColegiado) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.numColegiado = numColegiado;
    }

    public Farmaceutico(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Farmaceutico() {

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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId_farmacia() {
        return id_farmacia;
    }

    public void setId_farmacia(String id_farmacia) {
        this.id_farmacia = id_farmacia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Farmaceutico: " +
                "ID: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Apellido1: '" + apellido1 + '\'' +
                ", Apellido2: '" + apellido2 + '\'' +
                ", NumColegiado: '" + numColegiado + '\'' +
                ", Username: '" + username + '\'' +
                ", Password: '" + password + '\'' +
                ", Id_farmacia: " + id_farmacia +
                '}';
    }
}
