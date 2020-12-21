/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer04;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Main {
    public static void main(String[] args) {
        int numerador;
        int denominador;
        double resultado;
        String cadena;
        
        for (int i = 0; i < 5; i++) {
            try {
                cadena = JOptionPane.showInputDialog("numerador: ");
                numerador = Integer.parseInt(cadena);
                cadena = JOptionPane.showInputDialog("Denominador: ");
                denominador = Integer.parseInt(cadena);
                resultado = numerador/denominador;
                System.out.println("La división es: " + resultado);
            } catch (NumberFormatException errorciko) {
                System.out.println("has metido una leter");
            } catch (ArithmeticException errorciko) {
                System.out.println("eso da infinito y mas allá");
            }
            
        }
    } 
}
