package modelo;

import java.io.File;
import java.util.ArrayList;

public class Restaurante
{
	// Constructor
	public Restaurante()
	{
		super();
	}
	
	
	// Métodos
	public void iniciarPedido(String nombreCliente, String direccionCliente)
	{
		//TODO
	}
	
	
	public void cerrarYGuardarPedido()
	{
		//TODO
	}
	
	
	public Pedido getPedidoEnCurso()
	{
		return null; //TODO
	}
	
	
	public ArrayList<Producto> getMenuBase()
	{
		return null; //TODO
	}
	
	
	public ArrayList<Ingrediente> getIngredientes()
	{
		return null; //TODO
	}
	
	
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos)
	{
		//TODO
	}
	
	
	private void cargarIngredientes(File archivoIngredientes)
	{
		//TODO
	}
	
	
	private void cargarMenu(File archivoMenu)
	{
		//TODO
	}
	
	
	private void cargarCombos(File archivoCombos)
	{
		//TODO
	}
}
