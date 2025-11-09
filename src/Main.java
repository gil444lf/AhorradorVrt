
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

        
        //  DIEGO GARZÓN
        Administrador adminDiego = new Administrador("Diego Garzón", "diego.admin@correo.com");
        Cliente clienteDiego = new Cliente("Diego Garzón", "diego.cliente@correo.com");
        Cuenta cuentaDiego = new Cuenta(1800000);
        MetaAhorro metaMoto = new MetaAhorro("Moto eléctrica", 5000000);
        clienteDiego.agregarCuenta(cuentaDiego);
        clienteDiego.agregarMeta(metaMoto);

        adminDiego.revisarCuentas();
        adminDiego.mostrarTipo();

        Banco banco = new Banco("Banco AhorraMás");
        banco.agregarCliente(juan);
        banco.agregarCliente(clienteDiego);

        Reporte reporte = adminDiego.generarReporte(banco);
        reporte.mostrarReporte();


    
        // SEBASTIÁN GIRALDO GRISALES
     

 Administrador adminSebas = new Administrador("Sebastián Giraldo Grisales", "sebas.admin@correo.com");
        Cliente clienteSebas = new Cliente("Sebastián Giraldo Grisales", "sebas.cliente@correo.com");
        Cuenta cuentaSebas = new Cuenta(2700000);
        MetaAhorro metaPC = new MetaAhorro("PC Gamer", 3500000);

        clienteSebas.agregarCuenta(cuentaSebas);
        clienteSebas.agregarMeta(metaPC);

        Transaccion t2 = new Transaccion("Depósito", 500000);
        clienteSebas.registrarTransaccion(t2);
        metaPC.ahorrar(500000);
        clienteSebas.verificarRecompensa();


        Notificacion notifSebas = new Notificacion("¡Has avanzado un 20% en tu meta del PC Gamer!");
        notifSebas.enviar(clienteSebas);


        // ----------------------------------------
        //  JUAN CAMILO RODRÍGUEZ
        // ----------------------------------------
        Cliente juanCamilo = new Cliente("Juan Camilo Rodríguez", "juan.camilo@correo.com");
        Cuenta cuentaAhorros = new Cuenta(1200000);
        Cuenta cuentaViajes = new Cuenta(800000);
        MetaAhorro metaViaje = new MetaAhorro("Viaje a Europa", 7000000);

        juanCamilo.agregarCuenta(cuentaAhorros);
        juanCamilo.agregarCuenta(cuentaViajes);
        juanCamilo.agregarMeta(metaViaje);

        Transaccion t3 = new Transaccion("Depósito ahorro", 300000);
        juanCamilo.registrarTransaccion(t3);
        metaViaje.ahorrar(300000);

        Notificacion notifCamilo = new Notificacion("Tu meta de viaje va por buen camino 🚀");
        notifCamilo.enviar(juanCamilo);
        juanCamilo.mostrarHistorial();

        // ----------------------------------------
        //  RESUMEN FINAL
        // ----------------------------------------
        System.out.println("\n==== RESUMEN FINAL DEL SISTEMA ====");
        banco.agregarCliente(clienteSebas);
        banco.agregarCliente(juanCamilo);

        Reporte reporteFinal = adminSebas.generarReporte(banco);
        reporteFinal.mostrarReporte();
    }
