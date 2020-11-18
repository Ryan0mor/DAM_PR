/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Ejer5;

/**
 *
 * @author Ryan
 */
public class M_GestorLibros {
    final int MAX_NUM_LIBROS = 50; // à 50
    M_Libro [] libros = new M_Libro[MAX_NUM_LIBROS];;
    int numLibros = 0;

    
    public M_GestorLibros() {
        
    }
    
    public boolean aniadeLibro(String titulo, String autor, boolean esPrestable){
        if (libros.length <= MAX_NUM_LIBROS) {
            numLibros++;
            libros[numLibros] = new M_Libro(titulo, autor, esPrestable);
            return true;
        }
        return false;
    }
    public void listadoLibros(){
        for (int i = 0; i < MAX_NUM_LIBROS; i++) {
            libros[i].toString(); 
        }
    }
    public void listadoPrestados(){
        for (int i = 0; i < MAX_NUM_LIBROS; i++) {
            if (libros[i].isPrestado()) {
                libros[i].toString();
                
            }
        }
    }
    public void listadoSinPrestar(){
        for (int i = 0; i < MAX_NUM_LIBROS; i++) {
            if (!libros[i].isPrestado()) {
                libros[i].toString();
            }
        }
    }
    
}
