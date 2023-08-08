package colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

	public static void main(String[] args) {
		Set<String> nombresSet= new HashSet<>();//Un set es un conjunto de registros que no permite duplicados.
		nombresSet.add("Juan");//Agrega un nombre a la lista.
		nombresSet.add("Clara");
		nombresSet.add("Pedro");
		nombresSet.add("Juan");
		nombresSet.add("Clara");
		nombresSet.remove("Pedro");//Elimina el nombre Pedro de la lista.
		nombresSet.clear();//Borra todo el conjunto.
		for(String nombre: nombresSet) {
			System.out.println(nombre);
		}
		if(nombresSet.contains("Roberto")) {//Verifica si en la lista hay algun Roberto.
			System.out.println("Hay un Roberto");
		} else {
			System.out.println("No existe ningun Roberto");
		}
	}

}
