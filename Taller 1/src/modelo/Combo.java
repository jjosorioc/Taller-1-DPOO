package modelo;

import java.util.ArrayList;

public class Combo implements Producto
{
	// Atributos
	private double descuento;
	private String nombreCombo;
	
	private ArrayList<Producto> productosCombo = new ArrayList<>();
	
	private int precioSinDescuento; //TODO: Cambiar porcentaje a double
	
	
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
	public String generarTextoFactura()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public String getNombre()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
