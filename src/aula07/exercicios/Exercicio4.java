package aula07.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius (número inteiro): ");
        int celsius = scanner.nextInt();

        int fahrenheit = converterCelsiusParaFahrenheit(celsius);

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
    public static int converterCelsiusParaFahrenheit(int celsius) {
        return (int) (celsius * 1.8 + 32);
    }
}


