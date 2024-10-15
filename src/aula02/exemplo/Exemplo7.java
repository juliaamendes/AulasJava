package aula02.exemplo;

import java.util.Scanner;

public class Exemplo7 {

    public static void main(String[] args) {
        String texto = "este texto esta na segunda linha\nEste texto esta na segunda linha" +
                "mesma linha\n\tEste texto esta na terceira linha e espaçado com tabulação";
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Didite seu nome:");
        int nome = scanner.nextInt();
        System.out.println( " Seu nome é "+nome+" e tem " +idade+" anos" );
        scanner.close();

    }
}
