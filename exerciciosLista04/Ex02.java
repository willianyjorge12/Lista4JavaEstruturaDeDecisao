package exerciciosLista04;
import java.util.Scanner;
public class Ex02 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita a idade do usuário
	        System.out.print("Digite sua idade: ");
	        int idade = scanner.nextInt();

	        // Verifica se é maior de idade
	        if (idade >= 18) {
	            System.out.println("Você é maior de idade.");
	        } else {
	            System.out.println("Você é menor de idade.");
	        }

	        scanner.close();
	    }
}
