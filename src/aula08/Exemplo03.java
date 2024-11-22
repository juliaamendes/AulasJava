package aula08;

import java.io.*;

public class Exemplo03 {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Novo Texto a ser gravado\n oi");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha = bufferedReader.readLine();
            while ((linha = bufferedReader.readLine())!= null){

            }
            System.out.println(linha);
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
