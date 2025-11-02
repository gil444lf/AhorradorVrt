public class MetaAhorro {
    private String nombreMeta;
    private double objetivo;
    private double montoActual;

    public MetaAhorro(String nombreMeta, double objetivo) {
        this.nombreMeta = nombreMeta;
        this.objetivo = objetivo;
        this.montoActual = 0;
    }

    public void ahorrar(double cantidad) {
        montoActual += cantidad;
        System.out.println("Has ahorrado $" + cantidad + " en la meta " + nombreMeta);
    }

    public String getNombreMeta() {
        return nombreMeta;
    }

    public double getProgreso() {
        return (montoActual / objetivo) * 100;
    }
}