package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.negocio.Lista_libros;

public class MainLibro {
	private static String anio_publicacion;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Libreria libreria = new Libreria();
		System.out.println("Introduce el nombre de la Libreria :");
		libreria.setNombre(sc.nextLine());
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		libreria.setListaLibros(listaLibros);

		Lista_libros lb = new Lista_libros();
		lb.setLibreria(libreria);

		// Esta clase hace labores de vista, cuya funcion basicamente
		// es la de comunciarse con el cliente (entrada y salida de
		// información. Así como interacturar con la capa de modelo.negocio

		String opcion = "0";

		do {
			System.out.println("1- Alta de libro");
			System.out.println("2- lista de libros");
			System.out.println("3- Buscar libro por ISBN");
			System.out.println("4- Buscar por editorial");
			opcion = sc.nextLine();
			if (opcion.equals("1")) {
				System.out.println("Introduzca el titulo:");
				// nextLine coje toda la frase, next coje palabra
				String titulo = sc.nextLine();
				System.out.println("Introduzca el ISBN:");
				String ISBN = sc.nextLine();
				System.out.println("Introduzca la Editorial:");
				String editorial = sc.nextLine();
				System.out.println("Introduzca el Año de Publicación:");
				String sAnio_publicacion = sc.nextLine();

				/* convertir el string en entero */
				int anio_publicacion = Integer.parseInt(sAnio_publicacion);

				Libro libro = new Libro();
				libro.setAnio_publicacion(anio_publicacion);
				libro.setEditorial(editorial);
				libro.setISBN(ISBN);
				libro.setTitulo(titulo);

				boolean alta = lb.alta(libro);
				if (alta) {
					System.out.println("Libro introducido correctamente");
				} else {
					System.out.println("El libro tiene que tener ISBN y Titulo");
				}
			} else if (opcion.equals("2")) {
				for (Libro p : lb.getLibreria().getListaLibros()) {
					System.out.println(p);
				}
			} else if (opcion.equals("3")) {
				System.out.println("Introduce el ISBN");
				String ISBN = sc.nextLine();
				Libro p = lb.buscarPorISBN(ISBN);
				if (p == null) {
					System.out.println("No hay libro");
				} else {
					System.out.println(p);
				}
			} else if (opcion.equals("4")) {
				System.out.println("Introduzca la editorial");
				String editorial = sc.nextLine();
				
				ArrayList<Libro> lista = lb.buscarPorEditorial(editorial);
				if (lista.size() != 0) {
					System.out.println("La lista de libros en la editorial es:");
					for (Libro p : lista) {
						System.out.println(p);
					}
				} else {
					System.out.println("No hay libros de la editorial");
				}
			}
		} while (!opcion.equals("0"));
		System.out.println("Fin del programa");
	}

}
