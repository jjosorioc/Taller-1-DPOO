package modelo;

public class Ingrediente
{
	// Atributos
	private String nombre;
	
	private int costoAdicional;
	
	private int calorias;
	
	// Constructor
	
	public Ingrediente(String nombre, int costoAdicional, int calorias)
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
		this.calorias = calorias;
	}

	
	// Métodos
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public int getCostoAdicional()
	{
		return this.costoAdicional;
	}
	

}
