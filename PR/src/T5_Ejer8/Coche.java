/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5_Ejer8;

/**
 *
 * @author Ryan
 */
public class Coche {
    private String modelo;
    private String matricula;
    private long km;

    public Coche(String modelo, String matricula, long km) throws MiExcepcion {
        setModelo(modelo);
        setMatricula(matricula);
        setKm(km);
    }
    
    public Coche(String modelo, String matricula, String km) throws MiExcepcion {
        setModelo(modelo);
        setMatricula(matricula);
        setKm(km);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws MiExcepcion {
        if (modelo == null) {
            throw new MiExcepcion("el modelo está vacio");
        }
        if (modelo.length() > 30 || modelo.length() < 5) {
            throw new MiExcepcion("el modelo tiene que tener entre 5 y 30 chars");
        }       
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws MiExcepcion {
        if (matricula.length() == 7) {
            if (matricula == null) {
            throw new MiExcepcion("la matricula está vacia");
            }
            for (int i = 0; i < 3; i++) {
                if (matricula.charAt(i) < 48 || matricula.charAt(i) > 57) {
                    throw new MiExcepcion("la matricula contiene letras al principio");
                }
            }
            for (int i = 4; i < 7; i++) {
                if (matricula.charAt(i) < 66 
                        || matricula.charAt(i) >= 90
                        || matricula.charAt(i) == 'A'
                        || matricula.charAt(i) == 'E'
                        || matricula.charAt(i) == 'I'
                        || matricula.charAt(i) == 'O'
                        || matricula.charAt(i) == 'U') {
                    throw new MiExcepcion("la matricula tiene caracteres no validos");              
                }
            }
            
        }
        this.matricula = matricula;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) throws MiExcepcion {
        if (km < 0) {
            throw new MiExcepcion("los km tienen que ser => que 0");
        }
        this.km = km;
    }
    
    public void setKm(String km) throws MiExcepcion{
        if (km == null) {
            throw new MiExcepcion("los km están vacios");
        }
        try {
            setKm(Integer.parseInt(km));
        } catch (NullPointerException e) {
            throw new MiExcepcion("error en el formato de los km");
        }
    }

    @Override
    public String toString() {
        return "Coche{" + "modelo=" + modelo + ", matricula=" + matricula + ", km=" + km + '}';
    }
    
    
    
}
