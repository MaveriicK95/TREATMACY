package com.example.calo_pc.treatmacy.Objetos;

import java.util.Date;

public class Paciente {

    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private Date fecha_nacimiento;
    private String tarjSanitaria;
    private int pin;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String apellido1, String apellido2, Date fecha_nacimiento, String tarjSanitaria, int pin) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tarjSanitaria = tarjSanitaria;
        this.pin = pin;
    }

    public Paciente(int id, String nombre, String apellido1, String apellido2, Date fecha_nacimiento, String tarjSanitaria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tarjSanitaria = tarjSanitaria;
    }

    public Paciente(int id, String nombre, String apellido1, String apellido2, String dni, Date fecha_nacimiento, String tarjSanitaria, int pin) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tarjSanitaria = tarjSanitaria;
        this.pin = pin;
    }



    public Paciente(String nombre, String apellido1, String apellido2, Date fecha_nacimiento, String tarjSanitaria) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tarjSanitaria = tarjSanitaria;
    }

    public Paciente( String nombre, String apellido1, String tarjSanitaria) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.tarjSanitaria = tarjSanitaria;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getTarjSanitaria() {
        return tarjSanitaria;
    }

    public void setTarjSanitaria(String tarjSanitaria) {
        this.tarjSanitaria = tarjSanitaria;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", tarjSanitaria='" + tarjSanitaria + '\'' +
                '}';
    }
}
