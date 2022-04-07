package Colecciones_Map;

import java.util.*;

public class Main {
//declaramos un map con clave un entero y con valor un String
static Map< Integer, String> miLinkedHashMap= new LinkedHashMap<>();
static Map< Integer, String> miHashMap= new HashMap<>();
static Map< Integer, String> miTreeMap= new TreeMap<>();

    public static void main(String[] args) {
        //vamos a añadirle datos al mapa. Método put
        miLinkedHashMap.put( 1,"Juan");
        miLinkedHashMap.put(150,"Rafael");
        miLinkedHashMap.put(14,"Maria");
        miLinkedHashMap.put(5,"Pedro");
        miLinkedHashMap.put(9,"Ana");
        miHashMap.put( 1,"Juan");
        miHashMap.put(150,"Rafael");
        miHashMap.put(14,"Maria");
        miHashMap.put(5,"Pedro");
        miHashMap.put(9,"Ana");
        miTreeMap.put( 1,"Juan");
        miTreeMap.put(150,"Rafael");
        miTreeMap.put(14,"Maria");
        miTreeMap.put(5,"Pedro");
        miTreeMap.put(9,"Ana");

        //Vamos a obtner el valor de la clave 14. Método get
        System.out.println("el valor de la clave 14 es "+ miHashMap.get(14));

        //vamos a obtener una coleccion Set con todas las claves del Map
        Set<Integer> clavesDeMiMapa= miHashMap.keySet();
        //lo recorro con foreach

        System.out.println("recorro las claves del mapa con un foreach");
        int i=1;
        for (Integer elemento:clavesDeMiMapa) {
            System.out.println("la clave "+ i + " es " +elemento);
            i++;
        }
        System.out.println("muestro las tres implementaciones de Map para ver cuál esta ordenada");
        System.out.println();

        System.out.println("HASHMAP");
        System.out.println(miHashMap);
        System.out.println();
        System.out.println("LINKEDHASHMAP");
        System.out.println(miLinkedHashMap);
        System.out.println();
        System.out.println("TREEMAP");
        System.out.println(miTreeMap);
        System.out.println();
//como vemos solo ordena automaticamente TreeMap
    }
}

