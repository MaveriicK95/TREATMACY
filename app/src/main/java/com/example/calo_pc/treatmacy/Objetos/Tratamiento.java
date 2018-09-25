package com.example.calo_pc.treatmacy.Objetos;

import java.util.Date;

public class Tratamiento {

    private int id;
    private int id_paciente;
    private int id_farmaceutico;
    private int duracion;
    private int id_posologia;
    private Date fecha_inicio;
    private Date fecha_fin;

    public Tratamiento() {
    }

    public Tratamiento(int id, int id_paciente, int id_farmaceutico, int duracion, int id_posologia, Date fecha_inicio, Date fecha_fin) {
        this.id = id;
        this.id_paciente = id_paciente;
        this.id_farmaceutico = id_farmaceutico;
        this.duracion = duracion;
        this.id_posologia = id_posologia;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Tratamiento(int id_paciente, int id_farmaceutico, int duracion, int id_posologia) {
        this.id_paciente = id_paciente;
        this.id_farmaceutico = id_farmaceutico;
        this.duracion = duracion;
        this.id_posologia = id_posologia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_farmaceutico() {
        return id_farmaceutico;
    }

    public void setId_farmaceutico(int id_farmaceutico) {
        this.id_farmaceutico = id_farmaceutico;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getId_posologia() {
        return id_posologia;
    }

    public void setId_posologia(int id_posologia) {
        this.id_posologia = id_posologia;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "id=" + id +
                ", id_paciente=" + id_paciente +
                ", id_farmaceutico=" + id_farmaceutico +
                ", duracion=" + duracion +
                ", id_posologia=" + id_posologia +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                '}';
    }
}
