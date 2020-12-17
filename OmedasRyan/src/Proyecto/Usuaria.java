/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Date;

/**
 *
 * @author ryano
 */
public class Usuaria {
    private String nombre;
    private String password;
    private Fecha nacimiento;

    public Usuaria(String nombre, String password, Fecha nacimiento) {
        this.nombre = nombre;
        this.password = password;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Proyecto.Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }
    @Override
    public String toString() {
        String muestraPass = "";
        for (int i = 0; i < password.length(); i++) {
            muestraPass += "*";
        }
        return nombre + "         " + muestraPass + "          " + 
                nacimiento.muestraFechaLarga();
    }
    
}
