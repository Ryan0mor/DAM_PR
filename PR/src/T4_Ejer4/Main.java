/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer4;

/**
 *
 * @author ryano
 */
public class Main {
    public static void main(String[] args) {
        Fecha miCumple = new Fecha(31, 13, 1987);
        System.out.println(miCumple.esCorrecta());        
        System.out.println(miCumple.getMesLetras(1));
        System.out.println(miCumple.muestraFechaCorta());
        System.out.println(miCumple.muestraFechaLarga());
        
        
    }    
}
