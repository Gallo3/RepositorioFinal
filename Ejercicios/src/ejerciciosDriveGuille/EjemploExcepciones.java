package ejerciciosDriveGuille;

import java.util.*;
import java.io.*;

public class EjemploExcepciones {
	
	/*public static boolean esNumeroEntero(String cadena) {
        boolean flag;
        try {
            Integer.parseInt(cadena);
            flag = true;
        } 
        catch (NumberFormatException error) {
            flag = false;
        }
        return flag;
    }*/
	
	/*public static void metodo()
	{
		String auxiliar;
		System.out.println("Ingrese un numero entero: ");
		auxiliar = entrada.nextLine();
		
		while(EjemploExcepciones.esNumeroEntero(auxiliar) == false)
		{
			System.out.println("Vieja tenes que poner un numero, reintente: ");
			auxiliar = entrada.nextLine();
		}
		
		if (EjemploExcepciones.esNumeroEntero(auxiliar) == true)
		{
			numero = Integer.parseInt(auxiliar);
			System.out.println("Numero guardado correctamente.");
		}
		System.out.println("numero vale " + numero);
	}*/
	
	/*public static boolean verificarEdad(int edad)
	{
		boolean flag = true;
		if (edad < 1)
		{
			throw new IllegalArgumentException("Edad no puede ser 0 o negativo.");
		}
		if (edad < 18)
		{
			throw new IllegalArgumentException("Ud es menor de edad.");
		}
		if (edad > 70)
		{
			throw new IllegalArgumentException("El limite de edad para adquirir un credito es 70 años.");
		}
		return flag;
	}*/

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		//EXCEPCIONES DE TIPO RuntimeExcepcion
		//Division por 0
		
		/*double divisor, dividendo, resultado;
		System.out.println("Ingrese dividendo: ");
		dividendo = entrada.nextDouble();
		System.out.println("Ingrese divisor: ");
		divisor = entrada.nextDouble();
		resultado = dividendo/divisor;
		System.out.println(resultado);
		System.out.println("El programa continua");*/
		
		
		//Recorrer mal un arreglo
		
		/*int vector[] = new int [5];
		System.out.println("El programa comienza");
		for (int i=0; i<5; i++)
		{
			vector[i]=i+10;
		}
		System.out.println("El programa continua");*/
		
		
		//Almacenar una cadena en una variable numerica
		
		//int numero = 0;
		/*System.out.println("Ingrese solamente un numero y no otra cosa que no sea un numero");
		numero = entrada.nextInt();
		System.out.println("El numero es " + numero);*/
		
		
		//SOLUCION
		/*String auxiliar;
		System.out.println("Ingrese un numero entero: ");
		auxiliar = entrada.nextLine();//"150"
		while(EjemploExcepciones.esNumeroEntero(auxiliar) == false)
		{
			System.out.println("Vieja tenes que poner un numero, reintente: ");
			auxiliar = entrada.nextLine();
		}
		//llego aca
		if (EjemploExcepciones.esNumeroEntero(auxiliar) == true)
		{
			numero = Integer.parseInt(auxiliar);
			System.out.println("Numero guardado correctamente.");
		}
		System.out.println("numero vale " + numero);*/
		
		//LANZAR EXCEPCIONES EN FORMA MANUAL
		
		/*int numero = Integer.MAX_VALUE;
		//System.out.println(numero);
		//numero = Math.incrementExact(numero);
		//System.out.println(numero);
		
		System.out.println("Ingrese su edad");
		String edad = entrada.nextLine();
		while(EjemploExcepciones.esNumeroEntero(edad) == false)
		{
			System.out.println("Lo que ingreso no corresponde a una edad valida: ");
			edad = entrada.nextLine();
		}
		
		if (EjemploExcepciones.esNumeroEntero(edad) == true)
		{
			numero = Integer.parseInt(edad);
		}
		boolean bandera = true;
		try
		{
			if (verificarEdad(numero) == true)
			{
				System.out.println("Edad aprobada.");
			}
			bandera = true;
		}
		catch(IllegalArgumentException error)
		{
			bandera = false;
			System.out.println(error.getMessage());
		}
		finally
		{
			System.out.println("Este codigo se ejecuta si o si");
			if (bandera == true)
			{
				//continuar con la carga de datos
			}
			else
			{
				//volver al menu
			}
		}*/
		
		//CREAR  EXCECPCIONES PROPIAS
		//VER CLASE CrearUsuario
		
		
		
		
		
		
		//EXCEPCIONES DE TIPO IOException
		//lectura de archivo inexistente en una ubicacion especifica, o que cambió de nombre
		
		/*try
		{
			BufferedReader archivo = new BufferedReader (new FileReader ("C:\\Users\\Guille Gomez\\Desktop\\prueba.txt"));
			String texto;
			while ((texto = archivo.readLine()) != null)
			{
				System.out.println(texto);
			}
		}
		catch(IOException error)
		{
			System.out.println("el archivo no pudo ser encontrado/leido");
		}

		
		System.out.println("EL PROGRAMA CONTINUAA..");*/
		
		
		//creacion de archivos en rutas inexistentes
		//Archivo.crearArchivo();
		
	}

}

/*class Archivo
{
	public static void crearArchivo()
	{
		try
		{
			FileWriter archivo = new FileWriter(new File("C:\\Users\\Guille Gomez\\Desktop\\UTN\\prueba.txt"));
			BufferedWriter bw = new BufferedWriter(archivo);
	        bw.write("PUTO EL QUE LEE");
	        bw.close();
	        archivo.close();
		}
        catch (IOException error)
		{
        	System.out.println("Se ha producido un error: " + error.getMessage());
		}
		finally
		{
			System.out.println("Este codigo se va a ejectuar sin importar lo que pase.");
		}
	}
}*/


