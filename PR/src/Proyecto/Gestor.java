/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ryano
 */
public class Gestor {
    private static final int MAX_USUARIAS = 2;
    private static Usuaria usuarias[] = new Usuaria[MAX_USUARIAS];

    
    //Añade usuaria
    public static void aniadeUsuaria(String nombre, String pass, Fecha cumple){
        usuarias[buscaHueco()] = new Usuaria(nombre, pass, cumple);    
    }
    
    //Devuelve el primer hueco disponible
    public static int buscaHueco(){
        for (int i = 0; i < usuarias.length; i++) {
            if (usuarias[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    //Busca si existe un nombre (CON IGNORE CASE) y devuelve su índice
    public static int buscaNombreIgnoreCase(String nombre){
        for (int i = 0; i < usuarias.length; i++) {
            if (usuarias[i] != null) {
                if (nombre.compareToIgnoreCase(usuarias[i].getNombre()) == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static boolean compruebaPass(int indice, String pass){
        if (usuarias[indice].getPassword().compareTo(pass) == 0) {
            return true;
        }
        return false;
    }
    
    public static boolean bajaUsuaria (int indice){
        usuarias[indice] = null;
        return true;
    }
    
    public static boolean esAdulta (int indice){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
        Date date = new Date(System.currentTimeMillis());
        int hace18anios = (Integer.parseInt(formatter.format(date))- 180000);
        String usuariaFechaSt = 
                usuarias[indice].getNacimiento().muestraFechaFormateada();
        int usuariaFecha = (Integer.parseInt(usuariaFechaSt));
        if (usuariaFecha <= hace18anios) {
            return true;
        }
        return false;
    }
    
    //
    public static String muestraListado() {
        String resultado = "";
        for (int i = 0; i < MAX_USUARIAS; i++) {
            if (usuarias[i] != null) {
                resultado += usuarias[i].toString() + "\n";
            }
        }
        return resultado;
    }
            
    
    
}
