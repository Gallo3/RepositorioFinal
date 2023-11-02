package ejerciciosUnidad3;

public enum EjercicioEnum {//Dias de la Semana
	LUNES(1, "DANILA, PELUCA"), MARTES(2, "GUILLE"), MIERCOLES(3, "INGLES Y ESTADISTICA")
	, JUEVES(4, "GUILLE"), VIERNES(5,"CARO Y PELUCA"), SABADO(6,"NADA"), DOMINGO(7,"NADISIMA");

	private int diasem;
	private String comentario;
	EjercicioEnum(int i, String string) {
		this.diasem = i;
		this.comentario = string;
	}

	

}

class calendario {
	
}