package ejercicioFinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Regaleria extends Producto{
	public static ArrayList<Regaleria> listaRegaleria = new ArrayList<Regaleria>();
	public static Stack<Regaleria> pilaRegaleria = new Stack<Regaleria>();
	private String materialFabricacion;
	
	public Regaleria(int codigoBarra, String codigoCategoria, String marca, String descripcion,
			float precio, int stock, String materialFabricacion) 
	{
		super(codigoBarra, codigoCategoria,  marca,  descripcion,  precio,  stock);
		this.setMaterialFabricacion(materialFabricacion);
		setCategoriaProducto(CodigoInterno.REGALERIA);
		setCodigoInt(CodigoInterno.REGALERIA.getNumerador());
	}
	
	public static void crearRegaleria()
	{
		Scanner entrada = new Scanner(System.in);
		int codigo = Metodos.IngresarEntero("Codigo de barras");
		System.out.println("Ingrese codigo de Categoria (str):");
		String categoria =	entrada.nextLine();//
		System.out.println("Ingrese marca: (str)");
		String marca =	entrada.nextLine();//
		System.out.println("Ingrese descripcion (str): ");
		String descripcion =	entrada.nextLine();//
		float precio = Metodos.IngresarFloat();
		int stock = Metodos.IngresarEntero("Stock");
		System.out.println("Ingrese el material de fabricacion: ");
		String Material = entrada.nextLine();
		Regaleria elemento = new Regaleria(codigo, categoria, marca, descripcion, precio, stock, Material);
		listaRegaleria.add(elemento);
		Producto.listaProducto.add(elemento);
		pilaRegaleria.push(elemento);
	}
	
	public String verTicket(Regaleria s) 
	{
		return s.getMarca()+" / "+s.getDescripcion()+ " / "+ s.getPrecio();
	}

	public String getMaterialFabricacion() {
		return materialFabricacion;
	}

	public void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}

	@Override
	public String verTicket() {
		// TODO Auto-generated method stub
		return null;
	}

}
