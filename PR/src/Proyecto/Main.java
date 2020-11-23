/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Date;


/**
 *
 * @author ryano
 */
public class Main {
    public static void main(String[] args) {
        Date fecha = new Date(0);
        
        int opcion;
        String nombre;
        String pass;
        int indiceUsuario;
        
        do {
            System.out.println("1. Alta de usuario\n" + "2. Baja\n"
                    + "3. Entrar al sitio\n" +  "4. Listado\n" + "otro.- Fin");
            opcion = Consola.pideOpcion();
            switch (opcion){
                case 1:
                    System.out.println("Has elegido dar de alta al usuario");
                    if (GestorUsuarios.buscaHueco() != 99) {
                        nombre = Consola.pideCadena("Nombre de usuario");
                        pass = Consola.registraPassword(nombre);
                        GestorUsuarios.anyadeUsuario(nombre, fecha, pass);
                    }else {
                        System.out.println("No queda hueco disponible");
                    }
                    break;
                case 2:
                    System.out.println("Has elegido dar de baja a un usuario");
                    nombre = Consola.pideCadena("Introduce el nombre de usuario: ");
                    indiceUsuario = GestorUsuarios.buscaUsuario(nombre);
                    if (indiceUsuario != 99) {
                        pass = Consola.pideCadena("Introduce la contraseña asociada");
                        if (GestorUsuarios.compruebaContraseña(indiceUsuario, pass)) {
                            System.out.println("Usuaria eliminada");
                            GestorUsuarios.suprimeUsuario(indiceUsuario);
                        } else {
                            System.out.println("Contraseña incorrecta");
                        }
                    } else{
                        System.out.println("No existe ningun usuario con ese nombre");
                    }
                    break;
                case 3:
                    System.out.println("Has elegido entrar al sitio");
                    nombre = Consola.pideCadena("Introduce el nombre de usuaria: ");
                    pass = Consola.pideCadena("Introduce la contraseña asociada");
                    indiceUsuario = GestorUsuarios.buscaUsuario(nombre);
                    if (indiceUsuario !=99) {
                        if (GestorUsuarios.compruebaContraseña(indiceUsuario, pass)) {
                            System.out.println("Bienvenida a mi super programa");
                        } else {
                            System.out.println("Contraseña incorrecta");
                        }
                    } else {
                        System.out.println("Usuaria incorrecta");
                    }
                    break;
                case 4:
                    System.out.println("Has elegido ver el listado");
                    System.out.println("USUARIA    CONTRASEÑA    FECHA");
                    System.out.println(GestorUsuarios.muestraListado());
                    
                    break;
                default:
                    System.out.println("Has elegido la senda del cobarde");
            }
        } while (opcion > 0 && opcion < 5);
    }
    
}
