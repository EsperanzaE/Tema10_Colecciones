package ArrayList_MetodosEspecíficos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> miArrayList = new ArrayList<>();
        miArrayList.add(0); //hace el boxing directamente, no hay que poner miArrayList.add(new Integer(0));
        miArrayList.add(1);
        miArrayList.add(2);
        miArrayList.add(3);
        miArrayList.add(4);
        miArrayList.add(5);
        miArrayList.add(6);
//EJEMPLO PARA PROBAR E GET (INT INDICE):
        System.out.println("probamos get (indice) recuperando el valor del índice 5 que tiene que dar 5: " +
                "miArrayList.get(5) = " +
                miArrayList.get(5));

//EJEMPLO PARA PROBAR E SET (INT INDICE, E ELEM):
        System.out.println("probamos set (int indice, E elem) modificando el valor de la posición 5, que la" +
                " vamos a cambiar por 8 y el método tiene que devolvernos 5 que es el valor \nque había" +
                " antes");
        System.out.println("miArrayList.set(5,8) devuelve " + miArrayList.set(5, 8));
        System.out.print("y ArrayList.get(5) devuelve " + miArrayList.get(5));

//EJEMPLO PARA PROBAR VOID ADD (INT INDICE, E ELEM):
        System.out.println("\nprobamos add (int indice, E elem) insertando el valor 99 en la posición 5");
        miArrayList.add(5, 99);
        System.out.print("Mostramos la lista entera" + miArrayList.toString());
//EJEMPLO PARA PROBAR boolean addAll (int indice, Collection <? Extends E> c): Para ello vamos a crear otra
//colección de enteros


    }
}
