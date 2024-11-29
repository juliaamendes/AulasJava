package aula06.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        String menu = """
                __________________________________
                |   Escolha uma opcção:          |
                |    1-Exibir Cadastro Completo  |
                |    1-Cadastrar Usuario         |
                |    1-Atualizar Usuario         |
                |    1-Deletar                   |
                |    1-Sair                      |
                |________________________________|
                """;
        int opcao;

        do {

            System.out.println(menu);
            Scanner scanner;
            opcao = scanner.nextInt();
            scannner.nextLine();

            switch (opcao) {

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;


                case 5:
                    break;

                default:
                    System.out.println("Opção invalida!!");
            }


            public static void exibirUsuarios () {
                System.out.println("Exibir Usuarios");
            }

            public static void cadastrarUsuarios () {
                System.out.println("Cadastrar Usuarios");
            }

            public static void atualizarUsuarios () {
                System.out.println("Atualizar Usuarios");
            }
        }while (opcao!=5);

    }
}