package ejercicioPicante;

public class Regaleria extends Producto{
	private String materialFabricacion;
	private CodigoInterno codigoInterno;

	public Regaleria(String codigoBarra, String codigoCategoria, String marca, String descripcion,
			String precio, String stock, String materialFabricacion, CodigoInterno codigoInterno) {
		super(codigoBarra, codigoCategoria,  marca,  descripcion,  precio,  stock);
		this.materialFabricacion = materialFabricacion;
		setCategoriaProducto(CodigoInterno.REGALERIA);
		setCodigoInt(CodigoInterno.REGALERIA.getNumerador());
	}
	
	public String verTicket() {
		return getMarca()+" / "+getDescripcion()+ " / "+ getPrecio();
	}

}
