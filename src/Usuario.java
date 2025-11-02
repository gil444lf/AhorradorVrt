public class Usuario {
    protected String nombre;
    protected String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarTipo() {
        System.out.println("Soy un usuario general del sistema.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}