package modelo.negocio;

import java.util.ArrayList;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class Lista_libros {
	private Libreria libreria;

	
	
	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	public boolean alta(Libro p) {
		if (p.getTitulo().length() > 0 && p.getISBN().length() > 0 && buscarPorISBN(p.getISBN()) == null) {
			libreria.getListaLibros().add(p);
			return true;
		} else {
			return false;
		}
	}

	public Libro buscarPorISBN(String ISBN) {
		for (Libro p : libreria.getListaLibros()) {
			if (p.getISBN().equals(ISBN)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<Libro> buscarPorEditorial(String Editorial) {
		ArrayList<Libro> listaLibrosBuscados = new ArrayList<Libro>();
		for (Libro p : libreria.getListaLibros()) {
			if (p.getEditorial().equals(Editorial)) {
				listaLibrosBuscados.add(p);
							}
		}
		return listaLibrosBuscados;
	
	}
}
