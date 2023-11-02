package ejercicios;
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

		public Telefonos(int codigo, String descripcion, double precio, int ubicacion, int stock,
				String Marca, String Modelo, double Peso) //Constructor inicializado
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
			
			static int contTelefonos = 0;
			static Telefonos arrayTelefonos[] = new Telefonos[10];
			public static void crearTelefonos(){
				 Scanner entrada = new Scanner(System.in);
				System.out.println("Ingrese su codigo");
				int codigo = entrada.nextInt();
				
				System.out.println("Ingrese su descripcion");
				entrada.nextLine();// como limpieza de buffer
				String descripcion = entrada.nextLine();
				
				System.out.println("Ingrese su precio");
				double precio = entrada.nextDouble();
				
				System.out.println("Ingrese su ubicacion");
				int ubicacion = entrada.nextInt();
				
				System.out.println("Ingrese su stock");
				int stock = entrada.nextInt();
				
				System.out.println("Ingrese su modelo");
				entrada.nextLine();
				String modelo = entrada.nextLine();
				
				System.out.println("Ingrese su marca");
				String marca = entrada.nextLine();

				System.out.println("Ingrese su peso");
				double peso = entrada.nextDouble();
				
				arrayTelefonos[contTelefonos] = new Telefonos(codigo, descripcion, precio, ubicacion, stock, marca, modelo, peso);
			}//int codigo, String descripcion, double precio, int ubicacion, int stock, String Marca, String Modelo, double Peso
}
