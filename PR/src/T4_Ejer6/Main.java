/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer6;

/**
 *
 * @author ryano
 */
public class Main {
    public static void main(String[] args) {
        
        GestorAlumnos.altaAlumno("Juan", ((float)(Math.random()*10)), 30);
        GestorAlumnos.altaAlumno("Pepe", ((float)(Math.random()*10)), 12);
        GestorAlumnos.altaAlumno("Tony", ((float)(Math.random()*10)), 18);
        GestorAlumnos.altaAlumno("Julian", ((float)(Math.random()*10)), 19);
        GestorAlumnos.altaAlumno("Rodolfo", ((float)(Math.random()*10)), 17);
        
        System.out.println(""
                + "1.- Alta de alumno //sólo nombre y edad\n" +
                "\n" +
                "2.- Listado de alumnos\n" +
                "\n" +
                "3.- Listado de alumnos mayores de edad\n" +
                "\n" +
                "4.- Baja de alumno ");
        V_Consola.pideCadena();
        switch 
        System.out.println(GestorAlumnos.listadoAlumnos());
    }
    
}
