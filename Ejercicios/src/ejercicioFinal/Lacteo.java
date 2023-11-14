 package ejercicioFinal;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Lacteo extends Producto implements Fecha{
	//public static final DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static ArrayList<Lacteo> listaLacteo = new ArrayList<Lacteo>();
	public static LinkedList<Lacteo> filaLacteo = new LinkedList<Lacteo>();
	public static Scanner entrada = new Scanner(System.in);
 	private LocalDate fechaVencimiento;
 	private LocalDate fechaFabricacion;
 	
	public Lacteo(int codigoBarra, String codigoCategoria, String marca, String descripcion,float precio, 
			int stock,LocalDate fechaVencimiento, LocalDate fechaFabricacion) 
	{
		super(codigoBarra, codigoCategoria,  marca,  descripcion,  precio,  stock);
		setCategoriaProducto(CodigoInterno.LACTEO);
		setCodigoInt(CodigoInterno.LACTEO.getNumerador());
		this.fechaVencimiento = fechaVencimiento;
		this.fechaFabricacion = fechaFabricacion;
	}


	public String verTicket() 
	{
		return getMarca()+" / "+getDescripcion()+ " / "+ getPrecio();
	}

	public static void crearLacteo()
	{
		int codigo = Metodos.IngresarEntero("Codigo de barras");
		System.out.println("Ingrese codigo de Categoria (str): ");
		String categoria;
		categoria =	entrada.nextLine();//
		System.out.println("Ingrese marca: (str)");
		String marca =	entrada.nextLine();//
		System.out.println("Ingrese descripcion (str): ");
		String descripcion =	entrada.nextLine();//
		float precio = Metodos.IngresarFloat();
		int stock = Metodos.IngresarEntero("Stock");
		System.out.println("Ingrese datos de fabricacion: ");
		LocalDate fechaFabricacion = Metodos.formarFechaF();
		System.out.println("Ingrese datos de vencimiento: ");
		LocalDate fechaVencimiento = Metodos.formarFechaV();
		Lacteo elemento = new Lacteo(codigo, categoria, marca, descripcion, precio, stock, fechaVencimiento, fechaFabricacion);
		Producto.listaProducto.add(elemento);
		listaLacteo.add(elemento);
		filaLacteo.offer(elemento);
	}
	
    public static String obtenerDiferenciaEnDias(LocalDate fechaInicial)
    {
    	if(fechaInicial.isBefore(LocalDate.now())) {
    		return "vencido";
    	}
    	else if (ChronoUnit.DAYS.between(fechaInicial, LocalDate.now())>10){
        	return "Vigente";
        }else if (ChronoUnit.DAYS.between(fechaInicial, LocalDate.now())==10){
        	return "Vence hoy";
        }else {
			return "Pronto a Vencer";
        }
    }
    
    public static String mostrarFechas(Lacteo elemento) {
    	
    	return "La fecha de fabricacion es: " + elemento.getFechaFabricacion() + "La fecha de vencimiento es: " + elemento.getFechaVencimiento();
}


	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
}