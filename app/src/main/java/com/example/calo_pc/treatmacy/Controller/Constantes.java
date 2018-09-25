package com.example.calo_pc.treatmacy.Controller;

/**
 * Clase que contiene los códigos usados en "I Wish" para
 * mantener la integridad en las interacciones entre actividades
 * y fragmentos
 */
public class Constantes {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;

    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "http://192.168.1.135";
    /**
     * URLs del Web Service
     */
    public static final String GET_FARMACISTS = IP + PUERTO_HOST + "/TREATMACY/Controladores/SelectFarmaceutico.php";
    public static final String GET_BY_ID = IP + PUERTO_HOST + "/I%20Wish/obtener_meta_por_id.php";
    public static final String UPDATE = IP + PUERTO_HOST + "/I%20Wish/actualizar_meta.php";
    public static final String DELETE = IP + PUERTO_HOST + "/I%20Wish/borrar_meta.php";
    public static final String INSERT_FARMACIST = IP + PUERTO_HOST + "/TREATMACY/Controladores/InsertFarmaceutico.php";
    public static final String INSERT_PATIENT = IP + PUERTO_HOST + "/TREATMACY/Controladores/InsertPaciente.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}
