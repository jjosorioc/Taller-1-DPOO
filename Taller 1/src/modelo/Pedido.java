package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

public class Pedido
{
	// Atributos
	

	private static int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	private ArrayList<Producto> itemsPedido = new ArrayList<>();
	
	private static ArrayList<Integer> idsPedidos =  new ArrayList<>();
	
	// Constructor
	
	/**
	 * @param nombreCliente
	 * @param direccionCliente
	 */
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		
		
		Random rand = new Random();
		this.idPedido = rand.nextInt(1000000);
		
		while (Pedido.idsPedidos.contains(this.idPedido))
		{
			this.idPedido = rand.nextInt(1000000);
			Pedido.idsPedidos.add(this.idPedido);
		}
		
		
		
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
		facturaString += "\nID: " + this.idPedido + " | Cliente: " + this.nombreCliente + " | Dirección: " + this.direccionCliente; 
		
		int caloriasNetas = 0;
		
		for (Producto p: itemsPedido)
		{
			caloriasNetas += p.getCalorias();
			facturaString += "\n- " + p.generarTextoFactura();
		}
		
		facturaString += "\nCALORÍAS NETAS: " + caloriasNetas;
		facturaString += "\nPrecio Neto: " + this.getPrecioNetoPedido();
		facturaString += "\nPrecio IVA: " + this.getPrecioIVAPedido();
		facturaString += "\nPrecio Total: " + this.getPrecioTotalPedido();
		return facturaString;
	}
	
	
	public void guardarFactura(File archivo) throws IOException
	{
		if (archivo.createNewFile())
		{
			FileWriter myWriter = new FileWriter(archivo);
			myWriter.write(this.generarTextoFactura());
			myWriter.close();
		}
	}
	
	
	public boolean equals(ArrayList<Pedido> pedidos)
	{
//		String nuestroDirectory = System.getProperty("user.dir") + "/facturas";
//		File dirFile = new File(nuestroDirectory);
//		
//		for (File f: dirFile.listFiles())
//		{
//			f.createNewFile();
//			Reader targetReader = new FileReader(f);
//			
//			BufferedReader bReader = new BufferedReader(targetReader);
//			
//			String textoFileString = bReader.toString();
//			
//			if ((this.generarTextoFactura()).equals(textoFileString))
//			{
//				return true;
//			}
//			
//		}
//		return false;
		
		// Pedidos mientras la app haya corrido.
		
		for (Pedido p: pedidos)
		{
			if (this.itemsPedido.equals(p.itemsPedido))
			{
				return (true);
			}
		}
		
		return (false);
		
	}

}
