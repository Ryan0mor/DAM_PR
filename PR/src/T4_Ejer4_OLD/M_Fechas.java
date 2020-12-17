/*
Se pide realizar una clase para manejar fechas


Fecha

private int dia;


private int mes;


prívate intanyo;


// Crear el constructor necesario


Prívate String getMesLetras()


-Devuelve una cadena que contiene elmes con letras: enero, febrero ... diciembre


Prívate boolean esBisiesto()


-Devuelve true si el año es bisiesto y false en caso contrario


Prívate int getDiasMes()


-Devuelve el número de días que tiene el mes.Teniendo en cuenta que si el año es bisiesto el mes de febrero tendrá 29 días.


Public boolean esCorrecta()


-Devuelve true si la fecha es correcta.


Public String muestraFechaLarga( )


-Si la fecha es correcta,Devuelve la fecha con el formato largo à 12 de diciembre de 2020


Public String muestraFechaCorta( )


-Si la fecha es correcta, devuelve la fecha con el formato largo à 12/12/2020





Se pedirán fechas por teclado (dia, mes y año) , se indicará si es correcta o no y posteriormente se mostrará la fecha larga y la fecha corta:

Cuando se introduzca un 0 en el día, el programa terminará, sin pedir el mes y el año.
 */
package T4_Ejer4_OLD;

/**
 *
 * @author ryano
 */
public class M_Fechas {
    private int dia;
    private int mes;
    private int anyo;

    public M_Fechas(int dia1, int mes1, int anyo1) {
        this.dia = dia1;
        this.mes = mes1;
        this.anyo = anyo1;
    }
    
    private String getMesLetras(){
        //-Devuelve una cadena que contiene elmes con letras: enero, febrero ... diciembre
        String diccionarioMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return diccionarioMes[(mes+1)];
    };
    
    private boolean esBisiesto(){
        //-Devuelve true si el año es bisiesto y false en caso contrario
        if (anyo % 4 == 0) {
            return true;
        }
        return false;
    }
    
    private int getDiasMes(){
        //-Devuelve el número de días que tiene el mes.Teniendo en cuenta que si el año es bisiesto el mes de febrero tendrá 29 días.
        int diccionarioDiasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esCorrecta()) {
            int dias = diccionarioDiasMes[mes+1];
            return dias;
        }
        return 0;
    }
    
    public boolean esCorrecta(){
        //-Devuelve true si la fecha es correcta.
        if (dia>0 && dia<=getDiasMes() && mes>0 && mes <13 && anyo>0 && anyo<366) {
            return true;
        }
        return false;
    }
    
    public String fechaLarga(){
        //Si la fecha es correcta,Devuelve la fecha con el formato largo à 12 de diciembre de 2020
        if (esCorrecta()) {
            return dia + " de " + getMesLetras() + " de " + anyo;
        }
        return "fecha incorrecta";
    }
    
    public String muestraFechaCorta(){
        //Si la fecha es correcta, devuelve la fecha con el formato largo à 12/12/2020
        return dia + "/" + mes + "/" + anyo;
    }
    
    
    
}
