package Testsbeans;

import Beans.Cliente;
import Beans.Pedido;

public class TestPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido ped1 =
				new Pedido(1, "tornillo 4-30", 1, true, Cliente.dameCliente());
			
		System.out.print("\rpedido : " + ped1.getIdPedido());
        System.out.print("\tdescripc : " + ped1.getDescripcion());
        System.out.println("\rcliente : " + ped1.getCliente().getNombre().toUpperCase());
    	/*\r = retorno de carro y \t = pone tabulador	 */
	}

}
