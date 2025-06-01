public class Moto implements Veiculo {
    private static final double VALOR_PEDAGIO = 2.50;

    @Override
    public double calcularPedagio() {
        return VALOR_PEDAGIO;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}