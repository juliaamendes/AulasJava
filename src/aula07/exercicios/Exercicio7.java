package aula07.exercicios;

import java.util.Scanner; 

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        int maior = maiorNumero(num1, num2, num3);

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }

    public static int maiorNumero(int a, int b, int c) {
        int maior = a; // Assume que o primeiro número é o maior
        if (b > maior) { // Verifica se o segundo número é maior
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior;
    }
}
