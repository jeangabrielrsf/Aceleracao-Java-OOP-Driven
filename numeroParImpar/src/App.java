import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        System.out.println("-----------------------");

        if (sc.hasNextInt()) {
            long numero = sc.nextInt();
            if (numero >= 0) {
                System.out.print(numero + " é positivo e ");
                if (numero % 2 == 0) {
                    System.out.println("par!");
                } else {
                    System.out.println("ímpar!");
                }
            }
            if (numero < 0) {
                System.out.print(numero + " é negativo e ");
                if (numero % 2 == 0) {
                    System.out.println("par!");
                } else {
                    System.out.println("ímpar!");
                }
            }
        }
        else {
            System.out.println("Tipo de variável incorreta! Encerrando...");
        }


    }
}
