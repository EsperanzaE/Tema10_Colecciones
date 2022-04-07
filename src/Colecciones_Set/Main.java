package Colecciones_Set;

import ArrayList_metodosBasicos.Cliente;
import Colecciones_MetodosEstáticos.CompareNombre;

import java.util.*;

///VAMOS A VER LAS FUNCIONALIDADES POLIMORFICAS QUE OFRECE LA INTERFAZ SET
public class Main {
//Creo un Treeset de nuestra clase Cliente
    static TreeSet<Cliente> arbolCliente = new TreeSet<>();
    static TreeSet<Cliente> arbolCliente2 = new TreeSet<>(new CompareNombre());


    public static void main(String[] args) {
//lleno la mi set con es un Tree se ordenará por la ordenación natural de Cliente que era el dni
        arbolCliente.add(new Cliente("1111", "Marta", 18));
        arbolCliente.add(new Cliente("1115", "Pedro", 21));
        arbolCliente.add(new Cliente("1112", "Juan", 25));
        arbolCliente.add(new Cliente("1", "Eva", 105));
        arbolCliente.add(new Cliente("11", "Zalea", 89));
// vamos a imprimirlo
        System.out.println();
        System.out.println("la colección ha de salir ordenada por DNI");
        System.out.println(arbolCliente.toString());
// vamos a probar la inserción de datos en el segungo arbol con una ordenacion que se le introduce en el
//  constructor

        arbolCliente2.add(new Cliente("1111", "Marta", 18));
        arbolCliente2.add(new Cliente("1115", "Pedro", 21));
        arbolCliente2.add(new Cliente("1112", "Juan", 25));
        arbolCliente2.add(new Cliente("1", "Eva", 105));
        arbolCliente2.add(new Cliente("12", "Zalea", 89));

        // vamos a imprimirlo
        System.out.println();
        System.out.println("la colección ha de salir ordenada por nombre");
        System.out.println(arbolCliente2.toString());

        //vamos a realizar conversiones entre colecciones
        arbolCliente2.clear();
        arbolCliente.clear();

        // vamos a probar las conversiones entre Set.
        Set <Integer> s1= new LinkedHashSet<>();
        Set <Integer> s2= new TreeSet<>();
        TreeSet<Integer> s3=new TreeSet<>();
        s1.add(4);
        s1.add(3);
        s1.add(45);
        s1.add(-1);
        s1.add(15);
        System.out.println();
        System.out.println(" el orden de un LinkedHashSet es el orden de inserción: ");
        System.out.println(s1.toString());

        s2.addAll(s1);
        System.out.println();
        System.out.println("al añadir un LinkedHashSet a un TreeSet, se nos ordena directamente");
        s3.addAll(s1);
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    //pero también podemos igualar s1 a s2, y S1 sería un TresSet

        s1=s2;
        System.out.println("he cambiado s1 a TreeSet:");
        System.out.println(s1.toString());
// poniendo en el constructor s2 que es un TreeSet, ordeno a s4 que es un SET
        Set <Integer> s4= new TreeSet<>(s2);
        System.out.println("creo s4 con el constructor del TreeSet de s2");
        System.out.println(s4.toString());

        ArrayList <Integer> a1=new ArrayList<>();
        a1.add(4);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        s2.addAll(a1);
        System.out.println(s2.toString());
    }
}
