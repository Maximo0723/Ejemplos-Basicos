package comparadornumeros;

public class ComparadorNumeros {
	public void comparadorNumeros(int primerNumero, int segundoNumero) {
		if(primerNumero < segundoNumero) {
			System.out.println("numero2 es mayor que numero1");
		}
		if(primerNumero > segundoNumero) {
			System.out.println("numero1 es mayor que numero2");
		}
		if(primerNumero == segundoNumero) {
			System.out.println("numero1 y numero2 son iguales.");
		}
	}
}
