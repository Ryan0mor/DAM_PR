/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer4_OLD;

/**
 *
 * @author ryano
 */
public class C_Controlador {
    public static void main(String[] args) {
        M_Fechas fechita = new M_Fechas(31, 12, 2020);
        System.out.println(fechita.esCorrecta());
        System.out.println(fechita.fechaLarga());
        System.out.println(fechita.muestraFechaCorta());

    }
}
