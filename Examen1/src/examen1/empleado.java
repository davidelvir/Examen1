/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author David
 */
public class empleado extends persona{
    private String empleo;

    public empleado() {
        super();
    }

    public empleado(String empleo, String nombre, int edad, String id, String id_boleto, String dept, int dinero) {
        super(nombre, edad, id, id_boleto, dept, dinero);
        this.empleo = empleo;
    }

    

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
