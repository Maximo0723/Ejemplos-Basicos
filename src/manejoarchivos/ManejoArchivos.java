package manejoarchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import registroalumnos.Alumno;

public class ManejoArchivos {

	public static void main(String[] args) throws Exception {

		String nombreArchivo = "C:\\Users\\Administrator\\Documents\\nombres.txt";
		String nombreArchivo2 = "C:\\Users\\Administrator\\Documents\\nombres1.txt";
		
		BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
		FileWriter manejador = new FileWriter(nombreArchivo2);
		String linea;
		while ((linea = lector.readLine()) != null) {
			System.out.println(linea);
			String[] datos= linea.split(",");
			String nombre= datos[0];
			int edad= Integer.parseInt(datos[1]);
			float promedio= Float.valueOf(datos[2]); 
			Alumno registro= new Alumno(nombre, edad, promedio);
			manejador.write(linea);
			registro.imprimirDatos();
		}
		/*try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
             FileWriter manejador = new FileWriter(nombreArchivo2)) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                manejador.write(linea + "\n"); // Agregar el salto de línea al escribir en el archivo
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al leer/escribir el archivo: " + e.getMessage());
        }*/
	}

}
