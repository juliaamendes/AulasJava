package aula04_EstruturadeDeDecisoes;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção; ");
        System.out.println("\t1 - para ligar para a policia");
        System.out.println("\t2 - para ligar para a ambulancia");
        System.out.println("\t3 - para ligar para o bombeiro");

        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Certo, voce ligou para policia");
                break;
            case 2:
                System.out.println("Certo, voce ligou para ambulancia");
                break;
            case 3:
                System.out.println("Certo, voce ligou para bombeiro");
                break;
        }
        scanner.close();
    }
}
