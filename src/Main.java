import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            mostrarMenu();
            
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    registrarNuevoContacto(teclado, agenda); break;

                case 2:
                    buscarContacto(teclado, agenda);
                    break;

                case 3:
                    eliminarContacto(teclado, agenda);
                    break;

                case 4:
                    agenda.mostrarContactos();
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (!salir);

        teclado.close();
        System.out.println("¡Hasta luego!");
    }

    private static void mostrarMenu(){
        System.out.println("\n======AGENDA DE CONTACTOS=======");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar todos los contactos");
        System.out.println("5. Salir");
        System.out.println("Elige una opcion: ");
    }
    private static void registrarNuevoContacto(Scanner teclado, Agenda agenda) {
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Numero de celular: ");
        String numeroCelular = teclado.nextLine();
        System.out.print("Direccion: ");
        String direccion = teclado.nextLine();
        System.out.print("Correo electronico: ");
        String email = teclado.nextLine();

        System.out.print("Desea agregarlo a favoritos? (s/n): ");
        String favoritoResp = teclado.nextLine();
        boolean esFavorito = favoritoResp.equalsIgnoreCase("s");
        Contacto nuevo = new Contacto(nombre, numeroCelular, esFavorito, direccion, email);
        if (agenda.agregarContacto(nuevo)) {
            System.out.println("Contacto agregado correctamente.");
        } else {
            System.out.println("El contacto ya existe (nombre duplicado).");
        }
    }

        private static void buscarContacto(Scanner teclado, Agenda agenda) {
        System.out.print("Ingrese el nombre del contacto que desea buscar: ");
        String nombreContacto = teclado.nextLine();
        Contacto encontrado = agenda.buscarContacto(nombreContacto);
        
        if (encontrado != null) {
            System.out.println("Contacto encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }

    private static void eliminarContacto(Scanner teclado, Agenda agenda) {
        System.out.print("Ingrese el nombre del contacto que desea eliminar: ");
        String nombre = teclado.nextLine();
        
        if (agenda.eliminarContacto(nombre)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún contacto con ese nombre para eliminar.");
        }
    }
}
