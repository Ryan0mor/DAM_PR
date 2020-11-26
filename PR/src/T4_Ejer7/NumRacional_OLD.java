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
public class NumRacional_OLD {
    private int numerador;
    private int denominador;

    public NumRacional_OLD(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public static NumRacional_OLD multiplica (NumRacional_OLD num1, NumRacional_OLD num2){
        NumRacional_OLD resultado = new NumRacional_OLD(num1.getNumerador()*num2.getNumerador(),
                num1.getDenominador()*num2.getDenominador());                
        return resultado;
    }
    
    public static String toString (NumRacional_OLD num){
        return num.numerador + "/" + num.denominador;
    }
    
    
}
