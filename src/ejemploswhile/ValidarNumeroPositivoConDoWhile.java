package ejemploswhile;

import java.util.Scanner;

public class ValidarNumeroPositivoConDoWhile {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int numero;
		do {
			System.out.println("Ingrese un n�mero positivo");
			numero= scanner.nextInt();
			if(numero <= 0) {
				System.out.println("El n�mero no es positivo, intente nuevamente");
			}
		} while(numero <= 0);
	}
}
