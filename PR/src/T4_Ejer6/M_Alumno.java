/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer6;

/**
 *
 * @author ryano
 */
public class M_Alumno {
    private String nombre;
    private float nota;
    private int edad;

    public M_Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public M_Alumno(String nombre, float nota, int edad) {
        this.nombre = nombre;
        this.nota = nota;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void cumpleanyos(){
        edad++;
    }
    public boolean isMayorDeEdad(){
        if (edad >=18) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return nombre + " " + edad + " " + nota;
    }
}
