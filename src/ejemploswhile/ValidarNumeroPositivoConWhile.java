package ejemploswhile;

import java.util.Scanner;

public class ValidarNumeroPositivoConWhile {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un n�mero positivo");
		numero= scanner.nextInt();
		while (numero <= 0) {
			System.out.println("El n�mero ingresado no es posit�vo, intente de nuevo");
			System.out.println("Ingrese un n�mero positivo");
			numero= scanner.nextInt();
		}
	}

}
