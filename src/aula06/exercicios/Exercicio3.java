import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] valores = new boolean[8];
        int contadorTrue = 0; // Contador para valores true

       
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite 'true' ou 'false': ");
            valores[i] = scanner.nextBoolean(); // Lê true ou false
            if (valores[i]) { // Se for true, incrementa o contador
                contadorTrue++;
            }
        }

        System.out.println("Quantidade de valores 'true': " + contadorTrue);

        scanner.close(); 
    }
}