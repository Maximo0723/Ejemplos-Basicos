package registroalumnos;

public class Alumno {
	private String nombre;
	private int edad;
	private double promedio;
	
	public Alumno(String nombre, int edad, double promedio) {
		this.nombre= nombre;
		this.edad= edad;
		this.promedio= promedio;
	}

	public Alumno() {
		nombre= "Juan";
		edad= 35;
		promedio= 7.85;
	}
	
	public Alumno(int edad, double promedio) {
		nombre= "Pepe";
		edad= 15;
		promedio= 8.5;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public void imprimirDatos() {
		System.out.println(nombre + edad + promedio);
	}
}
