package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;

public class Restaurante
{
	// Atributos
	private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	private ArrayList<Producto> productos = new ArrayList<>();
	
	private Map<String, ArrayList<Producto>> combosMap = new HashMap<>();
	
	
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
		return this.productos;
	}
	
	
	public ArrayList<Ingrediente> getIngredientes()
	{
		return this.ingredientes;
	}
	
	
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) throws IOException
	{
		cargarIngredientes(archivoIngredientes);
	}
	
	
	private void cargarIngredientes(File archivoIngredientes) throws IOException 
	{
		//ingredientes.txt
		archivoIngredientes.createNewFile();
		Reader targetReader = new FileReader(archivoIngredientes);
		
		BufferedReader br = new BufferedReader(targetReader);
		
		String linea = br.readLine();
		
		while (linea != null)
		{
			// Separar los valores que estaban en una line.
			String[] parteStrings = linea.split(";");
			
			String nombreIngrediente = parteStrings[0];
			int precioIngrediente = Integer.parseInt(parteStrings[1]);
			
			Ingrediente nuevoIngrediente = new Ingrediente(nombreIngrediente, precioIngrediente);
			
			this.ingredientes.add(nuevoIngrediente);
			linea = br.readLine();
		}
		
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
