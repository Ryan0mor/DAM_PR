/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Consola {
    public static float pideNota () throws ErrorcicoException{
        Scanner teclado = new Scanner(System.in);
        float nota;
        System.out.print("Introduce tu nota: ");
        try {
            nota = teclado.nextFloat();
            if (nota < 0 ) {
                throw new ErrorcicoException("la nota no puede ser negativa");
            }
            if (nota >10) {
                throw new ErrorcicoException("Te has pasado");
            }
        } catch (InputMismatchException e) {
            throw new ErrorcicoException("no es un float");
        }
        return nota;
    }
    
    public static String pideNombre() throws ErrorcicoException {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Tu nombre");
        nombre = teclado.nextLine();
        int longitud = nombre.length();
        if (longitud == 0) {
            throw new ErrorcicoException("no has escrito nada");
        }
        if (longitud < 3) {
            throw new ErrorcicoException("El nombre es muy corto");
        }
        if (longitud > 10) {
            throw new ErrorcicoException("Ese nombre es muy largo");
        }
        return nombre;
    }
    public static int pideEntero(String mensaje){
        Scanner teclado = new Scanner(System.in);
        String resultadoSt;
        
        /*do {            
            try {
                resultadoSt = teclado.nextLine();
            
            } catch (NumberFormatException errorciko) {
            
            } 
        } while (true);
        */
    return 10;
    }
}
