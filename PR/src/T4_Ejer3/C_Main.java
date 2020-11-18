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
public class C_Main {
    public static void main(String[] args) {
        M_CuentaCorriente cC1 = new M_CuentaCorriente("001", 0);
        M_CuentaCorriente cC2 = new M_CuentaCorriente("002", 0);
        int opcion;
        
        do {
            System.out.println("1.Ingresar en la cuenta 001\n" +
            "\n" + "2.Ingresar en la cuenta 002\n" +
            "\n" + "3.Retirar de la cuenta 001\n" +
            "\n" + "4.Retirar de la cuenta 002\n" +
            "\n" + "5.Visualizar ambas cuentas\n" +
            "\n" + "6.Fin");
            opcion = V_Consola.pideEntero("elige una opción");
            switch (opcion){
                case 1:
                    cC1.ingresaEfectivo(V_Consola.pideDouble("Cantidad a ingresar"));
                    break;
                case 2:
                    cC2.ingresaEfectivo(V_Consola.pideDouble("Cantidad a ingresar"));
                    break;
                case 3:
                    cC1.saqueaEfectivo(V_Consola.pideDouble("Cantidad a saquear"));
                    break;
                case 4:
                    cC2.saqueaEfectivo(V_Consola.pideDouble("Cantidad a saquear"));
                    break;
                case 5:
                    cC1.visualiza();
                    cC2.visualiza();
                    break;
                case 6:
                    System.out.println("Chao!");
                    break;                
                default:
                    System.out.println("opción incorrecta");
            }
            
        } while (opcion != 6);
    }
    
}
