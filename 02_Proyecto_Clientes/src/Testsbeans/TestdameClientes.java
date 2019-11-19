package Testsbeans;

import Beans.Cliente;

public class TestdameClientes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente otroCliente = Cliente.dameCliente();
	    Cliente[] mis = Cliente.dameClientes();
	    for (Cliente ele: mis)
		System.out.println(ele.getNombre());
	}}
