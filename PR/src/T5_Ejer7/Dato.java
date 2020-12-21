/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer7;

/**
 *
 * @author Ryan
 */
public class Dato {
    private int cantidad;
    private String palabra;
    private float peso;

    public Dato(int cantidad, String palabra, float peso) throws MiExcepcion {
        setCantidad(cantidad);
        setPalabra(palabra);
        setPeso(peso);
    }
    
    public Dato(String cantidad, String palabra, String peso) throws MiExcepcion{
        setCantidad(cantidad);
        setPalabra(palabra);
        setPeso(peso);
    }
    
    

    public int getCantidad() {
        return cantidad;
    }

    //La cantidad no puede ser igual o inferior a cero. y ENTERO
    public void setCantidad(String cantidad) throws MiExcepcion{
        try {
            setCantidad(Integer.parseInt(cantidad));
        } catch (NumberFormatException e) {
            throw new MiExcepcion("La cantidad contiene caracteres no validos");
        }
    }
    public void setCantidad(int cantidad) throws MiExcepcion {
        if (cantidad <= 0) {
            throw new MiExcepcion("la cantidad es mayor de 0");           
        }
        this.cantidad = cantidad;
    }

    public String getPalabra(){    
        return palabra;
    }

    public void setPalabra(String palabra) throws MiExcepcion {
        if (palabra == null) {
            throw new MiExcepcion("la palabra está vacia");
        }
        if (palabra.length()>9) {
            throw new MiExcepcion("la palabra es muy larga");
        }
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == '$') {
                throw new MiExcepcion("la palabra contiene $");
            }
        }
        this.palabra = palabra;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws MiExcepcion {
        if (peso < 12) {
            throw new MiExcepcion(" el peso es menor de 12");
        }
        if (peso > 25) {
            throw new MiExcepcion(" el peso es mayor de 25");
        }
        this.peso = peso;
    }
    
    public void setPeso (String peso) throws MiExcepcion{
        try {
            setPeso(Float.parseFloat(peso));
        } catch (NumberFormatException e) {
            throw new MiExcepcion("Error de formato con el float");
        }
    }

    @Override
    public String toString() {
        return "Datos{" + "cantidad=" + cantidad + ", palabra=" + palabra + ", peso=" + peso + '}';
    }

}
