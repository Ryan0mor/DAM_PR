/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer5;

/**
 *
 * @author Ryan
 */
public class C_Main {
    public static void main(String[] args) {
        M_GestorLibros gestor = new M_GestorLibros();
        gestor.aniadeLibro("el titulico", "el autorciko", true);
        gestor.listadoSinPrestar();
    }
}
