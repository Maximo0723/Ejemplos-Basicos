package ejemploswhile;

import java.util.Scanner;

public class ValidarNumeroPositivoConWhile {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un número positivo");
		numero= scanner.nextInt();
		while (numero <= 0) {
			System.out.println("El número ingresado no es positívo, intente de nuevo");
			System.out.println("Ingrese un número positivo");
			numero= scanner.nextInt();
		}
	}

}
