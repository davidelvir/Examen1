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
public class nasrralah {
    private String contraseña;

    public nasrralah(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public nasrralah() {
    }

    @Override
    public String toString() {
        return "nasrralah{" + "contrase\u00f1a=" + contraseña + '}';
    }
    
}
