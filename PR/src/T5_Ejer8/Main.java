/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer8;

/**
 *
 * @author Ryan
 */
public class Main {
    public static void main(String[] args) {
        String matricula = "1234FCK";
        String modelo = "Tesla modle 4";
        String km = "17777";
        
        Coche c;
        try {
            c = new Coche(modelo, matricula, km);
            System.out.println(c);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
}
