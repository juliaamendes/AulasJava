package aula07.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static int main(String[] args) {
        int somar;
        int numero2 = 0;{
            int numero1 = 1;
            return numero1 + numero2;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextInt();

            int resultado = somar(numero1, numero2);


            System.out.println("A soma dos dois numeros é: " + resultado);

            scanner.close();

        }
    }

    private static int somar(int numero1, int numero2) {
        return 0;
    }
}


