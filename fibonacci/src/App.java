import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequencia = new ArrayList<>();
        System.out.println("Insira quantos termos da sequência de Fibonacci vc quer:");
        long numero = scanner.nextInt();

        for (int i = 0; i < numero; i ++) {
            if (i == 0 || i == 1) {
                sequencia.add(i);
            }
            else {
                Integer penultima = sequencia.get(i-2);
                Integer ultima = sequencia.get(i-1);
                sequencia.add(penultima + ultima);
            }
        }

        for (int i =0; i < sequencia.size(); i++) {
            System.out.print(sequencia.get(i)+ " ");
        }
       
    }
}
