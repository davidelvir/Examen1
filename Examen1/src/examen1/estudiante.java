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
public class estudiante extends persona{
    private String carrera;

    public estudiante(String carrera, String nombre, int edad, String id, String id_boleto, String dept, int dinero) {
        super(nombre, edad, id, id_boleto, dept, dinero);
        this.carrera = carrera;
    }

    

    public estudiante() {
        super();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
