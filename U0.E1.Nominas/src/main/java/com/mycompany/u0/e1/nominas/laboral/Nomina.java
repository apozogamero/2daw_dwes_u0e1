package com.mycompany.u0.e1.nominas.laboral;

/**
 *
 * @author taure
 */
public class Nomina {
    private static final int SUELDO_BASE[] = {50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000, 230000};
    
    /**
     *
     * @param emp
     * @return
     */
    public int sueldo(Empleado emp) {
        int s = SUELDO_BASE[emp.getCategoria()] + 5000*emp.anyos;
        return s;
    }
}
