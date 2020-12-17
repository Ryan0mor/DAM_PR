/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author ryano
 */
public class Main {
    public static void main(String[] args) {
        int opcion;
        String nombre;
        String pass;
        Fecha cumple;
        int indice;
        String respuesta;
        boolean confirmacion;
        do {            
            Consola.muestraMenu();
            opcion = Consola.pideOpcion();
            switch (opcion){
                case 1:
                    if (Gestor.buscaHueco() != -1) {
                        nombre = Consola.pideNombre();
                        cumple = Consola.pideCumple();
                        pass = Consola.pidePass(nombre);
                        Gestor.aniadeUsuaria(nombre, pass, cumple);
                        Consola.muestraMensaje("Usuaria añadina");
                    }  else {
                        Consola.muestraMensaje("No hay hueco");
                    }
                    break;
                case 2:
                    nombre = Consola.pideCadena("Introduce el nombre");
                    indice = Gestor.buscaNombreIgnoreCase(nombre);
                    if (indice != -1) {
                        pass = Consola.pideCadena("introduce el password");
                        if (Gestor.compruebaPass(indice, pass)) {
                            respuesta =Consola.pideCadena("Desea cargarse a "
                                    + nombre + " S/N?");
                            if (respuesta.compareToIgnoreCase("S") == 0) {
                                confirmacion = Gestor.bajaUsuaria(indice);
                                if (confirmacion) {
                                    Consola.muestraMensaje("no hay vuelta atrás");
                                }
                            } else{
                                Consola.muestraMensaje(nombre + " vivirá un dia"
                                        + "más");
                            }
                        } else{
                            Consola.muestraMensaje("ERROR: Pass incorrecto");
                        }
                    } else {
                        Consola.muestraMensaje("ERROR: nombre no existe");
                    }
                    break;
                case 3:
                    nombre = Consola.pideCadena("Introduce el nombre");
                    indice = Gestor.buscaNombreIgnoreCase(nombre);
                    if (indice != -1) {
                        pass = Consola.pideCadena("introduce el password");
                        if (Gestor.compruebaPass(indice, pass)) {
                            if (Gestor.esAdulta(indice)) {
                                JOptionPane.showMessageDialog(null, "Bienvenida"
                                        + " a el paraiso");
                            } else {
                                Consola.muestraMensaje("El enunciado no dice"
                                        + " el que hacer en este caso");
                            }
                        } else{
                            Consola.muestraMensaje("ERROR: Pass incorrecto");
                        }
                    } else {
                        Consola.muestraMensaje("ERROR: nombre no existe");
                    }                    
                    break;
                case 4:
                    System.out.println("USUARIA    CONTRASEÑA    FECHA");
                    System.out.println(Gestor.muestraListado());
                    break;
                default:
                    Consola.muestraMensaje("Adios");
            }
        } while (opcion > 0 && opcion < 5);
    }
}
