package Colecciones_MetodosEstáticos;

import ArrayList_metodosBasicos.Cliente;
import ArraysToTablas.Controladora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//VAMOS A VER SORT Y BINARYSEARCH DE LA CLASE COLLECTIONS
public class Main {
    public static ArrayList<Cliente> listaClientes=new ArrayList<>();
//VAMOS A VER SORT Y BINARYSEARCH DE LA CLASE COLLECTIONS
    public static void main(String[] args) {
        Controladora.llenarArray(listaClientes);
        //VAMOS A PROBAR LA ORDENACIÓN EN CLIENTES CON DOS METODOS SORT DISTINTOS, UNO EL NATURAL
        // Y OTRO SOBRECARGADO
        System.out.println("la lista de clientes desordenada es " + listaClientes);
        Collections.sort(listaClientes);//ordenamos la lista
        System.out.println();
        System.out.println("la lista de clientes ordenada es ascendentemente" + listaClientes);

        Collections.reverse(listaClientes);//ordenamos descendentemente
        System.out.println();
        System.out.println("la lista de clientes ordenada es descendentemente" + listaClientes);

        //vamos a ordenarla ascendentemente de nuevo y la ordenamos descendentemente con otro método
        Collections.sort(listaClientes);
        System.out.println("la lista de clientes ordenada es ascendentemente" + listaClientes);
        Collections.sort(listaClientes, Collections.reverseOrder());
        System.out.println();
        System.out.println("la lista de clientes ordenada descendemente de nuevo es" + listaClientes);

        System.out.println("vamos a ordenar por otro orden, el nombre por ejemplo");//se implementa la clase
        //CompareNombre que implementa la interfaz Comparator
        Collections.sort(listaClientes, new CompareNombre());
        System.out.println("la lista de clientes ordenada por nombre es" + listaClientes);

//VAMOS AHORA A VER BINARYSEARCH
        //buscamos un DNI concreto porque es el atributo sobre el que está definido el método compare de Cliente
        Collections.sort(listaClientes);
        System.out.print( "el índice de insercion para un dni 3333 es: ");
        System.out.println( Collections.binarySearch(listaClientes, new Cliente("33333", null,0)));

//vamos a ver el orden de un cliente que se llama Estefanía, tengo que hacer uso de la ordenacion por nombre
// implementado en la clase CompareNombre
        System.out.print( "el índice de insercion para Estefania es: ");
        Cliente estefania = new Cliente("444444i", "Estefanía", 18);
        System.out.println( Collections.binarySearch(listaClientes,
                estefania, new CompareNombre()));




    }
}
