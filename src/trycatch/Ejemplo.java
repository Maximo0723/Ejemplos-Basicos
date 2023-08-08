package trycatch;

public class Ejemplo {

	public static void main(String[] args) {
		
		try {
			int numero= 5/0;
		} catch(Exception e) {
			System.out.println("No se puede dividir entre 0");
		}
	}

}
