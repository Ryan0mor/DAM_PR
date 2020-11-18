/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer3;

/**
 *
 * @author ryano
 */
public class M_CuentaCorriente {
    private String numCuenta;
    private double saldo;

    public M_CuentaCorriente(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    public void M_CuentaCorriente(String numCuenta){
        this.numCuenta = numCuenta;
        
    }
    
    public void ingresaEfectivo (double cantidad){
        saldo = saldo + cantidad;
    }
    
    public boolean saqueaEfectivo(double cantidad) {
        
        if(cantidad <= saldo){
            saldo = saldo - cantidad;
            return true;
        }
        System.out.println("OPERACIÓN CANCELADA");
        return false;
    }
    
    public void visualiza(){
        System.out.println(numCuenta);
        System.out.println(saldo);
    }
    
}
