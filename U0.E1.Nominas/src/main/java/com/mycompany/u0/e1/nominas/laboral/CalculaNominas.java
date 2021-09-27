package com.mycompany.u0.e1.nominas.laboral;

/**
 *
 * @author taure
 */
public class CalculaNominas {
    
    private static void escribe(Empleado e1, Empleado e2) {
        Nomina n = new Nomina();
        e1.Imprime();
        System.out.println(n.sueldo(e1));
        e2.Imprime();
        System.out.println(n.sueldo(e2));
    }
    
    /**
     *
     * @param args
     * @throws DatosNoCorrectosException
     */
    public static void main(String[] args) throws DatosNoCorrectosException {
        Empleado e1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
        Empleado e2 = new Empleado("Ada Lovelace", "32000031R", 'F');
        
        escribe(e1,e2);
        e2.incrAnyo();
        e2.incrAnyo();
        e1.setCategoria(9);
        escribe(e1,e2);
    }
}