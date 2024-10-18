package aula04_EstruturadeDeDecisoes;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemaforo;
        System.out.println("Digite a cor do semaforo");
        corSemaforo = scanner.nextLine();

        switch (corSemaforo) {

            case "verde", "Verde","VERDE":
                System.out.println("Siga");
                break;
            case "amarelo", "Amarelo","AMARELO":
                System.out.println("Atenção");
                break;
            case "vermelho","Vermelho","VERMELHO":
                System.out.println("Pare!");
                break;

            default:
                System.out.println("Nunca vi um semaforo com a cor "+corSemaforo);
        }
        scanner.close();
    }
}
