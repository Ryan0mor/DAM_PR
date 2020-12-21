/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_GestorCoches;

import T5_Ejer8.Coche;
import T5_Ejer8.MiExcepcion;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Main {
    public void altaCoche(){
        coche c;
        try {
            String marca = JOptionPane.showInputDialog("que marca?");
            String matricula = JOptionPane.showInputDialog("que marca?");
            String km = JOptionPane.showInputDialog("que km?");
            c = new coche(marca, matricula, km);
            System.out.println(c + "ha sido dado de alta");
        } catch (Exception e) {
        }
        
    }
    
    public void bajaCoche(){
        String matricula = JOptionPane.showInputDialog("introcuce la matricula");
        Coche c = GestorCoches.buscaCochePorMatricula(matricula);
        if (c != null) {
            int opcion = JOptionPane.showConfirmDialog(null, "Segura?");
            if (opcion == 0) {
                if (GestorCoches.baja(c)) {
                    System.out.println("Baja Exitosa");
                } else {
                    System.out.println("Ha habido un problemo");
                }
            }
        }
        
        
    }
    public static void main(String[] args) throws MiExcepcion {
        Coche c;
        GestorCoches.creaLista();
        try {
            c = new Coche("Tesla",  "1234FCK", 20000);
            GestorCoches.alta(c);
            c = new Coche("Tesla chino",  "5678FCK", 40000);
            GestorCoches.alta(c);
            
            /*c = GestorCoches.buscaCochePorMatricula("5678FCK");
            if (c != null) {
                int opcion = JOptionPane.showConfirmDialog(null, "hola");
                if (opcion == 0) {
                    GestorCoches.baja(c);
                    System.out.println("baja exitosa");  
                } else{
                    System.out.println("baja cancelada");
                }
               
            } else{
                System.out.println("fallo en la baja");
            }
            */
        
        if (true) {
            
        }
        
        if (GestorCoches.modificaMatricula("12345FCK", "54321FCK")) {
            System.out.println("modificación exitosa");
        }
        
        
        
        
    }
}
