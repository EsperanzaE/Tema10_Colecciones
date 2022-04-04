package ArrayList_metodosBasicos;

public class Cliente implements Comparable<Cliente> {
    private String dni;
    private String nombre;
    private int edad;

    //constructor
    public Cliente(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // reescribo el método to String
    @Override
    public String toString() {

        return "\nDNI: " + this.dni + " nombre: " + this.nombre + " edad: " +
                this.edad;
    }
// reescribo el metodo equal basado en dni para el funcionamiento de Contains

    @Override
    public boolean equals(Object object) {
        boolean rtdo = false;
        if (object instanceof Cliente) {
            Cliente cliente = (Cliente) object;
            if (this.dni == cliente.dni) {
                rtdo = true;
            } else {
                rtdo = false;
            }

        }
        return rtdo;
    }


   /*@Override
    public int compareTo(Object object) {
        int rtdo=0;
        if (this == object){
        return 0;
    }else{
            if (object instanceof Cliente){
                Cliente cliente= (Cliente) object;
                rtdo= this.dni.compareTo(cliente.dni);
                }
            }
        return rtdo;
        }
*/
    public int compareTo(Cliente object) {
        return  this.dni.compareTo(object.dni);

    }
}