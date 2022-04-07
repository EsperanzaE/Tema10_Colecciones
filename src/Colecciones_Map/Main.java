package Colecciones_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
//declaramos un map con clave un entero y con valor un String
static HashMap< Integer, String> miMapa= new HashMap<>();

    public static void main(String[] args) {
        //vamos a añadirle datos al mapa. Método put
        miMapa.put( 1,"Juan");
        miMapa.put(150,"Rafael");
        miMapa.put(14,"Maria");
        miMapa.put(5,"Pedro");
        miMapa.put(9,"Ana");

        //Vamos a obtner el valor de la clave 14. Método get
        System.out.println("el valor de la clave 14 es "+ miMapa.get(14));

        //vamos a obtener una coleccion Set con todas las claves del Map
        Set<Integer> clavesDeMiMapa= miMapa.keySet();
        //lo recorro con foreach

        System.out.println("recorro las claves del mapa con un foreach");
        int i=1;
        for (Integer elemento:clavesDeMiMapa) {
            System.out.println("la clave "+ i + " es " +elemento);
            i++;
        }
        System.out.println("vemos que están ordenadas aunque no la hemos insertado de forma ordenada ");
        System.out.println("un vistazo al mapa tal y como está. Método toString ");
        System.out.println(miMapa);

    }
}

