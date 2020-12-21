/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_OLD;

import java.util.Date;

/**
 *
 * @author ryano
 */
public class Usuario {
    private String nombre;
    private String password;
    private Date nacimiento;

    public Usuario(String nombre, String password, Date nacimiento) {
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

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    @Override
    public String toString() {
        String muestraPass = "";
        for (int i = 0; i < password.length(); i++) {
            muestraPass += "*";
        }
        return nombre + "     " + muestraPass + "     " + nacimiento;
    }
    
}
