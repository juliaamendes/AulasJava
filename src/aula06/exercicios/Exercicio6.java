package aula06.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][2];


        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite os valores para preencher a matriz 2x2:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            scanner.close();

            System.out.println("Matriz preenchida:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


