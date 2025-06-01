public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Caminhao(4); // 4 eixos
        Veiculo v3 = new Moto();

        processarPedagio(v1);
        processarPedagio(v2);
        processarPedagio(v3);

        RelatorioPedagio.exibirRelatorio();
    }

        public static void processarPedagio(Veiculo veiculo) {
        double valor = veiculo.calcularPedagio();
        System.out.printf("Veículo: %s | Valor do Pedágio: R$ %.2f%n", veiculo.getTipo(), valor);
        RelatorioPedagio.adicionarValor(valor);
    }
}

