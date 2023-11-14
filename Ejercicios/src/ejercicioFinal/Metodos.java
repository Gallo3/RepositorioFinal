package ejercicioFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {
	//public static Scanner scanner = new Scanner(System.in);
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {System.out.println();
            System.out.println("MENU");
            System.out.println("1. Alta Productos");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1.");
                    subMenu();
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2.");
                   
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3.");
                 
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);
    }
        
    public static LocalDate formarFechaF() {
		boolean flag =false;
		LocalDate fechabien=null;
	    Scanner scanner = new Scanner(System.in);
        do {
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        
        if (Exepciones.verificarFecha(dia, mes, anio)) {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
            if(fecha.isBefore(LocalDate.now())) {
            System.out.println("La fecha formada es: " + fecha);
            fechabien = fecha;
            flag = true;
            }else {
            System.out.println("La fecha de Fabricacion no puede ser posterior a la actual");
            flag=false;
            }
        } else {
            System.out.println("Fecha ingresada no válida.");
            flag=false;
        }	
        }while (flag==false);
		return fechabien;
        }
   
    public static LocalDate formarFechaV() {
    		boolean flag =false;
    		LocalDate fechabien=null;
		    Scanner scanner = new Scanner(System.in);
	        do {
	        System.out.print("Ingrese el día: ");
	        int dia = scanner.nextInt();
	        System.out.print("Ingrese el mes: ");
	        int mes = scanner.nextInt();
	        System.out.print("Ingrese el año: ");
	        int anio = scanner.nextInt();
	        
	        if (Exepciones.verificarFecha(dia, mes, anio)) {
	            LocalDate fecha = LocalDate.of(anio, mes, dia);
	            if(fecha.isAfter(LocalDate.now())) {
	            System.out.println("La fecha formada es: " + fecha);
	            fechabien = fecha;
	            flag = true;
	            }else {
	            System.out.println("La fecha de vencimiento no puede ser anterior a la actual");
	            flag=false;
	            }
	        } else {
	            System.out.println("Fecha ingresada no válida.");
	            flag=false;
	        }	
	        }while (flag==false);
			return fechabien;
	
    }
    
    public static int IngresarEntero(String Nombre) {
	   boolean flag= false; 
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Ingrese " + Nombre + ": ");
	   while (flag==false) {
		   String valor = scanner.nextLine();
		   if(Exepciones.esEntero(valor)==true) {
			   return Integer.parseInt(valor);
		   }else{
			   System.out.println("Valor no admitido, Reingrese: ");
		   }
	   }
	   return 0;
   }
  
    public static float IngresarFloat() {
	   boolean flag= false; 
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Ingrese  precio: ");
	   while (flag==false) {
		   String valor = scanner.nextLine();
		   if(Exepciones.esFloat(valor)==true) {
			   System.out.println("Ingreso: " + Float.parseFloat(valor));
			   return Float.parseFloat(valor);
		   }else{
			   System.out.println("Valor no admitido, Reingrese: ");
		   }
	   }
	   return 0;
   }

    public static void subMenu() {
    	Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {System.out.println();
            System.out.println("SUB MENU PRODUCTOS");
            System.out.println("1. Alta Lacteo");
            System.out.println("2. Alta Regaleria");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
            	case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                case 1:
                    System.out.println("Ha seleccionado la opción 1.");
                    Lacteo.crearLacteo();
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2.");
                    Regaleria.crearRegaleria();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);
    }

    public static Producto buscarProducto(ArrayList<Producto> arrayProductos, int codigo) {
    	for(Producto producto : arrayProductos) {
    		if (producto.getCodigoBarra()==codigo) {
    			System.out.println("Producto encontrado");
    			return producto;
    		}
    	}
		return null;	
    }
    
    public static void guardarLacteoEnArchivo(ArrayList<Lacteo> Lacteos, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
        	for (Lacteo producto : Lacteos) 
        	{
                writer.write(producto.getCodigoBarra() + "," + producto.getCodigoCategoria() + "," + 
                producto.getMarca() + "," + producto.getDescripcion() + "," + producto.getPrecio()+ "," + 
                producto.getStock() + "," + producto.getFechaVencimiento() + "," + producto.getFechaFabricacion());
                writer.newLine(); 
            }
            System.out.println("Lacteos almacenados correctamente ");
           
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    
	public static void guardarRegaleriaEnArchivo(ArrayList<Regaleria> Regalerias, String nombreArchivo) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
	    	for (Regaleria producto : Regalerias) 
	    	{
	            writer.write(producto.getCodigoBarra() + "," + producto.getCodigoCategoria() + "," + 
	            producto.getMarca() + "," + producto.getDescripcion() + "," + producto.getPrecio()+ "," + 
	            producto.getStock() + "," + producto.getMaterialFabricacion());
	            writer.newLine(); 
	        }
	        System.out.println("Objetos de regaleria almacenados correctamente ");
	       
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    }
	
    public static List<Producto> cargarDesdeArchivo(String nombreArchivo) {
        List<Producto> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    int codigo = Integer.parseInt(partes[0]);
                    String codigoCategoria = partes[1];
                    productos.add(new Lacteo(edad, nombre, nombre, nombre, edad, edad, null, null));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }
}
