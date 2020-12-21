/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer2;

/**
 *
 * @author ryano
 */
public class Tamagotchi {
    private String nombre;
    private int cantidadVida;
    private int maxVida;
    
    public Tamagotchi(String nombre, int maxVida) {
        this.nombre = nombre;
        this.cantidadVida = 0;
        this.maxVida = maxVida;
    }
    
    public String visualiza () {
        return "Nombre: " + nombre + " Cantidad de vida: " + cantidadVida + 
                "Vida máxima: " + maxVida;        
    }
    
    public void juega() {
        
    }
}
