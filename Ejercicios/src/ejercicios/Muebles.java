package ejercicios;

import java.util.Scanner;

public class Muebles extends EjerciciosArticulo{
	private String Material;
	private String Color;
	private double Alto;
	private double Ancho;
	private double Espesor;
	
	public Muebles()
	{
		super();
		this.Material = "";
		this.Color = "";
		this.Alto = 0;
		this.Ancho = 0;
		this.Espesor = 0;
	}

	public Muebles(int codigo, String descripcion, double precio, int ubicacion, int stock, String Material, String Color, double Alto, double Ancho, double Espesor) //Constructor inicializado
	{ 
		super(codigo, descripcion, precio, ubicacion, stock);
		codigoModificado(actualizarCodigo());
		this.Material = Material;
		this.Color = Color;
		this.Alto = Alto;
		this.Ancho = Ancho;
		this.Espesor = Espesor;	
	}
	
	public void modificarMaterial()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el nuevo material: ");
		String material = entrada.nextLine();
		this.Material = " " + material;
	}
	
	private String actualizarCodigo()//Para agregar la M
	{
		return "M" + this.obtenerCodigo();
	}
	
	public void modificarColor()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el nuevo color: ");
		String color = entrada.nextLine();
		this.Color = " " + color;
	}
	
	public void modificarMedidas() //Agregar Bucles para verificar >0
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el nuevo alto: ");
		double alto = entrada.nextDouble();
		System.out.println("Ingrese el nuevo ancho: ");
		double ancho = entrada.nextDouble();
		System.out.println("Ingrese el nuevo espesor: ");
		double espesor = entrada.nextDouble();
		this.Alto = alto;
		this.Ancho = ancho;
		this.Espesor = espesor;
	}
	
	public void verDetalle()
	{
		super.verDetalle();
		this.verStockUbicacion();
		this.verDetalleMuebles();
	}
	
	private void verDetalleMuebles()
	{
		System.out.println("Material: " + this.Material);
		System.out.println("Color: " + this.Color);
		System.out.println("Medidas:\nAncho: "+ this.Ancho + " Alto: " + this.Alto + " Espesor: " + this.Espesor); 
	}
	

}
