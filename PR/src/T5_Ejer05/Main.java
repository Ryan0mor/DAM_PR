/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class Main {
    public static float pideFloat(String mensaje) throws IOException{
        float n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mensaje);
        String cadena = br.readLine();
        //propago el error
        n = Float.parseFloat(cadena);
        return n;
    }
    
    public static int pideEntero (String mensaje){
        //Pide un int y si no lo consigue devuelve error
        Scanner teclado = new Scanner(System.in);
        int n;
        try {
            System.out.println(mensaje);
            n = teclado.nextInt();
        } catch (InputMismatchException err) {
            //propaga la excepción
            throw err;
        }
        return n;
    }
    public static void main(String[] args) {
        try {
            float n = pideFloat("dame");
        } catch (IOException ex) {
            System.out.println("El teclado ha explotao");
        }
        
    }
}
