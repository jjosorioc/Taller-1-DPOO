package modelo;

public class ProductoMenu implements Producto
{
	// Atributos
	private String nombre;
	private int precioBase;
	private int calorias;
	
	// Constructor
	public ProductoMenu(String nombre, int precioBase, int calorias)
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.calorias = calorias;
	}
	
	
	// Métodos
	@Override
	public String getNombre()
	{
		return this.nombre;
	}
	

	@Override
	public int getPrecio()
	{
		return this.precioBase;
	}


	@Override
	public String generarTextoFactura()
	{
		return ("$" + this.getPrecio() + " |" + this.getNombre());
	}


	@Override
	public int getCalorias()
	{
		return (this.calorias);
	}

}
