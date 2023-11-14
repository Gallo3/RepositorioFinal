package EjercicioUML;

public class Docente extends Persona{
	private int matricula;
	public Docente (int id, int dni, String nombres, String apellido, String direccion, String telefono, int legajo) {
		super(id, dni, nombres, apellido, direccion, telefono);
	}
	public static void altaDocente() {
	}
	public static void modificarDocente() {}
}
