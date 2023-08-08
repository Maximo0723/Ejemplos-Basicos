package registroalumnos;

public class Main {

	public static void main(String[] args) {
		Alumno alumno1= new Alumno("Pablo", 14, 9.8);
		Alumno alumno2= new Alumno(13, 5.5);
		Alumno alumno3= new Alumno();
		System.out.println("alumno 1 nombre: " + alumno1.getNombre() + " edad: " + alumno1.getEdad() + " promedio: " + alumno1.getPromedio());
		System.out.println("alumno 2 nombre: " + alumno2.getNombre() + " edad: " + alumno2.getEdad() + " promedio: " + alumno2.getPromedio());
		System.out.println("alumno 3 nombre: " + alumno3.getNombre() + " edad: " + alumno3.getEdad() + " promedio: " + alumno3.getPromedio());
	}

}
