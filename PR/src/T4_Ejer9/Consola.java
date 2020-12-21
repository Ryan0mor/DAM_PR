/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer9;

import T4_Ejer7.*;
import T4_Ejer5.*;
import T4_Ejer3.*;
import T3_Ejer41.*;
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
    public static int pideEntero (String mensaje){
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje);
        int entero = teclado.nextInt();
        return entero;
    }
    public static double pideDouble (String mensaje){
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje);
        double entero = teclado.nextDouble();
        return entero;
    }    
}
