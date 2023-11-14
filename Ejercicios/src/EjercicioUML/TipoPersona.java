package EjercicioUML;

public enum TipoPersona {
	ESTUDIANTE(1),DOCENTE(2),CLIENTE(3);
	private int numerador;
	
	private TipoPersona (int i) {
		this.numerador=i;
	}
	public int getNumerador() {
		return numerador;
	}
}
