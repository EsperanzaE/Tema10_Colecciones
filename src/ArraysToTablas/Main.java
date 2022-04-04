package ArraysToTablas;

import ArrayList_metodosBasicos.Cliente;

import java.util.ArrayList;

public class Main {
    public static ArrayList <Cliente> listaClientes=new ArrayList<Cliente>();

    public static void main(String[] args) {
//lleno mi tabla de clientes
        Controladora.llenarArray(listaClientes);

// ahora la voy a volcar en una tabla

        Object[] tablaClientes= listaClientes.toArray();
        Cliente[] tablaClientes2= listaClientes.toArray(new Cliente[0]);
//  para acceder a un elemento de la tabla, en función de como la hayamos definido, haremos
        System.out.println("obtenemos el nombre de la tercera ocurrencia de dos modos distinos, ha de valer Lola");
        System.out.println(((Cliente) tablaClientes[3]).getNombre());//con la primera definición necesitamos un casting
        System.out.println(tablaClientes2[3].getNombre());//con la segunda definición no necesitamos un casting
// vamos a probar los métodos propios de las tablas cómo sería aqui;
        System.out.println("el tamaño de la tabla es  " + tablaClientes.length);
        System.out.println("el tamaño de la tabla es  " + tablaClientes2.length);

    }

}
