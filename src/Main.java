
public class Main {
    public static void main(String[] args) {
        // Aquí cada integrante debe crear 3 objetos según las clases
        // Ejemplo: Cliente c1 = new Cliente("Juan", "juan@gmail.com", 2000000);
        // Dejar vacío para completar en grupo

        // JUAN JOSÉ GIL GUTIÉRREZ
        // Polimorfismo: Usuario referencia a Cliente
        Usuario usuarioJuan = new Cliente("Juan José Gil Gutiérrez", "juan.gil@correo.com", 2500000);
        MetaAhorro metaJuan = new MetaAhorro("Laptop Asus TUF", 2400000, 6);
        CalculadoraAhorro calculadoraJuan = new CalculadoraAhorro(metaJuan, (Cliente) usuarioJuan);

        System.out.println("Ahorro sugerido para Juan: $" + calculadoraJuan.calcularAhorroSugerido());

    }
}
        // ----------------------------------------
        //  DIEGO GARZÓN
        // ----------------------------------------

        Administrador adminDiego = new Administrador("Diego Garzón", "diego.admin@correo.com", "Finanzas");
        Usuario usuarioDiego = new Cliente("Diego Garzón", "diego.cliente@correo.com", 1800000);
        MetaAhorro metaDiego = new MetaAhorro("Moto eléctrica", 5000000, 12);

        // Agregación: el administrador gestiona un cliente
        adminDiego.agregarCliente((Cliente) usuarioDiego);

        System.out.println("Administrador " + adminDiego.getNombre() + " gestiona al cliente " + usuarioDiego.getNombre());
