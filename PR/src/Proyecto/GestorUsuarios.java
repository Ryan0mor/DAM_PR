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
public class GestorUsuarios {
    private static final int MAX_USUARIOS = 2;
    private static Usuario [] usuarios = new Usuario[MAX_USUARIOS];

    public GestorUsuarios() {
    }
    
    //Comprueba si hay un hueco disponible
    /*public static boolean compruebaHueco() {
        for (int i = 0; i < MAX_USUARIOS; i++) {
            if (usuarios[i] == null) {
                return true;
            }
        }
        return false;
    }*/
    
    //Si hay hueco añade usuario en el primer hueco disponible
    public static void anyadeUsuario(String nombre, Date nacimiento, String password){
        if (buscaHueco() != 99) {
           usuarios [buscaHueco()] = new Usuario(nombre, password, nacimiento);
        }  
    }
    
    //Busca el primer hueco dispobible o devuelve 99 si no hay hueco == null)
    public static int buscaHueco() {
        for (int i = 0; i < MAX_USUARIOS; i++) {
            if (usuarios[i] == null) {
                return i;
            }
        }
        return 99;
    }
    //Busca el primer usuario con ese nombre o devuelve 99 si no lo encuentra)
    public static int buscaUsuario(String nombre){
        for (int i = 0; i < MAX_USUARIOS; i++) {
            if (usuarios[i] != null) {
                if(nombre.compareTo(usuarios[i].getNombre()) == 0){
                    return i;
                }
            }
        }
        return 99;
    }
    
    //Comprueba contraseña
    public static boolean compruebaContraseña(int num, String pass){
        if (pass.compareTo(usuarios[num].getPassword()) == 0) {
            return true;
        }
        return false;
    }
    
    //buscaUsuario comprueba pass y lo suprime, si no es posible devuelve false
    public static void suprimeUsuario(int num){
        usuarios[num] = null;
    }
    
    
    //hace lo que dice su nombre
    public static String muestraListado() {
        String resultado = "";
        for (int i = 0; i < MAX_USUARIOS; i++) {
            if (usuarios[i] != null) {
                resultado += usuarios[i].toString() + " \n";
            }
        }
        return resultado;
    }
    
    
}
