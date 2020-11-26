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
        int num1;
        int den1;
        int num2;
        int den2;
        String operacion;
        
        do {            
            num1 = Consola.pideEntero("Dame el nuemerador 1");
            den1 = Consola.pideEntero("Dame el denominador 1");
            num2 = Consola.pideEntero("Dame el nuemerador 2");
            den2 = Consola.pideEntero("Dame el denominador 2");
            operacion = Consola.pideCadena("Selecciona la operación a realizar: \"+”, \"-\", \"*” ó \"/”");
            NumRacional_OLD numR1 = new NumRacional_OLD(num1, den1);
            NumRacional_OLD numR2 = new NumRacional_OLD(num2, den2);
            switch (operacion){
                case "+":
                    System.out.println("La suma es: ");
                    break;
                case "- ":
                    System.out.println("La suma es: ");
                    break;
                case "*":
                    System.out.println("La multiplicacion es: " + NumRacional_OLD.toString(NumRacional_OLD.multiplica(numR1, numR2)));
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
