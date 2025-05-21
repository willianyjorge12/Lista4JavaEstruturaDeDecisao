package exerciciosLista04;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o ano ao usuário
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        // Verifica se o ano é bissexto
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        // Exibe o resultado
        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        scanner.close();
    }
}
