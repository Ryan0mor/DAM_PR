/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author ryano
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public String getMesLetras(int mes){
        String resultado[] = {"mes incorrecto", "enero", "febrero", "Marzo", 
            "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
            "noviembre", "diciembre"};
        if (mes <= 12 && mes > 0) {
            return resultado[mes];
        }
        return resultado[0];
    }
    private boolean esBisiesto(){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            return true;
        }
        return false;
    }
    private int getDiasMes(int mes){
        if (mes <= 12 && mes > 0) {
            int resultado[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (mes == 2 && esBisiesto()) {
                resultado[1] = 29;
            }
            return resultado[mes-1];
        }
        return 0;
    }
    public boolean esCorrecta(){
        if (dia > getDiasMes(mes)
                || dia < 1
                || mes < 1
                || mes > 12
                || anio <1900) {
            return false;
        }
        return true;
    }
    public String muestraFechaLarga(){
        if (esCorrecta()) {
            return dia + " de " + getMesLetras(mes) + " de " + anio;
        }
        return "Fecha incorrecta: \n" + "Dia: " + dia + "\n" + "Mes: " + mes +
            "\n" + "Año: " + anio;
    }
    
    public String muestraFechaCorta(){
        if (esCorrecta()) {
            return dia + " de " + mes + " de " + anio;
        }
        return "Fecha incorrecta: \n" + "Dia: " + dia + "\n" + "Mes: " + mes +
            "\n" + "Año: " + anio;
    }
    
    public String muestraFechaFormateada(){
            return anio + "" + mes + "" + dia;
    }
    
}
