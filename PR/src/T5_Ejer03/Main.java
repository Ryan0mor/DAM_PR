/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer03;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Main {
    public static void main(String[] args) {
        Integer numericos[] = new Integer[5];
        String numericoSt;
        int total = 0;
        int contador = 0;
        
        for (int i = 0; i < 5; i++) {
            try {
                numericoSt = JOptionPane.showInputDialog("dame otro numero");
                numericos[i] = Integer.parseInt(numericoSt);  
                total += numericos[i];
                contador++;
            } catch (NumberFormatException errorciko) {
                System.out.println("la has liado parda");
            }
            if (numericos[i] == null) {
                System.out.println("La has cagado");
            } else {
                System.out.println(numericos[i]);
            }
        } 
        System.out.println("La media es: "  + (total/contador) );

    }
    
}
