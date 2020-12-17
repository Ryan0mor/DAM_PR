/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printf;

/**
 *
 * @author ryano
 */
public class Printf {
    public static void main(String[] args) {
        
        /*
        String cadenika = "%s";
        int enteriko = 695522;
        double dobleciko = 69.6969696969;
        float floateciko = 69.6969696969f;

        
        System.out.println("Expresiones en el FORMATO");
        System.out.printf("Con %% imprimes un %%  porcentaje\n");
        System.out.printf("Con %%c (%c) imprimes el caracter ASCII desde un int\n", 69);
        System.out.printf("Con %s imprimes una cadena, sino ABORTO\n", "%s");
        System.out.printf("Con %% (%,d) imprimes un decimal???\n", enteriko);
        //System.out.printf("Con %% (%,u) imprimes un decimal\n", numConDecimal);
        System.out.printf("Con %e imprimes en notacion científica con munúsculas\n", dobleciko);
        System.out.printf("Con %E imprimes en notacion científica con mayúsculas\n", dobleciko);
        
        System.out.printf("Con %G imprimes de notación científica a normal\n", dobleciko);

        
    //System.out.printf("Con %f imprimes un float en notación decimal", floatConDecimal);

        
        System.out.printf("Con %x imprimes en hexadecimal con minúsculas\n", enteriko);
        System.out.printf("Con %x imprimes en hexadecimal con mayúsculas\n", enteriko);
        
        
        System.out.println("Especificadores en el FORMATO");
        */
        
        int enteriko = 69;
        double dobleciko = 6969696969696969.69;
        float floateciko = 0.000069696969f;
        String cadenika = "Hagamos un 69";
        
        System.out.printf("%d \n", 69); //Convierte a int, peta con float o double
        System.out.printf("%f \n", 69f); //Convierte a float, funciona con float o double, peta con int
        
        System.out.printf("%s \n", "Hagamos un 69"); //Convierte a Sting en minúsculas
        System.out.printf("%S \n", "Hagamos un 69"); //Convierte a Sting en MAYÚSCULAS
        
        System.out.printf("%e \n", dobleciko); //Convierte a Real en Base 10 con minúsculas
        System.out.printf("%E \n", floateciko); //Convierte a Real en Base 10 con MAYÚSCULAS
        
        System.out.printf("%g \n", dobleciko); //Convierte a científica si el num es muy grande o pequeño
        System.out.printf("%G \n", floateciko); //Convierte a científica si el num es muy grande o pequeño
                        
        System.out.printf("%x \n", 69696969); //Convierte a Int en Base 16 con minúsculas
        System.out.printf("%X \n", 69696969); //Convierte a Int en Base 16 con MAYÚSCULAS
        
        System.out.printf("%c \n", enteriko); //Convierte a char UNICODE desde Int con minúsculas
        System.out.printf("%C \n", enteriko); //Convierte a char UNICODE desde Int con MAYÚSCULAS (No le veo la puta diferencia)
              
        System.out.printf("%.69f \n", floateciko); //Muestra 69 decimales de un float
        System.out.printf("%69f \n", floateciko); //Deja un hueco de 69 caracteres para el dato
        System.out.printf("%069f \n", floateciko); //Muestra ceros hasta ocupar 69 caracteres
        System.out.printf("%+f \n", floateciko); //Si es positivo muestra + delante
        System.out.printf("%f \n", floateciko); //Si es positivo muestra + delante

        System.out.printf("Salto 1 \n"       //Salto de linea tipo 1
                        + "Salto 2 %n");     //Salto de linea tipo 2
        System.out.printf("%% \n");      //imprime un %   
        
       


        

    }
}
