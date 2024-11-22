public class Exercicio6 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int contador = 0;
 
        System.out.println("Sequência de Fibonacci:");
        while (contador < 10) {
            System.out.print(num1 + " "); 
            int proximo = num1 + num2;   
            num1 = num2;               
            num2 = proximo;             
            contador = contador + 1;    
        }
    }
}
