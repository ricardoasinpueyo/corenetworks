package Beans;

import java.util.Arrays;

public class Cliente {
			
		        private String usuario, pasword, nombre, apellido, direccion;
				
												
		     
	
	public Cliente(String usuario, String pasword, String nombre, String apellido, String direccion) {
					super();
					this.usuario = usuario;
					this.pasword = pasword;
					this.nombre = nombre;
					this.apellido = apellido;
					this.direccion = direccion;
				}


	
	public Cliente() {
		super();
	}


	
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
	
	/* metodos*/
	
	
	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", pasword=" + pasword + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", direccion=" + direccion + ", getUsuario()=" + getUsuario() + ", getPasword()=" + getPasword()
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getDireccion()="
				+ getDireccion() + ", dameCliente()=" + dameCliente() + ", dameclientes()="
				+ Arrays.toString(dameClientes()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}



	public static Cliente dameCliente() {
		return new Cliente("tomas", "tomas", "tomasin", "escu", "calle pez, 3, madrid");
	
	}
	
	
	public static Cliente[] dameClientes() {
		Cliente[] clientes = {
				new Cliente("tomas", "tomas", "tomasin", "escu", "calle pez, 3,madrid"),
				new Cliente("sara", "sara", "sarita", "escu", "calle pez, 3, sevilla"),
				new Cliente("eva", "ruiz", "evita", "goma", "calle lirio, 35, cadiz"),
				new Cliente("ana", "ana", "anita", "lista", "calle rosa, 3, cuenca"),
		};
				return clientes;
				
		}
	}
			
			
	