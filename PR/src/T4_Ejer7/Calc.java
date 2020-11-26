/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer7;

/**
 *
 * @author Ryan
 */
public class Calc {
    private static NumRacional_OLD operador1;
    private static NumRacional_OLD operador2;
    private static String operacion;
    
    public static NumRacional_OLD multiplica (NumRacional_OLD op1, NumRacional_OLD op2){
        NumRacional_OLD resultado = new NumRacional_OLD(0, 0);
        resultado.setNumerador(op1.getNumerador()*op2.getNumerador());
        resultado.setDenominador(op1.getDenominador()*op2.getDenominador());
        return resultado;
    }
    
}
