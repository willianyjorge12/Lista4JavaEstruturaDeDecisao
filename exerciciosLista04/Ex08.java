package exerciciosLista04;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica divisibilidade por 3 e 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 3 e por 5.");
        } else {
            System.out.println("O número " + numero + " NÃO é divisível por 3 e por 5.");
        }

        scanner.close();
    }
}
