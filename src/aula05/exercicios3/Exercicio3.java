import java.util.Scanner;
 
public class Exercicio3 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite um numero inteiro positivo: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        int i = numero;
 
        do {
            fatorial  = i;
            i--;
        } while (i > 0);
 
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}
