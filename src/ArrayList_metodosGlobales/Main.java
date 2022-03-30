package ArrayList_metodosGlobales;

import ArrayList_metodosBasicos.Cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//vamos a ver los ejemplos relacionados con los métodos globales de las colecciones ArrayList
public class Main {
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Cliente> listaClientes2 = new ArrayList<>();

    public static void main(String[] args) {
// vamos a probar el método containsAll
//lleno los dos arrayList listaClientes y listaClientes2 con los mismos datos
        //listaClientes
        listaClientes.add(new Cliente("222222h", "Manuel", 21));
        listaClientes.add(new Cliente("333333h", "Pepe", 22));
        listaClientes.add(new Cliente("4444444h", "Lolo", 23));
        listaClientes.add(new Cliente("555555h", "Lola", 24));
        listaClientes.add(new Cliente("6666666h", "Juana", 25));
        listaClientes.add(new Cliente("7777777h", "Jorge", 26));

        //listaClientes2
        listaClientes2.add(new Cliente("222222h", "Manuel", 21));
        listaClientes2.add(new Cliente("333333h", "Pepe", 22));
        listaClientes2.add(new Cliente("4444444h", "Lolo", 23));
        listaClientes2.add(new Cliente("555555h", "Lola", 24));
        listaClientes2.add(new Cliente("6666666h", "Juana", 25));
        listaClientes2.add(new Cliente("7777777h", "Jorge", 26));

        System.out.println("Mi listaClientes contiene totalmente a listaClientes2? " +
                listaClientes.containsAll(listaClientes2));
        //añado un elemento a listaClientes2 y ahora me tiene que dar falso
        listaClientes2.add(new Cliente("888888t", "Sergio", 65));
        System.out.println("Mi listaClientes contiene totalmente a listaClientes2 tras añadir un elemento a este? " +
                listaClientes.containsAll(listaClientes2));

        //voy a añadir toda la segunda colección a la primera
        listaClientes.addAll(listaClientes2);
        System.out.println("vamos a ver el resultado de unir las dos listas del clientes");
        System.out.println(listaClientes);

        //ahora vamos a hacer lo contrario, vamos a quitar de listaClientes la parte de listaClientes2 que
        //añadimos con anterioridod
        System.out.println("vamos a ver el resultado de quitarle a listaClientes la parte de listaClientes2 que se" +
                " la había añadido en el paso anterior, y qué pasa, que se queda vacía porque los datos estaban" +
                " repetidos y usa el metod equals");
        listaClientes.removeAll(listaClientes2);
        System.out.println(listaClientes);
        //vamos a rellenar listaclietes que está vacía  con datos válidos para probar
        //convenientemente removeAll
        listaClientes.add(new Cliente("222222h", "Manuel", 21));
        listaClientes.add(new Cliente("333333h", "Pepe", 22));
        listaClientes.add(new Cliente("4444444h", "Lolo", 23));
        listaClientes.add(new Cliente("555555h", "Lola", 24));
        listaClientes.add(new Cliente("6666666h", "Juana", 25));
        listaClientes.add(new Cliente("7777777h", "Jorge", 26));
        listaClientes.add(new Cliente("999999999h", "Jorge", 26));
        listaClientes.add(new Cliente("AAAAAAAAAh", "Jorge", 26));
        System.out.println("nueva prueba de removeAll, nos tiene que devolver solo dos clientes que tiene" +
                " nuestra primera lista que no tiene la segunda");
        listaClientes.removeAll(listaClientes2);
        System.out.println(listaClientes);
//vamos a rellenarla de nuevo para probar la opeeración contraria a removeAll, que es retainAll
        listaClientes.add(new Cliente("222222h", "Manuel", 21));
        listaClientes.add(new Cliente("333333h", "Pepe", 22));
        listaClientes.add(new Cliente("4444444h", "Lolo", 23));
        listaClientes.add(new Cliente("555555h", "Lola", 24));
        listaClientes.add(new Cliente("6666666h", "Juana", 25));
        listaClientes.add(new Cliente("7777777h", "Jorge", 26));

        System.out.println("tras volver a rellenar probamos retainAll por lo que nos tiene que " +
                "quedar los clientes que están en ambas listas");
        listaClientes.retainAll(listaClientes2);
        System.out.println(listaClientes);

        listaClientes.add(new Cliente("555555h", "Lola", 24));
        listaClientes.add(new Cliente("6666666h", "Juana", 25));
        listaClientes.add(new Cliente("7777777h", "Jorge", 26));
        listaClientes.add(new Cliente("222222h", "Manuel", 21));
        listaClientes.add(new Cliente("333333h", "Pepe", 22));
        listaClientes.add(new Cliente("4444444h", "Lolo", 23));
        System.out.println(listaClientes);
        Collections.sort(listaClientes);
        System.out.println(listaClientes);

    }
}
