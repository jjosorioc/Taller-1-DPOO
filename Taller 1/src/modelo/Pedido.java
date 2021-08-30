package modelo;

import java.io.File;

public class Pedido
{
	// Atributos
	

	private int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	//ARRAYLIST de productos
	
	// Constructor
	
	/**
	 * @param nombreCliente
	 * @param direccionCliente
	 */
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	
	
	// Métodos
	
	public int getIdPedido()
	{
		return this.idPedido;
	}
	
	
	public void agregarProducto(Producto nuevoItem)
	{
		// TODO
	}
	
	
	private int getPrecioNetoPedido()
	{
		return 0; //TODO
	}
	
	
	private int getPrecioTotalPedido()
	{
		return 0; //TODO
	}
	
	
	private int getPrecioIVAPedido()
	{
		return 0; //TODO
	}
	
	
	private String generarTextoFactura()
	{
		return null; //TODO
	}
	
	
	public void guardarFactura(File archivo)
	{
		//TODO
	}

}
