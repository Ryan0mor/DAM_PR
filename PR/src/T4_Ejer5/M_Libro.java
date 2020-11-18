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
public class M_Libro {
    private String titulo;
    private int vecesPrestado = 0;
    private String autor;//asumiremos que sólo hay uno
    private boolean prestable;//indica si el ejemplar se puede prestar
    private boolean prestado;//indica si el ejemplar está presatado

    public M_Libro(String titulo, String autor, boolean prestable) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestable = prestable;
    }

    public boolean isPrestable() {
        return prestable;
    }

    public void setPrestable(boolean prestable) {
        this.prestable = prestable;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    public void prestar(){
        if (prestable) {
            vecesPrestado++;
            prestado = true;
        }else{
            System.out.println("no se puede prestar");
        }
    }
    
    public  String toString(){
        return titulo + " " + autor + " " + vecesPrestado + " " + prestable + " " + prestado;
    }
    
}
