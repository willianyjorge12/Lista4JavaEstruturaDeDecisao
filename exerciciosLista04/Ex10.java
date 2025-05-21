package exerciciosLista04;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os comprimentos dos lados
        System.out.print("Digite o comprimento do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 3: ");
        double lado3 = scanner.nextDouble();

        // Verifica se é triângulo válido
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados NÃO formam um triângulo válido.");
        }

        scanner.close();
    }
}
