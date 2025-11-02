
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<Cuenta> cuentas;          // Agregación
    private List<MetaAhorro> metas;        // Agregación
    private Historial historial;           // Composición
    private Recompensa recompensa;         // Composición

    public Cliente(String nombre, String email) {
        super(nombre, email);
        this.cuentas = new ArrayList<>();
        this.metas = new ArrayList<>();
        this.historial = new Historial();
        this.recompensa = new Recompensa("Sin recompensa aún");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un cliente que usa el sistema de ahorro.");
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void agregarMeta(MetaAhorro meta) {
        metas.add(meta);
    }

    public void registrarTransaccion(Transaccion transaccion) {
        historial.agregarTransaccion(transaccion);
    }

    public void mostrarHistorial() {
        historial.mostrarTransacciones();
    }

    public void verificarRecompensa() {
        if (!metas.isEmpty()) {
            double promedioProgreso = metas.stream().mapToDouble(MetaAhorro::getProgreso).average().orElse(0);
            if (promedioProgreso >= 80) {
                recompensa.setDescripcion("¡Felicidades! Has alcanzado el 80% de tus metas.");
            }
        }
        System.out.println(recompensa.getDescripcion());
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public List<MetaAhorro> getMetas() {
        return metas;
    }
}
