package aula06.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = new String[6];

        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Digite um caractere: ");
            caracteres[i] = scanner.next();
        }

       
        System.out.print("Digite uma letra: ");
        String letra = scanner.next();
        boolean carEncontrado = false;

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i].equals(letra)) {
                System.out.println("A letra '" + letra + "' está na posição: " + i);
                carEncontrado = true;
                break;
            }
        }

        if (!carEncontrado) {
            System.out.println("A letra '" + letra + "' não foi encontrada no vetor.");
        }

        scanner.close();
    }
}
