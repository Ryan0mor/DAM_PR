/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3_Ejer40;


/**
 *
 * @author ryano
 */
public class C_Controlador {
    public static void main(String[] args) {
        String numerito = V_Consola.pideCadena("dame numeros");
        String test = M_NumDigital.devuelveNum(numerito);
    }
}
