public class Carro implements Veiculo {
    private static final double VALOR_PEDAGIO = 5.00;

    @Override
    public double calcularPedagio() {
        return VALOR_PEDAGIO;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}
