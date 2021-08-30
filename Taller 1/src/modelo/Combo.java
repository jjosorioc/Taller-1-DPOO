package modelo;

public class Combo implements Producto
{
	// Atributos
	private double descuento;
	private String nombreCombo;
	
	
	// Constructor
	public Combo(String nombre, double descuento)
	{
		this.descuento = descuento;
		this.nombreCombo = nombre;
	}
	
	
	// Métodos
	public void agregarItemACombo(Producto itemCombo)
	{
		//TODO
	}
	

	@Override
	public int getPrecio()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarTextoFactura()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
