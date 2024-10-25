package aula04_EstruturadeDeDecisoes.exercicios2;

public class Exercicio3 {
    public static void main(String[] args) {

        int codigoDeProduto = 4;

        switch (codigoDeProduto) {
            case 1:
                System.out.println("Eletronicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuário");

            default:{
                System.out.println("Não existe categoria com esse código");
            }
        }
    }
}


