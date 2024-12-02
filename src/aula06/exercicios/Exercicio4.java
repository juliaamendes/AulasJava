package aula06.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[4];
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt(); 
            soma += notas[i]; 
       }
        double media = soma / notas.length;

        
        System.out.println("A media das notas é: " + media);

        scanner.close(); 
    }
}
