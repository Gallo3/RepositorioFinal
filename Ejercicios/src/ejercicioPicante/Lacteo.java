 package ejercicioPicante;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.Scanner;

public class Lacteo extends Producto implements Fecha{
	//public static final DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static LinkedList<Lacteo> filaLacteo = new LinkedList<Lacteo>();
	public static Scanner entrada = new Scanner(System.in);
	private CodigoInterno codigoInterno;
 	private int dia;
 	private int mes;
 	private int anio;
 	private int dia2;
 	private int mes2;
 	private int anio2;
 	LocalDate fechaVencimiento;
 	LocalDate fechaFabricacion;
	public Lacteo(String codigoBarra, String codigoCategoria, String marca, String descripcion,String precio, 
			String stock, int dia,int mes, int anio,int dia2,int mes2, int anio2, CodigoInterno codigoInterno) {
		super(codigoBarra, codigoCategoria,  marca,  descripcion,  precio,  stock);
	this.codigoInterno = codigoInterno;
	this.fechaVencimiento = LocalDate.of(anio, mes, dia);
	this.fechaFabricacion = LocalDate.of(anio2, mes2, dia2);
	}

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}

	public String verTicket() {
		return getMarca()+" / "+getDescripcion()+ " / "+ getPrecio();
	}

	public static void crearLacteo(){
		System.out.println("Ingrese codigo de Barras (int): ");
		String codigo	=	entrada.nextLine();//
		System.out.println("Ingrese codigo de Categoria (str):");
		entrada.nextLine();
		String categoria =	entrada.nextLine();//
		System.out.println("Ingrese marca: (str)");
		String marca =	entrada.nextLine();//
		System.out.println("Ingrese descripcion (str): ");
		String descripcion =	entrada.nextLine();//
		System.out.println("Ingrese precio (dbl): ");
		String precio =	entrada.nextLine();//
		System.out.println("Ingrese stock (int): ");
		String stock =	entrada.nextLine();//
		System.out.print("Ingrese año de vencimiento: ");
		int anio = entrada.nextInt();
		System.out.print(" Mes: ");
		int mes = entrada.nextInt();
		System.out.println(" Dia: ");
		int dia = entrada.nextInt();//
		System.out.print("Ingrese año de Fabricacion: ");
		int anio2 = entrada.nextInt();
		System.out.print(" Mes: ");
		int mes2 = entrada.nextInt();
		System.out.println(" Dia: ");
		int dia2 = entrada.nextInt();//
		
		Lacteo elemento = new Lacteo(codigo, categoria, marca, descripcion, precio, stock, 
				dia, mes, anio, dia2, mes2, anio2, CodigoInterno.LACTEO);
		Producto.listaProducto.add(elemento);
		filaLacteo.offer(elemento);
	}
    public static long obtenerDiferenciaEnDias(LocalDate fechaInicial, LocalDate fechaFinal) {
        return ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    }
}
