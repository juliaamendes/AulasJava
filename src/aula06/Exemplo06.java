package aula06;

public class Exemplo06 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println(numero);

        }
        String[] nomes = {"Julia", "Elaine", "Lais"};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
