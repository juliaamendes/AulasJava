package aula07.exercicios;

    import java.util.Scanner;

    public class Exercicio3  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();

            int resultado = dobrar(numero);

            System.out.println("O dobro do número é: " + resultado);

            scanner.close();
        }

        public static int dobrar(int num) {
            return num * 2;
        }
    }


