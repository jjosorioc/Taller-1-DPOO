package consola;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import modelo.Ingrediente;
import modelo.Restaurante;

public class Aplicacion
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Restaurante startRestaurante = new Restaurante();
		
		String nuestroDirectory = System.getProperty("user.dir");
		
		// Carga de la información.
		startRestaurante.cargarInformacionRestaurante(new File(nuestroDirectory + "/data/ingredientes.txt"), null, null);
		

	}
	
	
	public void mostrarMenu()
	{
		//TODO;
	}
	
	
	public void ejecutarOpcion(int opcionSeleccionada)
	{
		//TODO
	}
}
