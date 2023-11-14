package EjercicioUML;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro {
	public static ArrayList<Libro> arrayLibro = new ArrayList<Libro>();
	private int idLibro;
	private int cantidadEjemplares;
	private LocalDate fecha;
	private Estado estadoPedido;
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public static void confirmarExistencia(int idLibro) {}
}
