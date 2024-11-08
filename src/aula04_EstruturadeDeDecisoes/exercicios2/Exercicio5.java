package aula04_EstruturadeDeDecisoes.exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor de cada hora trabalhada: ");
        int valorHoras = scanner.nextInt();

        int horasSemanais = 40;
        double pagamentoHoraExtra = 0;

        if (horasTrabalhadas > horasSemanais) {

            double horasExtras = horasTrabalhadas - horasSemanais;
            double valorHoraExtra = valorHoras * 1.5;
            pagamentoHoraExtra = horasExtras * valorHoraExtra;

        }
        if (pagamentoHoraExtra > 0) {
            System.out.println("O valor das horas extras é: " + pagamentoHoraExtra);

        } else {
            System.out.println("Voce nao tem horas extras:( ");

        }
    }
}
