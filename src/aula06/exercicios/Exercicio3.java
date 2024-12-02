package aula06.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] valores = new boolean[8];
        int contador = 0; 

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite 'true' ou 'false': ");
            valores[i] = scanner.nextBoolean(); 
            if (valores[i]) {
                contador++;
            }
        }

        System.out.println("Quantidade de valores 'true': " + contadorTrue);

        scanner.close(); 
    }
}
