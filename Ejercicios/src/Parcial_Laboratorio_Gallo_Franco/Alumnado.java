package Parcial_Laboratorio_Gallo_Franco;

public class Alumnado {

	public static void main(String[] args) {
		String nombre="PEPE";
		String apellido="JUAREZ";
		int calificacion = 10;
		Alumno pepe = new Alumno(nombre, apellido, calificacion);
		System.out.println("El apellido de pepe es: "+pepe.metodoGet() + " Y su calificacion es: "+pepe.calificacionGet());
	}
}
