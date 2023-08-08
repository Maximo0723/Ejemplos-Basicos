import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import array.Array;
import comparadornumeros.ComparadorNumeros;

public class Main {

	public static void main(String[] args) {
		while(true) {
			System.out.println("Ingresa una opción del 1 al 4");
			System.out.println("1) Comparador de números.");
			System.out.println("2) Arrays");
			System.out.println("3) Listas");
			System.out.println("4) ");
			Scanner scanner=new Scanner(System.in);
			int numero= scanner.nextInt();
			if(numero == 0 || numero > 4) {
				System.out.println("Error, el numero debe estar entre 1 y 4");
			} else {
			switch(numero) {
				case 1:
					System.out.println("Comparador de números");
					scanner=new Scanner(System.in);
					System.out.println("Ingrese el primer número");
					int primerNumero = scanner.nextInt();
					System.out.println("Ingrese el segundo número");
					int segundoNumero = scanner.nextInt();
					ComparadorNumeros comparadorNumeros=new ComparadorNumeros();
					comparadorNumeros.comparadorNumeros(primerNumero, segundoNumero);
					break;
				case 2:
					System.out.println("Arrays");
					scanner=new Scanner(System.in);
					System.out.println("Ingrese el primer número");
					int numero1 = scanner.nextInt();
					System.out.println("Ingrese el segundo número");
					int numero2 = scanner.nextInt();
					System.out.println("Ingrese el tercer número");
					int numero3 = scanner.nextInt();
					System.out.println("Ingrese el cuarto número");
					int numero4 = scanner.nextInt();
					System.out.println("Ingrese el quinto número");
					int numero5 = scanner.nextInt();
					System.out.println("Ingrese el sexto número");
					int numero6 = scanner.nextInt();
					System.out.println("Ingrese el septimo número");
					int numero7 = scanner.nextInt();
					Array array = new Array();
					array.array(numero1, numero2, numero3, numero4, numero5, numero6, numero7);
					break;
				case 3:
					System.out.println("Listas");
					List<String> lista1= new ArrayList<>();
					lista1.add("ejemplo1");
					lista1.add("ejemplo2");
					lista1.add("ejemplo3");
					lista1.add("ejemplo4");
					for(int i= 0; i< lista1.size(); i++) {
						System.out.println(lista1.get(i));
					}
					break;
				case 4:
					System.out.println("Entraste a la opción 4");
					int variable1= 0;
					do{
						System.out.println("Ingrese un número");
						scanner= new Scanner(System.in);
						variable1= scanner.nextInt();
					} while(variable1 > 0);
					break;
				}
			}
		}
	}
}


