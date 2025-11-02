public class Administrador extends Usuario {

    public Administrador(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un administrador del sistema de ahorro.");
    }

    public void revisarCuentas() {
        System.out.println(nombre + " está revisando las cuentas de los clientes.");
    }

    public Reporte generarReporte(Banco banco) {
        System.out.println(nombre + " está generando un reporte general de clientes.");
        return new Reporte(banco.getClientes().size(), banco.totalCuentas(), banco.totalSaldo());
    }
}