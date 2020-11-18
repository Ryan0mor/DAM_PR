/*
Realizar un programa en Java que genere un array de 50 números entre el 0 y el 99.  
Posteriormente ordenar dicho array, para ello buscaremos el menor número para 
cada posición, empezando desde la posición cero.  Finalmente se mostrará el array 
original y el array ordenado.
 */
package T3_Ejer41;

import T4_Ejer4.*;

/**
 *
 * @author ryano
 */
public class C_Controlador {
    public static void main(String[] args) {
        M_SortingAlg prueba = new M_SortingAlg(10, 30, 10);
        prueba.ordenaArray1();
    }
}
