package MainCoches;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Coche;

public class Test_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		int opcion = 0;

		do {
			System.out.println("1- Alta Coche");
			System.out.println("2- listar Coches");
			System.out.println("0- Salir del programa");

			opcion = sc.nextInt();

			if (opcion == 1) {
				Coche cocheNuevo = new Coche();
				System.out.println("dame la matricula : ");
				cocheNuevo.setMatricula(sc.next());
				System.out.println("dame la marca : ");
				cocheNuevo.setMarca(sc.next());
				System.out.println("dame el modelo : ");
				cocheNuevo.setModelo(sc.next());
				listaCoches.add(cocheNuevo);
			} else if (opcion == 2) {
				for (Coche coche : listaCoches) {
					System.out.println(coche);
				}
			}
		} while (opcion != 0);

		System.out.println("Adios, gracias por usar nuestro programa");
		sc.close();
	}

}
