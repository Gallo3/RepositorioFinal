package ejercicios;

import java.util.Scanner;

public class EjercicioTelefonosMuebles {
		Scanner entrada = new Scanner(System.in);
		Muebles arrayMuebles[] = new Muebles[10];
		Telefonos arrayTelefonos[] = new Telefonos[10];
	public void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);	
	do {
		menu();
	}while(menu()!=0);
		

	}
	private int menu() {
		System.out.println("Ingrese la opcion deseada:\n1)Alta mueble\n2)Alta telefono\n0)Salir.");
		int opcion = entrada.nextInt();
		switch (opcion){
		case 1:
			crearMueble();
			return 1;
		case 2:
			System.out.println("Ingrese su codigo");
			return 1;
		case 0:
			return 0;
		default:
			menu();
			return 1;
	}
	}
	private void crearMueble(){
		System.out.println("Ingrese su codigo");
		int codigo = entrada.nextInt();
		System.out.println("Ingrese su descripcion");
		String descripcion = entrada.nextLine();
		System.out.println("Ingrese su precio");
		double precio = entrada.nextDouble();
		System.out.println("Ingrese su ubicacion");
		int ubicacion = entrada.nextInt();
		System.out.println("Ingrese su stock");
		int stock = entrada.nextInt();
		System.out.println("Ingrese su color");
		String color = entrada.nextLine();
		System.out.println("Ingrese su material");
		String material = entrada.nextLine();
		System.out.println("Ingrese su alto");
		double alto = entrada.nextDouble();
		System.out.println("Ingrese su ancho");
		double ancho = entrada.nextDouble();
		System.out.println("Ingrese su espesor");
		double espesor = entrada.nextDouble();
	}
}
