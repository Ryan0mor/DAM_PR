/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer05_A;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Carina*/
public class Ejercicio5_1 {
    public static float pideFloat(String mensaje) throws IOException{
        float n;
        String cadena;
        BufferedReader br = 
            new BufferedReader(new InputStreamReader (System.in));
        System.out.println(mensaje);
        cadena = br.readLine();
        //propago el error InputMismatchException
        n = Float.parseFloat(cadena);
        return n;
    }
    
    public static int pideEntero(String mensaje) throws ErrorcicoException{
        //pide un entero mayor que 10, si no lo consigue, deuekve un error
        Scanner teclado = new Scanner(System.in);
        int n;
            try {
                System.out.println(mensaje);
                n = teclado.nextInt();
                if (n < 10) {
                    throw new ErrorcicoException("El número tiene que ser igual o superior a 10");    
                }
                return n;
            }catch(InputMismatchException errorcico) {
                //propagar la excepción
                throw errorcico;
            }
        }
    
    public static String pideNombre () throws ErrorcicoException{
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce un nombre: ");
        nombre = teclado.nextLine();
        int lon = nombre.length();
        if (lon == 0) {
            //el nombre no contiene ningún caracter
            throw new ErrorcicoException("No has escrito tu nombre: ");
        }
        if (lon < 2) {
            throw new ErrorcicoException("Ese nombre es demasiado corto, corto: ");
        }
        if (lon > 10) {
            throw new ErrorcicoException("Que te crees la duquesa de Alba???: ");
        }
        if (nombre.equalsIgnoreCase("Cris")) {
            throw new ErrorcicoException("Cris sólo hay una: ");
        }
        return nombre;
    }
    
    public static float pideNota () throws ErrorcicoException{
        Scanner teclado = new Scanner(System.in);
        float nota;
        System.out.println("Introduce una nota: ");
        try {
            nota = teclado.nextFloat();
            if (nota < 0) {
                throw new ErrorcicoException("La nota no puede ser negativa");
            }
            if (nota == 0) {
                throw new ErrorcicoException("Lamentablemente desde la Logse "
                        + "no se puede usar el 0");
            }
            if (nota > 10) {
              throw new ErrorcicoException("Dile al listillo que no es pa' tanto");  
            }
        }catch(InputMismatchException errorcico) {
            //propagar la excepción
            throw new ErrorcicoException("No has introducido un float, "
                    + "comprueba el ,");
        }
        return nota;
    }
    
    public static void main(String[] args) {
        boolean siempre = true;
        while (siempre) {            
            try {
                System.out.println("Buenos días tu nota es: " + pideNota());
            } catch (ErrorcicoException ex) {
                System.out.println(ex.getMessage());
            }
        }
        int n;
        try {
            float n2 = pideFloat("Introduce un número con decimales: ");
        } catch (IOException ex) {
            System.out.println("El teclado ha explotado");
        }catch(NumberFormatException errorcico){
            System.out.println("He dicho un número con decimales");
        }
        try {
            try {
                n = pideEntero("Introduce un número: ");
            } catch (ErrorcicoException ex) {
                System.out.println("He dicho un número");
            }
        } catch (InputMismatchException errorcico) {
            System.out.println("Apréndete los números");
        }
    }
}
