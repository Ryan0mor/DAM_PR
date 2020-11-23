/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer8;

/**
 *
 * @author ryano
 */
public class Main {
    public static void main(String[] args) {
        int [] arreglo = {1, 2, 4};
        
        LineaAutobus linea1 = new LineaAutobus("43", 20, arreglo);
        LineaAutobus linea2 = new LineaAutobus("12", 15, arreglo);
        LineaAutobus linea3 = new LineaAutobus("21", 30, arreglo);
        LineaAutobus linea4 = new LineaAutobus("32", 45, arreglo);

        System.out.println(linea1.toString());
        System.out.println(linea2.toString());
        System.out.println(linea3.toString());
        System.out.println(linea4.toString());

    }
}
