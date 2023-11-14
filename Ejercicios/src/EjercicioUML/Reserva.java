package EjercicioUML;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
	public static ArrayList<Reserva> arrayReserva = new ArrayList<Reserva>();
	private int idReserva;
	private int idPedido;
	private LocalDate fechaPedido;
	private LocalDate fechaRetiro;
	private LocalDate fechaDevolucion;
	private double importe;
	private FormasPago formaDePago;
	private Estado estadoReserva;
	public Reserva() {
		// TODO Auto-generated constructor stub
	}
	public static void pagarReserva(int idReserva) {}
	public static void estadoReserva(int idReserva) {}
}
