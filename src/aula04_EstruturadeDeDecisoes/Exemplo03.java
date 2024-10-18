package aula04_EstruturadeDeDecisoes;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade>0 && idade<=12) {
            System.out.println("Voce é criança!");
        } else if (idade>12 && idade<=17) {
            System.out.println("Voce é adolescente!");
        }else if (idade>17 && idade<=65) {
            System.out.println("Voce é adulto!");
        }else if (idade>=65) {
            System.out.println("Voce é idoso!!");
        }
        scanner.close();
    }
}
