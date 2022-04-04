package Colecciones_MetodosEstáticos;

import ArrayList_metodosBasicos.Cliente;

import java.util.Comparator;

public class CompareNombre implements Comparator<Cliente> {


    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNombre().compareTo(cliente2.getNombre());
    }
}
