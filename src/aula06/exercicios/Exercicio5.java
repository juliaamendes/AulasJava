package aula06.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 nomes:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome que deseja verificar: ");
        String nomeParaVerificar = scanner.nextLine();

        int posicao = -1; 
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeParaVerificar)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O nome está presente no vetor na posição: " + posicao);
        } else {
            System.out.println("O nome NÃO está presente no vetor.");
        }

        scanner.close(); 
    }
}
