/*
 Diseñe un algoritmo de tal manera que le permita la creación  de un array
}de cadenas de caracteres,instancie datos en la matriz ,e imprime los datos.
Los 12 meses del año.
 */
package arregloestimadotaller1;

/**
 *
 * @author Paul
 */
public class ArregloEstimadoTaller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declara un array de enteros
        String[]arr;
        //asignando memoria para 5 enteros
        arr=new String[12];
        //inicializamos el primer elemento del array
        arr[0]="Enero";
        //iniciamos el segundo elemento del array
        arr[1]="Febrero";
        //iniciamos el segundo elemento del array
        arr[2]="Marzo";
        //iniciamos el Tercer elemento del array
        arr[3]="Abril";
        //iniciamos el Cuarto elemento del array
        arr[4]="Mayo";
        //iniciamos el Quinto elemento del array
        arr[5]="Junio";
        //iniciamos el Sexto elemento del array
        arr[6]="Julio";
        //iniciamos el Septimo elemento del array
        arr[7]="Agosto";
        //iniciamos el Octavo elemento del array
        arr[8]="Septiembre";
        //iniciamos el Noveno elemento del array
        arr[9]="Octubre";
        //iniciamos el Decimo elemento del array
        arr[10]="Noviembre";
        //iniciamos el Onceavo elemento del array
        arr[11]="Diciembre";
        //accediendo a los elementos del array
        for(int i=0 ; i<arr.length; i++)
        System.out.println("El mes correspondiente al elemento " + i + " es " +arr[i]);
    }

}
