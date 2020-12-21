/*Gestor de errores*/
package T5_Ejer05_A;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Carina*/
/*hereda la clase Exception*/
public class ErrorcicoException extends Exception {

    public ErrorcicoException(String message) {//myErrorException
        super(message);
    }
    
    
}
