import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contacto> contactos;
    public Agenda(){
        this.contactos = new ArrayList<>();
    }

    public boolean agregarContacto(Contacto contacto) {
        if (buscarContacto(contacto.getNombre()) == null) {
            contactos.add(contacto);
            return true;
        }
        return false;
    }

    public boolean eliminarContacto(String nombre) {
        Contacto contacto= buscarContacto(nombre);
        if (contacto != null) {
            return contactos.remove(contacto);
        }
        return false;
    }

    public void mostrarContactos() {
        System.out.println("\n======Todos sus contactos========");
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos por mostrar.");
        } else {
            for (Contacto contacto : contactos) {
                System.out.println("- " + contacto);
            }
        }
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }
}
