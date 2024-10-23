package aula05;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 20;

        do {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.print(idade);

        } while (idade < 18);

        System.out.println("Voce é maior de idade");
        scanner.close();
    }
}