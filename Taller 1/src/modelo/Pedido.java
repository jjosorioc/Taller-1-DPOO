package modelo;

import java.io.File;
import java.util.ArrayList;


public class Pedido
{
	// Atributos
	

	private static int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	private ArrayList<Producto> itemsPedido = new ArrayList<>();
	
	// Constructor
	
	/**
	 * @param nombreCliente
	 * @param direccionCliente
	 */
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		//TODO num random para el id
		// Cuando se crea una instancia, se suma 1 a numeroPedidos.
		Pedido.numeroPedidos ++;
	}
	
	
	// Métodos
	
	public int getIdPedido()
	{
		return this.idPedido;
	}
	
	
	public void agregarProducto(Producto nuevoItem)
	{
		this.itemsPedido.add(nuevoItem);
	}
	
	
	private int getPrecioNetoPedido()
	{
		// Sin IVA
		
		int precio = 0;
		
		for (Producto p : itemsPedido)
		{
			precio += p.getPrecio();
		}
		
		return precio;
	}
	
	
	private int getPrecioTotalPedido()
	{
		//Neto + IVA
		return this.getPrecioNetoPedido() + this.getPrecioIVAPedido();
	}
	
	
	private int getPrecioIVAPedido()
	{
		// Cuánto es el IVA
		return (int) (this.getPrecioNetoPedido() * 0.19);
	}
	
	
	public String generarTextoFactura() //TODO Volver PRIVATE
	{
		String facturaString = "";
		facturaString += "\nID: " + this.idPedido + " | Cliente: " + this.nombreCliente;
		
		for (Producto p: itemsPedido)
		{
			facturaString += "\n- " + p.generarTextoFactura();
		}
		
		facturaString += "\nPrecio Neto: " + this.getPrecioNetoPedido();
		facturaString += "\nPrecio IVA: " + this.getPrecioIVAPedido();
		facturaString += "\nPrecio Total: " + this.getPrecioTotalPedido();
		return facturaString;
	}
	
	
	public void guardarFactura(File archivo)
	{
		//TODO
	}

}
