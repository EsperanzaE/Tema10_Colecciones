package ArrayList_metodosBasicos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// programa con los ejemplos plasmados en la presentación del tema 10 sobre colecciones
public class Main {
    public static void main(String[] args) {
        //creación de una Lista
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        //adición de un objeto Cliente en concreto
        Cliente cliente1 = new Cliente("11111h","Marta", 20 );
        listaClientes.add(cliente1);
        //adición de varios objetos cliente
        listaClientes.add(new Cliente("222222h","Manuel", 21 ));
        listaClientes.add(new Cliente("333333h","Pepe", 22 ));
        listaClientes.add(new Cliente("4444444h","Lolo", 23 ));
        listaClientes.add(new Cliente("555555h","Lola", 24 ));
        listaClientes.add(new Cliente("6666666h","Juana", 25 ));
        listaClientes.add(new Cliente("7777777h","Jorge", 26 ));
        System.out.println("muestro la lista original");
        System.out.println(listaClientes.toString());

        //borrado de un nodo
        listaClientes.remove(cliente1);
        System.out.println("he borrado a  Marta");
        System.out.println(listaClientes.toString());

        //borrado de la lista entera
        listaClientes.clear();
        System.out.println("he borrado la lista entera");
        System.out.println(listaClientes.toString());

        //vuelvo a montar la lista para seguir con la presentación
        listaClientes.add(new Cliente("11111h","Marta", 20 ));
        listaClientes.add(new Cliente("222222h","Manuel", 21 ));
        listaClientes.add(new Cliente("333333h","Pepe", 22 ));
        listaClientes.add(new Cliente("4444444h","Lolo", 23 ));
        listaClientes.add(new Cliente("555555h","Lola", 24 ));
        listaClientes.add(new Cliente("6666666h","Juana", 25 ));
        listaClientes.add(new Cliente("7777777h","Jorge", 26 ));

        //vamos a comprobar cuántos elementos tiene la lista y si está o no vacía
        System.out.println("la lista tiene " + listaClientes.size()+ " elementos.");
        System.out.println("¿está la lista vacía? " + listaClientes.isEmpty());

        //vamos a ver si Marta está o no en la lista. Para nosotros un elemento está en la lista
        //si hay uno con el mismo dni porque así lo he definido en el metodo equals de cliente
        System.out.println("¿está Marta con dni 11111h en la lista? " +
                listaClientes.contains(new Cliente("11111h","pp",1)));
        //no ha hecho falta poner todos los atributos de marta, con el dni vale
        System.out.println("¿está JJ con dni 888888h en la lista? " +
                listaClientes.contains(new Cliente("888888h","pp",1))); //devuelve false

        //vamos a probar los iteradores

        Iterator iterator= listaClientes.iterator();//creamos el iterador
        //pedimos el siguiente nodo, en este caso es el 1º. Hay que hacer cast o si no
        //haberlo definido así Iterator <Cliente> iterator= listaClientes.iterator();
        Cliente clienteIterado= (Cliente) iterator.next();//el primero de nuestra lista es marta
        System.out.println("elemento primero que devuelve el iterador "+ clienteIterado);

        //vamos a leer el siguiente, tiene que salir Manuel
        System.out.println("elemento siguiente que devuelve el iterador "+ (Cliente) iterator.next());

        //vamos a preguntar si quedan más elementos en la lista
        System.out.println("quedan más elementos en la lista ??"+ iterator.hasNext());

        //vamos a recorrernos la lita con un foreach, no hace falta poner ningún indice
        //porque next además de mostrar el nodo, incrementa el iterador para que apunte al siguiente nodo
        System.out.println("\nse muestran los elementos que faltan con un for");
        for (;iterator.hasNext();){
            System.out.println("elemento siguiente que devuelve el iterador " + (Cliente) iterator.next());
        }

        //vamos a preguntar si quedan más elementos en la lista, nos tiene que decir que no(false)
        System.out.println("quedan más elementos en la lista ??"+ iterator.hasNext());

        //me voy a crear un ListIterador porque para recorrer la lista hacia atrás

        ListIterator<Cliente> listIterator=listaClientes.listIterator();
        //vamos a recorrer la lista 'pa lante' y 'pa tras'

        for (;listIterator.hasNext();){
            System.out.println(" elemento siguiente " + listIterator.next());
        }
        for (;listIterator.hasPrevious();){
            System.out.println(" elemento anterior " + listIterator.previous());
        }
        //pregunto si estamos al principio de la lista
        System.out.println("quedan más elementos al principio ? " + listIterator.hasPrevious());

    }
}
