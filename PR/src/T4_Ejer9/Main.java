/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer9;

/**
 *
 * @author Ryan
 */
public class Main {
    public static int enteroAleatorio (int max, int min){  
        return (int)((Math.random()*(max - min)) + min);
    }
    
    public static float floatAleatorio (int max, int min){  
        return (float)((Math.random()*(max - min)) + min);
    }
    
    public static String generaNombre(){
        String nombre[] = {"Paco", "Manolo", "Eva", "Cayetana", "Diana", 
            "Julián", "Benito", "Carina", "Ernesto"}; 
        return nombre[enteroAleatorio(0, nombre.length)];
    }
    
    public static String generaDeporte(){
        String deporte[] = {"Tenis", "Baloncesto", "Golf", "Fifa", "Esgrima", 
            "Cricket", "Alterofilia", "Parchís"}; 
        return deporte[enteroAleatorio(0, deporte.length)];
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            GestorClientes.altaCliente(generaNombre(), enteroAleatorio(0, 100), generaDeporte());  
        }
        int opcion = Consola.pideEntero("elige que hacer");

        switch (opcion){
            case 1:
                System.out.println("alta");
                boolean altaBool = GestorClientes.altaCliente(
                        Consola.pideCadena("Nombre"),
                        Consola.pideDouble("Cuota"), 
                        Consola.pideCadena("Deporte"));
                if (altaBool) {
                    System.out.println("alta existosa");
                } else{
                    System.out.println("Aborto");
                }
                break;
            case 2:
                System.out.println("mostrar");
                System.out.println(GestorClientes.muestraClientela());
                break;
            case 3:
                System.out.println("baja");
                System.out.println(GestorClientes.muestraClienteIndex());
                break;
            case 4:
                break;
        }
    }
}
