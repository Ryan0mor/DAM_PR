/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_GestorCoches;


import T5_GestorCoches.MiExcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Main {
    public void altaCoche(){
        Coche c;
        try {
            String marca = JOptionPane.showInputDialog("que marca?");
            String matricula = JOptionPane.showInputDialog("que marca?");
            String km = JOptionPane.showInputDialog("que km?");
            c = new Coche(marca, matricula, km);
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
    
    public void modificaMatricula() throws MiExcepcion{
        String matriculaOld;
        String matriculaNew;
        Coche c;
        matriculaOld = Consola.pideCadena("La matricula a modificar es: ");
        c = GestorCoches.buscaCochePorMatricula(matriculaOld);
            if (c != null) {
                matriculaNew = Consola.pideCadena("La matricula a modificar es: ");
                if (GestorCoches.modificaMatricula(matriculaOld, matriculaNew)) {

                }
            }
    }
        
    
    public static void main(String[] args) throws MiExcepcion {
        Coche c;
        GestorCoches.creaLista();
        int opcion;
        int opcionDialogo;
        String modelo = "";
        String matricula = "";
        String nuevaMatricula;
        String km = "";
        
        //Coches de prueba
        c = new Coche("Tesla",  "1234FCK", 20000);
        GestorCoches.alta(c);
        c = new Coche("Tesla chino",  "5678FCK", 40000);
        GestorCoches.alta(c);
            
        do {
            Consola.muestraMenu();
            opcion = Consola.pideOpcion();
            switch (opcion){
                case 1:
                    modelo = Consola.pideCadena("Introduce el modelo");
                    matricula = Consola.pideCadena("La matrícula");
                    km = Consola.pideCadena("Los km");
                    c = new Coche(modelo, matricula, km);
                    if (GestorCoches.alta(c)) {
                        System.out.println("Alta exitosa");                      
                    } else {
                        throw new MiExcepcion("error");
                    }
                    break;
                case 2:
                    matricula = Consola.pideCadena("La matricula a modificar es: ");
                    c = GestorCoches.buscaCochePorMatricula(matricula);
                    if (c != null) {
                    opcionDialogo = JOptionPane.showConfirmDialog(null, "Matricula encontrada, confirmas la baja?");
                        if (opcionDialogo == 1) {
                            if (GestorCoches.baja(c)) {
                                Consola.muestraMensaje("baja exitosa");
                            }
                        }
                    } else {
                        Consola.muestraMensaje("no se encuentra el coche");
                    }
                    break;
                case 3:
                    matricula = Consola.pideCadena("La matricula a mostrar es: ");
                    c = GestorCoches.buscaCochePorMatricula(matricula);
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        Consola.muestraMensaje("No se encuentra un coche con esa matrícula");
                    }
                    break;
                case 4:
                    matricula = Consola.pideCadena("La matricula a modificar es: ");
                    c = GestorCoches.buscaCochePorMatricula(matricula);
                    if (c != null) {
                        
                        if (GestorCoches.modificaMatricula(matricula, matricula)) {
                            
                        }
                    }
                    
            }
            
            
        } while (opcion < 1 || opcion > 5 );
        
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
        } catch (MiExcepcion e){
            System.out.println(e.toString());
        }
 
        if (GestorCoches.modificaMatricula("12345FCK", "54321FCK")) {
            System.out.println("modificación exitosa");
        }
        
        
        
        
    }
}
