package exerciciosLista04;
import java.util.Scanner;
public class Ex06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada dos três números
	        System.out.print("Digite o primeiro número: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Digite o terceiro número: ");
	        double num3 = scanner.nextDouble();

	        // Verifica o maior número
	        double maior;

	        if (num1 >= num2 && num1 >= num3) {
	            maior = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            maior = num2;
	        } else {
	            maior = num3;
	        }

	        // Exibe o resultado
	        System.out.println("O maior número é: " + maior);

	        scanner.close();
	    }
}
