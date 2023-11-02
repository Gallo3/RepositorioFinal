package ejercicios;

import java.util.Scanner;

public class Deposito {
	private String nombre;//atributo
	
	public Deposito()// Constructor por defecto
	{
		this.nombre = "sin ubicacion";
	}
	
	public Deposito(int numDep)  // Constructor con parametros
	{
		this.nombre = "Deposito N°" + numDep;
	}
	
	public void modificarDeposito()
	{
		System.out.println("Elegir deposito");
		Scanner entrada = new Scanner(System.in);
		int numDep;
		numDep = entrada.nextInt();
		this.nombre = "Deposito N° " + numDep;
	}
	
	public void modificarDepositoGlobal(int numDep)
	{
		this.nombre = "Deposito N° " + numDep;
	}
	
	public String devolverDeposito()
	{
		 return this.nombre;
	}
}
