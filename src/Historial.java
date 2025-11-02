import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<Transaccion> transacciones;

    public Historial() {
        this.transacciones = new ArrayList<>();
    }

    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    public void mostrarTransacciones() {
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            for (Transaccion t : transacciones) {
                t.mostrarDetalles();
            }
        }
    }
}