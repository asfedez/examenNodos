/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author administrador
 */
public class Persona {
    private String codigo;
    private String cedula;
    private String nombre;
    private int edad;
    private String fecha;
    private String prioridad;
    private Persona siguiente;

    public Persona(String codigo, String cedula, String nombre, int edad, String fecha, String prioridad, Persona persona) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.siguiente = persona;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the persona
     */
    public Persona getSiguiente() {
        return siguiente;
    }

    /**
     * @param persona the persona to set
     */
    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }
    
    public String getInformacion()
    {
        return "Persona "+getCodigo()+", Cedula "+getCedula()+", Nombre "+getNombre()+", Edad "+getEdad()+
                ", prioridad "+getPrioridad();
    }
    
}
