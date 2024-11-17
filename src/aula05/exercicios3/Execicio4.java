import java.util.Scanner;
 
public class Exercicio4 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        boolean numeroPrimo = true;
 
        if (numero < 2) {
            numeroPrimo = false;
        } else {
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                   numeroPrimo = false;
                    break;
                }
            }
        }
 
        if (numeroPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " nao é primo.");
        }
 
        scanner.close();
    }
}
