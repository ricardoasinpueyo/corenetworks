package Beans;

public class Pedido {

	private int idPedido;
	private String descripcion;
	private double importe;
	private boolean conIva;
	private Cliente cliente;


	public Pedido() {
	}		
	
	
	
	public Pedido(int idPedido, String descripcion, double importe, boolean conIva, Cliente cliente) {
		this.idPedido = idPedido;
		this.descripcion = descripcion;
		this.importe = importe;
		this.conIva = conIva;
		this.cliente = cliente;
	

	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public boolean isConIva() {
		return conIva;
	}

	public void setConIVA(boolean conIva) {
		this.conIva = conIva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", descripcion=" + descripcion + ", importe=" + importe + ", conIva="
				+ conIva + ", cliente=" + cliente + "]";
	}
	
		
	public double toalimporte(int Iva) {
		if(!conIva) /*el if siempre va con true por tanto lo niego*/
		return importe;
		else
			return importe * (1 + ((double)Iva/100));
										
		/*return 0; podemos poner cero para que devuelva algo y no hacer la formula del Iva*/
	}
	
	
	
	
	
	
	/* Esto lo hice yo pero no sirve:
	public static Pedido damePedido() {
		return new Pedido (1, "coches", 12.3, true, new Cliente("tomas", "tomas", "tomasin", "escu", "calle pez, 3, madrid"));
	}	
	
	
	public static Pedido[] damePedidos() {
		Pedido[]  Pedido = {
				new Pedido(1, "coches", 12.3, true, new Cliente("tomas", "tomas", "tomasin", "escu", "calle pez, 3, madrid")),
				new Pedido(2, "motos", 12.3, true, new Cliente("tomas", "tomas", "tomasin", "escu", "calle pez, 3, madrid"))
		};

				return Pedido;*/
				
				
		}
	
	
				
	
	
	


