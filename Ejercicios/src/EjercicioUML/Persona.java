package EjercicioUML;

import java.util.ArrayList;

public class Persona {
	public static ArrayList<Persona> miArray = new ArrayList<Persona>();
	private int id;
	private int dni;
	private String nombres;
	private String apellido;
	private String direccion;
	private String telefono;
	private TipoPersona tipo;
	private int codigoTipo;
	
	public Persona(int id, int dni, String nombres, String apellido, String direccion, String telefono) {
		this.id = id;
		this.dni = dni;
		this.nombres = nombres;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public TipoPersona getTipo() {
		return tipo;
	}
	public void setTipo(TipoPersona tipo) {
		this.tipo = tipo;
	}
	public int getCodigoTipo() {
		return codigoTipo;
	}
	public void setCodigoTipo(int codigoTipo) {
		this.codigoTipo = codigoTipo;
	}
	public static void altaPersona() {
	};
	public static void modificarPersona() {
	};
	public static void buscarPersona() {	
	};
}
