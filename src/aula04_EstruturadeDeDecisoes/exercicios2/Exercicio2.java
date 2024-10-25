package aula04_EstruturadeDeDecisoes.exercicios2;

public class Exercicio2 {
    public static void main(String[] args) {

        float valorCompra = 80;
        float desconto = 0.1f;

        if (valorCompra >= 100) {

            double resultado = valorCompra - (valorCompra * desconto);
            System.out.println("O valor da compra sera de " + resultado + " reais com desconto");

        } else {
            System.out.println("O valor da compra sera de " + valorCompra + " reais sem desconto");
        }
    }
}

