import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private List<Cliente> clientes;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public int totalCuentas() {
        return clientes.stream().mapToInt(c -> c.getCuentas().size()).sum();
    }

    public double totalSaldo() {
        return clientes.stream()
                .flatMap(c -> c.getCuentas().stream())
                .mapToDouble(Cuenta::getSaldo)
                .sum();
    }

    public String getNombre() {
        return nombre;
    }
}