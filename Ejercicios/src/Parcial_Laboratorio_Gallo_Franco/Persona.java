package Parcial_Laboratorio_Gallo_Franco;

public class Persona {
	private String nombre;
	private String apellido;
	public Persona(String nombre, String apellido) {
		this.nombre =nombre;
		this.apellido = apellido;
	}
	public String metodoGet() {
		return this.apellido;
	}
	public void metodoSet(String apellido) {
		this.apellido = apellido;
	}

}
