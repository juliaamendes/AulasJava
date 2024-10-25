package aula04_EstruturadeDeDecisoes.exercicios2;

public class Exercicio2 {
    public static void main(String[] args) {

        float valorDaCompra = 80;
        float desconto = 0.1f;

        if (valorDaCompra >= 100) {

            double resultado = valorDaCompra - (valorDaCompra * desconto);
            System.out.println("O valor da compra sera de " + resultado + " reais com desconto");

        } else {
            System.out.println("O valor da compra sera de " + valorDaCompra + " reais sem desconto");
        }
    }
}

