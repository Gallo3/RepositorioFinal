package EjercicioUML;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
	public static ArrayList<Pedido> arrayPedidos = new ArrayList<Pedido>();
	private int idLibro;
	private Persona solicitante;
	private int cantidadEjemplares;
	private LocalDate fecha;
	private Estado estadoPedido;
	public Pedido() {
	}
	public static void confirmarExistencia(int idLibro) {}
}
