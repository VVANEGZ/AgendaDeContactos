public class Contacto {
    private String nombre;
    private String numeroCelular;
    private boolean esFavorito;
    private String correoElectronico;
    private String direccion;

    public Contacto(String nombre, String numeroCelular, boolean esFavorito, String direccion, String correoElectronico) {
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.esFavorito = esFavorito;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public boolean isEsFavorito() {
        return esFavorito;
    }

    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
