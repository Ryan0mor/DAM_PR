/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_GestorCoches;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Consola {
    //El clásico
    public static void muestraMensaje(String mensaje){
        System.out.println(mensaje);
    }      
    //Muestra el menú de opciones
    public static void muestraMenu () {
        System.out.println(
            "1. Alta de usuaria\n" +
            "2. Baja\n" +
            "3. Consulta según matrícula\n" +
            "4. Modificación\n" +
            "otro.- Fin ");     
    }
  
    public static String pideCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje + " ");
        String cadena = teclado.nextLine();
        return cadena;
    }
    
    //Pide enteros hasta que estos sean válidos
    public static int pideEntero(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String enteroSt;
        int enterico;
        boolean esValido = true;
        do {
            System.out.println(mensaje);
            enteroSt = teclado.nextLine();
            if (enteroSt.length() >= 1) {
                for (int i = 0; i < enteroSt.length(); i++) {
                    if(enteroSt.charAt(i) < 47 || enteroSt.charAt(i) > 58){
                        esValido = false;
                        System.out.println("Eso no es un número entero");
                    } else {
                        esValido = true;
                    }
                }
            } else {
                System.out.println("Eso es un espacio en blanco");
                esValido = false;
            }
        } while (esValido != true);
        enterico = Integer.parseInt(enteroSt);
        return enterico;
    }
    
    /*Pide una cadena:
    - si la longitud de la cadena es mayor de 1
    - Si la cadena no es un carater del 0 al 9
    Devolverá -1*/
    public static int pideOpcion(){
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        String cadenaOpcion;       
        do {
            System.out.println("Elige bien o muere");
            cadenaOpcion = teclado.nextLine();         
            if (cadenaOpcion.length() == 1) {
                if(cadenaOpcion.charAt(0) > 47 && cadenaOpcion.charAt(0) < 58){
                    opcion = Integer.parseInt(cadenaOpcion);
                    return opcion;
                } else {
                System.out.println("Eso no es un caracter del 0 al 9");
                }
            } else {
            System.out.println("Lo que has introducido tiene"
                    + "longitud distinta a un caracter");
            }
        } while (true);
    }
    
 
}
