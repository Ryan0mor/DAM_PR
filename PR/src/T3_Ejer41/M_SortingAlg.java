/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3_Ejer41;

/**
 *
 * @author ryano
 */
public class M_SortingAlg {
    public int numMin;
    public int numMax;
    public int totalnum;

    public M_SortingAlg(int numMin1, int numMax1, int totalNum1) {
        this.numMin = numMin1;
        this.numMax = numMax1;
        this.totalnum = totalNum1;
    }
        
    public int[] generaArray(){
        int arrayNumerito[];
        arrayNumerito = new int[totalnum];
        for (int i = 0; i < totalnum; i++) {
            int numerito = (int)((Math.random()*(numMax-numMin))+numMin);
            arrayNumerito[i] = numerito;
        }
        return arrayNumerito;
    }
    
    public int[] ordenaArray0(){
        int arrayOrdenada[] = new int[totalnum];
        int arrayDesordenada[] = generaArray();
        
        return arrayOrdenada;
    }
    public int[] ordenaArray1(){
        int arrayOrdenada[] = new int[totalnum];
        int arrayDesordenada[] = generaArray();
        
        for (int i = numMin; i < numMax; i++) {
            for (int j = 0; j < arrayDesordenada.length; j++) {
                if (arrayDesordenada[j] == i) {
                    arrayOrdenada[i] = i;
                    System.out.println(arrayOrdenada[i]);
                }
            }
        }
        return arrayOrdenada;
    }
}