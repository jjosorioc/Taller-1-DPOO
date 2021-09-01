package consola;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import modelo.Combo;
import modelo.Ingrediente;
import modelo.Producto;
import modelo.Restaurante;

public class Aplicacion
{

	private static Restaurante startRestaurante = new Restaurante();

	public static void main(String[] args) throws IOException
	{
		
		String nuestroDirectory = System.getProperty("user.dir");
		
		// Carga de la información.
		startRestaurante.cargarInformacionRestaurante((new File(nuestroDirectory + "/data/ingredientes.txt")), (new File(nuestroDirectory + "/data/menu.txt")), (new File(nuestroDirectory + "/data/combos.txt")));
		
		Aplicacion aplicacion = new Aplicacion();
		
		aplicacion.ejecutarOpcion();
		

	}
	
	
	public void mostrarMenu()
	{
		System.out.println("\nBienvenido al restaurante JJ burgers!");
		System.out.println("\n0. Iniciar un nuevo pedido.");
		System.out.println("\n1. Agregar un elemento a un pedido.");
		System.out.println("\n2. Cerrar un pedido y guardar la factura.");
		System.out.println("\n3. Consultar la información de un pedido dado su ID.\n");
		
	}
	
	
	public void ejecutarOpcion()
	{
		System.out.println("Iniciando programa...");
		
		boolean continuar = true;
		
		while (continuar) 
		{
			try 
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 0)
				{
					String nombreCliente = new String(input("\nIngrese su nombre"));
					String direccionClient = new String(input("\nIngrese su dirección"));
					startRestaurante.iniciarPedido(nombreCliente, direccionClient);
				}
				
				
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			
			}
		}
	}
	
	//Método para poder usar input()
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
}
