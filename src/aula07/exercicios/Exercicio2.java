package aula07.exercicios;

    import java.util.Scanner;

    public class Exercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número:");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int num2 = scanner.nextInt();

            int resultado = somar(num1, num2);

            System.out.println("A soma dos dois números é: " + resultado);

            scanner.close();
        }
        public static int somar(int a, int b) {
            return a + b;
        }
    }


