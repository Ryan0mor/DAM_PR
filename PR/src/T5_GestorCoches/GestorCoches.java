/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_GestorCoches;

import java.util.ArrayList;

/**
 *
 * @author Ryan
 */
public class GestorCoches {
    private static ArrayList<Coche> listaCoches;
    
    public static void creaLista(){
        listaCoches = new ArrayList<>();
        
    }
    
    public static boolean alta(Coche c){
        return listaCoches.add(c);
    }
    
    public static String listaCoches() {
        String resultado = "";
        for (Coche c : listaCoches) {
            resultado += c.toString() + "\n";
        }
        return resultado;
    }
    public static boolean baja(Coche c){
        return listaCoches.remove(c);
    }
    
    public static Coche buscaCochePorMatricula (String matricula){
        for (Coche c : listaCoches) {
            if (c.getMatricula().equals(matricula)) {
                return c;
            }           
        }
        return null;
    }
    
    public static boolean modificaMatricula (String matriculaOld, String matriculaNew) throws MiExcepcion{
        Coche c = buscaCochePorMatricula(matriculaOld);
        if (c != null) {
            c.setMatricula(matriculaNew);
            return true;
        } else {
            return false;
        }
    }
    
    
}
