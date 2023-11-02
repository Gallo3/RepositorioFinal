package casaTelefonosMuebles;
import java.util.Scanner;

public class Telefonos extends EjerciciosArticulo{
	
		private String Marca;
		private String Modelo;
		private double Peso;
		
		public Telefonos()
		{
			super();
			this.Marca = "";
			this.Modelo = "";
			this.Peso = 0;
		}

		public Telefonos(int codigo, String descripcion, double precio, int ubicacion, int stock, String Marca, String Modelo, double Peso) //Constructor inicializado
		{ 
			super(codigo, descripcion, precio, ubicacion, stock);
			codigoModificado(actualizarCodigo());
			this.Marca = Marca;
			this.Modelo = Modelo;
			this.Peso = Peso;
		}

			private void modificarMarca()
			{
				Scanner entrada = new Scanner(System.in);
				System.out.println("Ingrese el nuevo marca: ");
				String marca = entrada.nextLine();
				this.Marca = " " + marca;
			}
			
			private void modificarModelo()
			{
				Scanner entrada = new Scanner(System.in);
				System.out.println("Ingrese el nuevo material: ");
				String modelo = entrada.nextLine();
				this.Modelo = " " + modelo;
			}
			
			public void modificarPeso()
			{
				double peso;
				Scanner entrada = new Scanner(System.in);
				do {
				System.out.println("Ingrese el nuevo peso: ");
				peso = entrada.nextDouble();
				this.Peso = peso;
				}while (peso >= 0);
			}
			private String actualizarCodigo()//Para agregar la T
			{
				return "T" + this.obtenerCodigo();
			}
			
			public void verDetalle()
			{
				super.verDetalle();
				this.verStockUbicacion();
				verDetalleTelefonos();
			}
			
			private void verDetalleTelefonos()
			{
				System.out.println("Marca: " + this.Marca);
				System.out.println("Modelo: " + this.Modelo);
				System.out.println("Medidas: "+ this.Peso + " Gramos "); 
			}
}
