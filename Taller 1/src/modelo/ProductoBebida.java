package modelo;

public class ProductoBebida implements Producto
{
	// Atributos
	private String nombre;
	private int precioBase;

	// Constructor
	public ProductoBebida(String nombre, int precioBase)
		{
			this.nombre = nombre;
			this.precioBase = precioBase;
		}

	@Override
	public int getPrecio()
	{
		return this.precioBase;
	}

	@Override
	public String getNombre()
	{
		return this.nombre;
	}

	@Override
	public String generarTextoFactura()
	{
		return ("$" + this.getPrecio() + " |" + this.getNombre());
	}

}
