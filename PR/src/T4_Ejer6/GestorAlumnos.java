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
public class GestorAlumnos {
    private static final int MAX_ALUMNOS = 5;
    private static M_Alumno [] alumnado = new M_Alumno[5];
    private static int numAlumnos = 0;

    public GestorAlumnos() {
    }
    public static boolean altaAlumno(String nombre, float nota, int edad){
        if (alumnado.length <= MAX_ALUMNOS) {
            alumnado [numAlumnos] = new M_Alumno(nombre, nota, edad);
            numAlumnos++;
            return true;
        }
        return false;
    }
    public static String listadoAlumnos () {
        String resultado = "";
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            resultado = resultado + alumnado[i].toString();
        }
        
        return resultado;
    }
    
    
    
}
