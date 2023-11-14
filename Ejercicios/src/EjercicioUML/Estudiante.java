package EjercicioUML;

public class Estudiante extends Persona{
	private int legajo;
	public Estudiante(int id, int dni, String nombres, String apellido, String direccion, String telefono, int legajo) {
		super(id, dni, nombres, apellido, direccion, telefono);
		this.legajo = legajo;
		setTipo(TipoPersona.ESTUDIANTE);
		setCodigoTipo(TipoPersona.ESTUDIANTE.getNumerador());
	}

}
