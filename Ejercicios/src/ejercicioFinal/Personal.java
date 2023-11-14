package ejercicioFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Personal {
	String nombre;
	String apellido;
	String legajo;
	int dni;
	public static ArrayList<Personal> listaPersonal = new ArrayList<Personal>();
	public static HashMap<Integer, String> diccDniLegajo = new HashMap<Integer, String>();
	public Personal(String nombre, String apellido, String legajo, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
    // Método para almacenar objetos tipo Personal en un ArrayList y un diccionario
    public static void almacenarPersonal( Personal empleado) {
    	listaPersonal.add(empleado);
        diccDniLegajo.put(empleado.getDni(), empleado.getLegajo());
    }
    
    // Método para obtener el legajo a partir del dni
    public static String obtenerLegajoPorDni( String dni) {
        return diccDniLegajo.get(dni);
    }
    // Método para obtener todos los datos del empleado a partir del legajo
    public static Personal obtenerEmpleadoPorLegajo(ArrayList<Personal> personalList, String legajo) {
        for (Personal empleado : personalList) {
            if (empleado.getLegajo().equals(legajo)) {
                return empleado;
            }
        }
        return null;
    	}
	}
