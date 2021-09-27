package com.mycompany.u0.e1.nominas.laboral;

/**
 *
 * @author taure
 */
public class Empleado extends Persona {
    private int categoria;

    /**
     *
     */
    public int anyos;

    /**
     *
     * @param nombre
     * @param dni
     * @param sexo
     */
    public Empleado(String nombre, String dni, char sexo) {
        super(nombre, dni, sexo);
        categoria = 1;
        anyos = 0;
    }

    /**
     *
     * @param nombre
     * @param dni
     * @param sexo
     * @param categoria
     * @param anyos
     * @throws DatosNoCorrectosException
     */
    public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
        super(nombre, dni, sexo);
        if (categoria < 10 || categoria > 1 || anyos > 0) {
            this.categoria = categoria;
            this.anyos = anyos;
        } else
            throw new DatosNoCorrectosException("Datos no correctos.");
    }

    /**
     *
     * @return
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(int categoria) {
        if (categoria < 10 || categoria > 1)
            this.categoria = categoria;
        else
            System.out.println("Parámetro no válido");
    }
    
    /**
     *
     */
    public void incrAnyo() {
        anyos++;
    }
    
    /**
     *
     */
    public void Imprime() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Categoría: " + categoria);
        System.out.println("Años: " + anyos);
    }
}