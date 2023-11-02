package casaTelefonosMuebles;
import java.util.Scanner;

public class EjercicioTelefonosMuebles {
private static int contMuebles = 0;	
	public static void main(String[] args) {	
	do {
	System.out.println("Bienvenido al menu principal");	
	}while(menu()!=0);
	Muebles.arrayMuebles[contMuebles].verDetalle();
	}
	
	private static int menu() 
	{	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la opcion deseada:\n1)Alta mueble\n2)Alta telefono\n0)Salir.");
		int opcion = entrada.nextInt();
		switch (opcion)
		{
		case 1:
			Muebles.crearMueble();
			return 1;
		case 2:
		//	Telefonos.crearTelefono();
			return 1;
		case 0:
			return 0;
		default:
			System.out.println("Valor invalido");
			return 1;
		}
	}
	
//int codigo, String descripcion, double precio, int ubicacion, int stock, String Material, String Color, double Alto, double Ancho, double Espesor
}
// 		Temas Programacion
//		POO introduccion q es, ventajas, 5 elementos fundamentales de la POO conocer y explicarlos,
//		Saber: q es una clase, q es un objeto, q es una instancia, q son atributos, metodos y estado

// 		Temas Laboratorio
//		Crear clases, modelarlas, hacer herencias, atributos, metodos y usarlo en el main.