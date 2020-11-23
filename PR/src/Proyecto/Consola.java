/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import T4_Ejer6.*;
import T4_Ejer5.*;
import T4_Ejer3.*;
import T3_Ejer41.*;
import T4_Ejer4.*;
import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Consola {
  
    public static String pideCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje + " ");
        String cadena = teclado.nextLine();
        return cadena;
    }
    
    public static String registraPassword(String nombre){
        Scanner teclado = new Scanner(System.in);
        String pass1;
        String pass2;
        do {
            System.out.println("Introduce una contraseña de más de 3 chars y distinta del nombre:");
            pass1 = teclado.nextLine();
            System.out.println("Introducela de nuevo");
            pass2 = teclado.nextLine();
        } while (pass1.compareTo(pass2) != 0 || pass1.compareToIgnoreCase(nombre) == 0 || pass1.length() < 4);
        return pass1;
    }
    
    public static int pideOpcion(){
        Scanner teclado = new Scanner(System.in);
        int opcion = 99;
        String cadenaOpcion;
                
        System.out.println("Elige bien o muere");
        cadenaOpcion = teclado.nextLine();

        if (cadenaOpcion.length() == 1) {
            if(cadenaOpcion.charAt(0) > 47 && cadenaOpcion.charAt(0) < 58){
                opcion = Integer.parseInt(cadenaOpcion);
            } else {
                System.out.println("Eso no es un caracter del 0 al 9");
            }
        } else {
            System.out.println("Lo que has introducido tiene mas de un char");
        }            
        return opcion;
    }
}
