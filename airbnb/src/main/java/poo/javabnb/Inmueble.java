package poo.javabnb;

import java.util.*;

import java.util.List;

public class Inmueble {
    
    //Atributos
    private String titulo;
    private String calle;
    private int numero;
    private int CP;
    private String ciudad;
    private int maxHuéspedes;
    private int numHabitaciones;
    private int numCamas;
    private int numBaños;
    private String tipoPropiedad;
    private double precioNoche;
    private String servicios;
    private String foto;
    private double calificacion;

    // Constructor
    public Inmueble(String titulo, String calle, int numero, int CP, String ciudad, int maxHuéspedes, int numHabitaciones, int numCamas, int numBaños, String tipoPropiedad, double precioNoche, String servicios, String foto, double calificacion) {
        this.titulo = titulo;
        this.calle = calle;
        this.numero = numero;
        this.CP = CP;
        this.ciudad = ciudad;
        this.maxHuéspedes = maxHuéspedes;
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.numBaños = numBaños;
        this.tipoPropiedad = tipoPropiedad;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.foto = foto;
        this.calificacion = calificacion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getCP(){
        return CP;
    }
    
    public void setCP(int CP){
        this.CP = CP;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setNumero(String ciudad){
        this.ciudad = ciudad;
    }

    public int getMaxHuéspedes() {
        return maxHuéspedes;
    }

    public void setMaxHuéspedes(int maxHuéspedes) {
        this.maxHuéspedes = maxHuéspedes;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Método para mostrar información del inmueble
    public String mostrarInformacion() {
        return "\nInmueble: " + titulo +
        "\nDirección: " + calle + "," + numero + "," + CP + "," + ciudad +
        "\nMáximo de huéspedes: " + maxHuéspedes +
        "\nNúmero de habitaciones: " + numHabitaciones +
        "\nNúmero de camas: " + numCamas +
        "\nNúmero de baños: " + numBaños +
        "\nTipo de propiedad: " + tipoPropiedad +
        "\nPrecio por noche: $" + precioNoche +
        "\nServicios: " + servicios +
        "\nCalificación: " + calificacion + "/5";
    }

    // Método para actualizar la calificación basado en una nueva revisión
    public void actualizarCalificacion(double nuevaCalificacion) {
        this.calificacion = (this.calificacion + nuevaCalificacion) / 2; // Puede variar según cómo quieras calcular la media
    }
}
