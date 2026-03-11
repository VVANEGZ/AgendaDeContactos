import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda= new Agenda();
        Scanner teclado= new Scanner(System.in);
        int opcion;
        do{
            System.out.println("====AGENDA DE CONTACTOS===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            opcion= teclado.nextInt();
            teclado.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Numero de celular: ");
                    String numeroCelular= teclado.nextLine();
                    System.out.println("Correo electronico: ");
                    String email= teclado.nextLine();
                    System.out.println("Direccion: ");
                    String direccion= teclado.nextLine();
                    System.out.println("Desea agregarlo a favoritos?");
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del contacto que desea buscar: ");
                    String nombreContacto= teclado.nextLine();
                    agenda.buscarContacto(nombreContacto);
                    break;

                case 3:
                    System.out.println("Ingrese el contacto que desea eliminar: ");
                    String eliminar= teclado.nextLine();
                    break;

                case 4:
                    System.out.println("Contactos");
                    if(contactos.isEmpty()){
                        System.out.println("No tienes contactos agregados");
                    } else {
                        for (int i = 0; i < contactos.size(); i++){
                            System.out.println(i + 1) + ". " + contactos.get(i));
            }
        }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    system.out.println("opcion no válida");
    }
            while (!salir);
        }
}
