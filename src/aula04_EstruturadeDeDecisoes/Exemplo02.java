package aula04_EstruturadeDeDecisoes;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String corSemaforo ;

        System.out.println("Digite a cor do semaforo");
        corSemaforo = scanner.nextLine();

        if(corSemaforo.equals("verde") || corSemaforo.equals("Verde")) {
            System.out.println("Siga");
        }else if(corSemaforo.equals("amarelo") || corSemaforo.equals("Amarelo")) {
            System.out.println("Atenção");
        }else if(corSemaforo.equals("vermelho") || corSemaforo.equals("Vermelho")) {
            System.out.println("Pare");
        }else {
            System.out.println("Cor inválida");

        }
        scanner.close();

    }
}
