package MainPelicuas;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Director;
import Entidades.Pelicula;


public class Test_Peliculas {

	private static Pelicula pelicula;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Pelicula>listaPeliculas = new ArrayList<Pelicula>();
		int opcion = 0;
		
		do {
		System.out.println("1- Alta Pelicula");
		System.out.println("2- Listar pelicula");
		System.out.println("3- Buscar pelicula por titulo");
		System.out.println("0- Salir del programa");
				
		opcion = sc.nextInt();
		
		if (opcion ==1) {
			Pelicula pelicula = new Pelicula();
			System.out.println("El titulo es : ");
			pelicula.setTitulo(sc.next());
			System.out.println("Género : ");
			pelicula.setGenero(sc.next());	
		    System.out.println("Año de estreno : ");
		    pelicula.setAño_de_estreno(sc.nextInt());
		    
			System.out.println("Director : ");
		    Director director  = new Director();
			System.out.println("El nombre del director es : ");
			director.setDirector(sc.next());
		    System.out.println("La edad del director es : ");
            director.setEdad(sc.nextInt());
            
            pelicula.setDirector(director);    

            listaPeliculas.add(pelicula);
            
		} else if (opcion == 2) {
			for (Pelicula pelicula : listaPeliculas) {
				System.out.println(pelicula);
			}
		} else if (opcion == 3) {
				System.out.println("Dame el titulo de la pelicula");
				String titulo=sc.next();
				for (Pelicula pelicula : listaPeliculas) {
					String tituloEnLista = pelicula.getTitulo();
					if (tituloEnLista.contentEquals(titulo)) {
						System.out.println(pelicula);
					}
								}
		}
	} while (opcion != 0);
		System.out.println("Adios, gracias por usar nuestro programa");
		sc.close();		
			}

}
