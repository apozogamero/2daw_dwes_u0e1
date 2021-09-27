package com.mycompany.u0.e1.nominas.laboral;

/**
 *
 * @author taure
 */
public class Persona {

    /**
     *
     */
    public String nombre,

    /**
     *
     */
    dni;

    /**
     *
     */
    public char sexo;

    /**
     *
     * @param nombre
     * @param dni
     * @param sexo
     */
    public Persona(String nombre, String dni, char sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
    }

    /**
     *
     * @param nombre
     * @param sexo
     */
    public Persona(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    /**
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
     *
     */
    public void Imprime() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
    }
}
