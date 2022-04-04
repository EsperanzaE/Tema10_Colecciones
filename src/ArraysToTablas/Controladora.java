package ArraysToTablas;

import ArrayList_metodosBasicos.Cliente;

import java.util.ArrayList;

public class Controladora {
    public static void llenarArray(ArrayList<Cliente> listaClientes) {
        listaClientes.add(new Cliente("555555h","Lola", 24 ));
        listaClientes.add(new Cliente("6666666h","Juana", 25 ));
        listaClientes.add(new Cliente("7777777h","Jorge", 26 ));
        listaClientes.add(new Cliente("222222h","Manuel", 21 ));
        listaClientes.add(new Cliente("333333h","Pepe", 22 ));
        listaClientes.add(new Cliente("4444444h","Lolo", 23 ));

    }
}
