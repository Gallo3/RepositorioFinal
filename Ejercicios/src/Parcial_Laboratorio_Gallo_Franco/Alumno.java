package Parcial_Laboratorio_Gallo_Franco;

public class Alumno extends Persona{
	private int calificacion;
	public Alumno(String nombre, String apellido, int calificacion) {
		super(nombre, apellido);
		this.calificacion= calificacion;
	}
	
	public void calificacionSet(int calificacion) {
		this.calificacion= calificacion;
	}
	
	public int calificacionGet(){
		return this.calificacion;
	}
}
