package aula04_EstruturadeDeDecisoes;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor da compra: ");
        float valorCompra = scanner.nextFloat();
        float valorTotal, desconto = 0.5f;

        valorTotal = valorCompra > 100.0f ? valorCompra - valorCompra*desconto : valorCompra;

        System.out.println("O valor da compra é: " + valorTotal);
        scanner.close();

    }
}
