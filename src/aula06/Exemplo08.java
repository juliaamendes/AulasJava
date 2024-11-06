package aula06;

public class Exemplo08 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        for (int[] matrizNumero : matrizNumeros){
            for (int numero :matrizNumero) {
                System.out.println(numero);

            }

        }
        String[][] matrizNomes = {{"Julia", "Flokinho"}, {"Lais", "Elaine"}};

        for (int linha = 0; linha < matrizNomes.length; linha++) {
            for (int coluna = 0; coluna < matrizNumeros[0].length; coluna++) {
                System.out.println(matrizNumeros[linha][coluna]);

            }
        }
    }
}
