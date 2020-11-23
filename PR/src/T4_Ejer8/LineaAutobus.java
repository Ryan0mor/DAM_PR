/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer8;

/**
 *
 * @author ryano
 */
public class LineaAutobus {
    private String numLinea;
    private int frecuencia;
    private int[] paradas;

    public LineaAutobus(String numLinea, int frecuencia, int[] paradas) {
        this.numLinea = numLinea;
        this.frecuencia = frecuencia;
        this.paradas = paradas;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getNumLinea() {
        return numLinea;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public int[] getParadas() {
        return paradas;
    }
    
    @Override
    public String toString (){
        String paradasSt = "";
        
        for (int i = 0; i < paradas.length; i++) {
            paradasSt = paradasSt + paradas[i] + " - ";
        }
        String resultado = "Linea: " + numLinea + " Frecuencia: " +
                frecuencia + "\n" + "Paradas: " + paradasSt;
        return resultado;
    }

}
