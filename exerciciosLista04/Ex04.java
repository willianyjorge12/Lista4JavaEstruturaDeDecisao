package exerciciosLista04;
import java.util.Scanner;
public class Ex04 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita um número ao usuário
	        System.out.print("Digite um número: ");
	        double numero = scanner.nextDouble();

	        // Verifica se é positivo, negativo ou zero
	        if (numero > 0) {
	            System.out.println("O número é positivo.");
	        } else if (numero < 0) {
	            System.out.println("O número é negativo.");
	        } else {
	            System.out.println("O número é zero.");
	        }

	        scanner.close();
	    }
}
