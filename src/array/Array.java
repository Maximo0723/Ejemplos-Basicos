package array;

public class Array {
	public void array(int numero1, int numero2, int numero3, int numero4, int numero5, int numero6, int numero7) {
		int [] arregloNumeros= new int[9];
		arregloNumeros[0]= numero1;
		arregloNumeros[1]= numero2;
		arregloNumeros[2]= numero3;
		arregloNumeros[3]= numero4;
		arregloNumeros[4]= numero5;
		arregloNumeros[5]= numero6;
		arregloNumeros[6]= numero7;
		for(int i= 0; i < 7; i++) {
			System.out.println(arregloNumeros[i]);
		}
	}
}
