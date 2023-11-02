package ejerciciosUnidad3;

public class EjerciciosPilasFilas {
	private String codigo;
	private String marca;
	private String modelo;
	private String color;
	private String motor;
	
	public EjerciciosPilasFilas(String codigo, String marca, String modelo, String color, String motor) {
	this.codigo = codigo;
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.motor = motor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public String mostrarTodo() {
		return getMarca()+" / "+getModelo()+" / "+getColor()+" / "+getMotor();
	}
}
