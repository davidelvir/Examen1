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
public class persona {
    private String nombre;
    private int edad;
    private String id;
    private String id_boleto;
    private String dept;
    private int dinero;

    public persona() {
    }

    public persona(String nombre, int edad, String id, String id_boleto,String dept, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.dept = dept;
        this.dinero = dinero;
        this.id_boleto = id_boleto;
    }

    public String getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(String id_boleto) {
        this.id_boleto = id_boleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", dept=" + dept + ", dinero=" + dinero + '}';
    }
    
    
}
