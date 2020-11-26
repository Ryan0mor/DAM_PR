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
        
    public static boolean altaCliente(String nombre, float cuota, String deporte){
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

}
