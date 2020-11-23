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
    private static NumRacional operador1;
    private static NumRacional operador2;
    private static String operacion;
    
    public static NumRacional multiplica (NumRacional op1, NumRacional op2){
        NumRacional resultado = new NumRacional(0, 0);
        resultado.setNumerador(op1.getNumerador()*op2.getNumerador());
        resultado.setDenominador(op1.getDenominador()*op2.getDenominador());
        return resultado;
    }
    
}
