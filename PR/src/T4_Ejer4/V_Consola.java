/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer4;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class V_Consola {
  
    public static String pideCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje);
        String num = teclado.nextLine();
        return num;
    }
}
