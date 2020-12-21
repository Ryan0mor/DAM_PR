/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer01;

/**
 *
 * @author Ryan
 */
public class Main {
    public static void main(String[] args) {
        String edadString = "12a";
        int division;
        try {
            int num = Integer.parseInt(edadString);
            division = 10 / num;
            System.out.println("10 dividido para " + num + " es " + division);
        } catch (NumberFormatException errorcito) {
            //que voy a hacer si se produce el error
            System.out.println("fatal fatal");
            System.out.println(errorcito.getMessage());
            errorcito.printStackTrace();
        } catch (ArithmeticException errorcito){
            System.out.println("horrible");
        }
        //Aquí llegaré siempre
        System.out.println("Fin");

    }
}
