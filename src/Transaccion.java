import java.time.LocalDateTime;

public class Transaccion {
    private String tipo;
    private double monto;
    private LocalDateTime fecha;

    public Transaccion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }

    public void mostrarDetalles() {
        System.out.println("[" + fecha + "] " + tipo + ": $" + monto);
    }

    public double getMonto() {
        return monto;
    }
}