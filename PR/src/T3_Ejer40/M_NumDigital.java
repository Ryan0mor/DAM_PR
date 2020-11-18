/*
Realizar un programa en Java que pida un número entero por teclado y lo muestre como los dígitos de un reloj:
 */
package T3_Ejer40;

/**
 *
 * @author ryano
 */
public class M_NumDigital {
    
    public static String devuelveNum(String num){
        int numero;
        String digitos = "";
        String diccionario[][] = {
            {" _ ", "   ", " _ ", " _ ", "   ", " _ ", " _ ", " _ ", " _ ", " _ ", },
            {"| |", " | ", " _|", " _|", "|_|", "|_ ", "|_ ", "  |", "|_|", "|_|", },
            {"|_|", " | ", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|", }
        };
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < num.length(); i++) {
                numero = Integer.parseInt(num.charAt(i) +"");
                digitos = digitos + diccionario[j][numero];
                System.out.print(digitos + " ");
                digitos = "";
            }
            System.out.println("");
        }
        
        return digitos;
    }
    
    
    
}
