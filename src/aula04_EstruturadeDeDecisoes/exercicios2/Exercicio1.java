package aula04_EstruturadeDeDecisoes.exercicios2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade > 0 && idade <= 17) {
            System.out.println("Acesso Negado!");
        } else if (idade >=18) {
            System.out.println("Acesso Permitido!");

        }
        scanner.close();
    }
}

