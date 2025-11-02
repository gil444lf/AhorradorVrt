
public class Reporte {
    private int totalClientes;
    private int totalCuentas;
    private double saldoTotal;

    public Reporte(int totalClientes, int totalCuentas, double saldoTotal) {
        this.totalClientes = totalClientes;
        this.totalCuentas = totalCuentas;
        this.saldoTotal = saldoTotal;
    }

    public void mostrarReporte() {
        System.out.println("=== REPORTE GENERAL ===");
        System.out.println("Clientes registrados: " + totalClientes);
        System.out.println("Cuentas activas: " + totalCuentas);
        System.out.println("Saldo total en el sistema: $" + saldoTotal);
    }
}