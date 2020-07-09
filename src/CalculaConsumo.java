import java.util.Scanner;

public class CalculaConsumo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int quantidadeDeMinutosConsumidos = obterQuantidadeDeMinutosConsumidos();
        calcularEImprimirConsumoFinal(quantidadeDeMinutosConsumidos);
    }

    private static void calcularEImprimirConsumoFinal(int quantidadeDeMinutosConsumidos) {
        int limiteDeMinutosDoPlano = 100;
        double precoDoPlano = 50.0;
        double consumoFinal = quantidadeDeMinutosConsumidos <=limiteDeMinutosDoPlano? precoDoPlano: precoDoPlano+calcularCustosAdicioanais(quantidadeDeMinutosConsumidos-limiteDeMinutosDoPlano);
        System.out.printf("Valor da sua conta: %.2f", consumoFinal);
    }

    private static double calcularCustosAdicioanais(int minutosExcedidos) {
        double valorPorMinutoExcedido = 2.0;
        return (double) (minutosExcedidos*valorPorMinutoExcedido);
    }

    private static int obterQuantidadeDeMinutosConsumidos() {
        System.out.println("Digite a quantidade de minutos consumidos:");
        return scanner.nextInt();
    }
}
