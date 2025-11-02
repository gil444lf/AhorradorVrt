
public class CalculadoraAhorro {

    // Polimorfismo: Sobrecarga de métodos
    public double calcularAhorroSugerido(double ingresoMensual) {
        return ingresoMensual * 0.10;
    }

    public double calcularAhorroSugerido(double ingresoMensual, double porcentaje) {
        return ingresoMensual * (porcentaje / 100);
    }

    public double calcularTiempoParaMeta(double ingresoMensual, double porcentaje, double metaObjetivo) {
        double ahorroMensual = calcularAhorroSugerido(ingresoMensual, porcentaje);
        return metaObjetivo / ahorroMensual;
    }
}