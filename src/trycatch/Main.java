package trycatch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese un número");
		String input= scanner.next();
		try {
			int numero= Integer.parseInt(input);
			System.out.println("El número ingresado es: " + numero);
		} catch(NumberFormatException e){
			System.out.println("Lo ingresado no es un número");
		}
	}

}
