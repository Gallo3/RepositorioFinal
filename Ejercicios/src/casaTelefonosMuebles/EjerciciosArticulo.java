package casaTelefonosMuebles;

import java.util.Scanner;

public class EjerciciosArticulo 
{
	private String codigo;
	private String descripcion;
	private double precio;
	private Deposito ubicacion;//Objeto
	private int stock;
	
	public EjerciciosArticulo() //constructor
	{
		this.codigo = "sin codigo";
		this.descripcion = "sin descripcion";
		this.precio = 0;
		this.ubicacion = new Deposito(); //sin ubicacion
		this.stock = 0;
	}

	public EjerciciosArticulo(int codigo, String descripcion, double precio, int ubicacion, int stock)
	// Constructor recibe parametros para dar un estado inicial compreto al objeto
	{
	this.codigo = Integer.toString(codigo);
	this.descripcion = descripcion;
	this.precio = precio;
	this.ubicacion  = new Deposito (ubicacion);// Deposito N° + parametro
	this.stock = stock;
	}

	public void modificarCodigo()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cambiar codigo");
		int nombre = entrada.nextInt();
		this.codigo = " " + nombre;
	}
	
	public void modificarDescripcion()
	{
		String descripcion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese una descripcion");
		descripcion = entrada.nextLine();
		this.descripcion = descripcion;
	}
	
	public void modificarPrecio()
	{
		double nuevoPrecio;
		Scanner entrada = new Scanner(System.in);
		do
		{
			System.out.println("Ingrese un nuevo precio");
			nuevoPrecio = entrada.nextDouble();
		}while(nuevoPrecio <= 0);
		this.precio = nuevoPrecio;
	}
	
	public void subirPrecioGlobal(double porcentaje)
	{
		this.precio = this.precio + (this.precio * porcentaje / 100);
	}
	
	public void bajarPrecioGlobal(double porcentaje)
	{
		this.precio = this.precio - (this.precio * porcentaje / 100);
	}	
	
	public void modificarUbicacion()
	{
		this.ubicacion.modificarDeposito();
	}
	
	public void modificarUbicacionGlobal(int ubicacion)
	{
		this.ubicacion.modificarDepositoGlobal(ubicacion);
	}
	
	public void modificarStock()
	{
		int stock;
		Scanner entrada = new Scanner(System.in);
		do
		{
			System.out.println("Ingrese un nuevo stock ");
			stock = entrada.nextInt();
		}while (stock <= 0);
		this.stock = stock;
	}
	
	public void verDetalle()
	{
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Codigo: " + this.descripcion);
		System.out.println("Codigo: " + this.precio);
	}
	
	public void verStockUbicacion()
	{
		System.out.println("Stock: " + this.stock);
		System.out.println("Ubicacion: " + this.ubicacion.devolverDeposito());
	}
	
	public String obtenerCodigo()//Para que el resto de clases puedan acceder al codigo
	{
		return this.codigo;
	}
	
	protected void codigoModificado(String codigo)
	{
		this.codigo = codigo;
	}	
}
