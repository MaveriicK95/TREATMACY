package com.example.calo_pc.treatmacy.Objetos;

public class Incidencia {

    private int id;
    private int id_paciente;
    private int id_farmaceutico;
    private String desceripcion;

    public Incidencia() {
    }

    public Incidencia(int id, int id_paciente, int id_farmaceutico, String desceripcion) {
        this.id = id;
        this.id_paciente = id_paciente;
        this.id_farmaceutico = id_farmaceutico;
        this.desceripcion = desceripcion;
    }

    public Incidencia(int id_paciente, int id_farmaceutico, String desceripcion) {
        this.id_paciente = id_paciente;
        this.id_farmaceutico = id_farmaceutico;
        this.desceripcion = desceripcion;
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

    public String getDesceripcion() {
        return desceripcion;
    }

    public void setDesceripcion(String desceripcion) {
        this.desceripcion = desceripcion;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "id=" + id +
                ", id_paciente=" + id_paciente +
                ", id_farmaceutico=" + id_farmaceutico +
                ", desceripcion='" + desceripcion + '\'' +
                '}';
    }
}
