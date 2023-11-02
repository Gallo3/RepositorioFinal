package ejercicioPicante;

import java.util.ArrayList;

public abstract class Producto {
	private String codigoBarra;
	private String codigoCategoria;
	private String marca;
	private String descripcion;
	private String precio;
	private String stock;
	private CodigoInterno categoriaProducto;
	private int codigoInt;
	public CodigoInterno getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(CodigoInterno categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public int getCodigoInt() {
		return codigoInt;
	}

	public void setCodigoInt(int codigoInt) {
		this.codigoInt = codigoInt;
	}

	public Producto(String codigoBarra, String codigoCategoria, String marca, String descripcion, String precio, String stock) {
		this.codigoBarra = codigoBarra;
		this.codigoCategoria = codigoCategoria;
		this.marca = marca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(String codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public abstract String verTicket();
	
	public static ArrayList <Producto> listaProducto = new ArrayList<Producto>();
	
}
