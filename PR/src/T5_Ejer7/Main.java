/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class Main {
    public static void main(String[] args) {
        //Datos desde ventana
        String cantidad = "4";
        String palabra = "hola";
        String peso = "13";
        
        Dato d;
        try {
            d = new Dato(cantidad, palabra, peso);
            System.out.println(d);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
