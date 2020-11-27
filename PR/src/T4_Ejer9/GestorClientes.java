/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer9;

/**
 *
 * @author Ryan
 */
public class GestorClientes {
    private static Cliente [] clientela = new Cliente[100];
        
    public static boolean altaCliente(String nombre, double cuota, String deporte){
        if (buscaPuesto() != -1) {
            clientela [buscaPuesto()]= new Cliente(nombre, cuota, deporte);
            return true;
        }
        return false;
    }
    
    public static int buscaPuesto(){
        for (int i = 0; i < clientela.length; i++) {
            if (clientela[i] == null) {
                 return i;
            }
        }
        return -1;
    }
    
    public static String muestraClientela(){
        String resultado = "";
    
        for (int i = 0; i < clientela.length; i++) {
            if (clientela[i] != null) {
                resultado += clientela[i].toString() + "\n";
            }
        }
        return resultado;
    }
    
    public static String muestraClienteIndex(){
        String resultado = "";
    
        for (int i = 0; i < clientela.length; i++) {
            if (clientela[i] != null) {
                resultado += i + " " + clientela[i].toString() + "\n";
            }
        }
        return resultado;
    }
    

}
