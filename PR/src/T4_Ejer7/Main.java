/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer7;

/**
 *
 * @author Ryan
 */
public class Main {
    public static void main(String[] args) {
        double num1;
        double den1;
        double num2;
        double den2;
        String operacion;
        
        do {            
            num1 = Consola.pideDouble("Dame el nuemerador 1");
            den1 = Consola.pideDouble("Dame el denominador 1");
            num2 = Consola.pideDouble("Dame el nuemerador 2");
            den2 = Consola.pideDouble("Dame el denominador 2");
            operacion = Consola.pideCadena("Selecciona la operación a realizar: \"+”, \"-\", \"*” ó \"/”");
            switch (operacion){
                case "+":
                    System.out.println("La suma es: ");
                    break;
                case "- ":
                    System.out.println("La suma es: ");
                    break;
                case "*":
                    System.out.println("La suma es: ");
                    break;
                case "/":
                    System.out.println("La suma es: ");
                    break;
                default:
                    System.out.println("operación incorrecta");
                    
            }
            
        } while (num1 != 0);
    }
    
}
