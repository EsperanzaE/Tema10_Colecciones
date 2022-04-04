package Colecciones_OtrasUtilidades;

import ArrayList_metodosBasicos.Cliente;
import ArraysToTablas.Controladora;
import Colecciones_MetodosEstáticos.CompareNombre;

import java.util.ArrayList;
import java.util.Collections;

//VAMOS A VER COMO SE DESORDENAR UNA LISTA, CUÁNTAS VECES ESTÁ UN NODO EN UNA LISTA, Y EL MAXIMO Y EL
// MÍNIMO DE UNA COLECCION
//
public class Main {
    public static ArrayList<Cliente> listaClientes=new ArrayList<>();

    public static void main(String[] args) {
        //LENAMOS LA LISTA
        Controladora.llenarArray(listaClientes);
//VAMOS A ORDENAR UNA LISTA PARA LUEGO DESORDENARLA
        Collections.sort(listaClientes);//ordenamos la lista
        System.out.println();
        System.out.println("la lista de clientes ordenada es ascendentemente" + listaClientes);
// DESORDENAMOS LA LISTA
        Collections.shuffle(listaClientes);
        System.out.println();
        System.out.println("la lista de clientes desordenada con shuffle" + listaClientes);

        //insertamos dos clientes con el dni a 222222h para que me diga que hay 3 elementos
        // con ese valor
        System.out.println();
        System.out.println("insertamos dos clientes con el dni a 222222h para que me diga que " +
                "hay 3 elementos con ese valor");
        listaClientes.add(new Cliente("222222h","Kiki", 55));
        listaClientes.add(new Cliente("222222h","Aurora", 65));
        System.out.println("hay "+
                Collections.frequency(listaClientes,new Cliente("222222h","Kiki", 55))+
                " elementos con DNI a 222222h");
        System.out.println("el maximo de la lista por DNI es " + Collections.max(listaClientes));
        System.out.println("el minimo de la lista por DNI es " + Collections.min(listaClientes));

        System.out.println("el maximo de la lista por nombre es " +
                Collections.max(listaClientes, new CompareNombre()));

        System.out.println("el mínimo de la lista por nombre es " +
                Collections.min(listaClientes, new CompareNombre()));

    }
}
