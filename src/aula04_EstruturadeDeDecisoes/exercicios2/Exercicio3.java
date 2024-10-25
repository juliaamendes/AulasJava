package aula04_EstruturadeDeDecisoes.exercicios2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigoProduto = 4;

        System.out.println("Digite o codigo de um produto: ");

        switch (codigoProduto) {
            case 1:
                System.out.println("Eletronicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuário");
            default:{
                System.out.println("Não existe categoria com esse código");
            }
        }
    }
}


