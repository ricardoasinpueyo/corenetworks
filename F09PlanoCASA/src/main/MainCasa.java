package main;

import java.util.ArrayList;

import bean.Casa;
import bean.Direccion;
import bean.Habitacion;
import bean.Persona;

public class MainCasa {

	public static void main(String[] args) {
		Direccion direccionCasa = new Direccion();
		// introducir los datos
		direccionCasa.setCiudad("Madrid");
		direccionCasa.setCp("28000");
		direccionCasa.setNombreVia("castellana 32");
		direccionCasa.setTipoVia("Paseo");

		Direccion direccionPropietario = new Direccion();
		// introducir los datos
		// introducir los datos de la direccion del propietario
		// meter la direccion del propietario al propietario
		direccionPropietario.setCiudad("Madrid");
		direccionPropietario.setCp("28000");
		direccionPropietario.setNombreVia("castellana");
		direccionPropietario.setTipoVia("Paseo");

		Persona propietario = new Persona();
		// introducir datos empresario
		propietario.setNombre("Bud Spencer");
		propietario.setEdad(89);
		propietario.setPeso(120);
		propietario.setDireccion(direccionPropietario);

		Habitacion h1 = new Habitacion();
		h1.setTipoHab("dormitorio");
		h1.setM2(25);

		Habitacion h2 = new Habitacion();
		h2.setTipoHab("baño");
		h2.setM2(15);

		ArrayList<Habitacion> listadehabitaciones = new ArrayList<Habitacion>();
		listadehabitaciones.add(h1);
		listadehabitaciones.add(h2);

		Casa c1 = new Casa();
		c1.setListaHabitaciones(listadehabitaciones);
		c1.setPrecio(50);
		c1.setPropietario(propietario);
		c1.setDireccion(direccionCasa);

		System.out.println(c1);

	}

}
