/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer9;

/**
 *
 * @author Ryan
 */
public class Cliente {
    private String nombre;
    private double cuota;
    private String deporte;

    public Cliente(String nombre, double cuota, String deporte) {
        this.nombre = nombre;
        this.cuota = cuota;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    public String toString(){
        
        return nombre + " " + cuota + " " + deporte ;
    }
    
}
