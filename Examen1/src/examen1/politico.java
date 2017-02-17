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
public class politico extends persona{
    private String partido;

    public politico() {
        super();
    }

    public politico(String partido, String nombre, int edad, String id, int dept, int dinero) {
        super(nombre, edad, id, dept, dinero);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "politico{" + "partido=" + partido + '}';
    }
    
}
