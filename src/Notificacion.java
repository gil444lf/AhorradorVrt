
public class Notificacion {
    private String mensaje;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviar(Usuario usuario) {
        System.out.println("Notificación enviada a " + usuario.getNombre() + ": " + mensaje);
    }
}
