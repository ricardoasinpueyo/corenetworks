package Entidades;

public class Pelicula {

	private String titulo;
	private String genero;
	private Director director;
	private int	a�o_de_estreno;
	
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(String titulo, String genero, Director director, int a�o_de_estreno) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.a�o_de_estreno = a�o_de_estreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public int getA�o_de_estreno() {
		return a�o_de_estreno;
	}

	public void setA�o_de_estreno(int a�o_de_estreno) {
		this.a�o_de_estreno = a�o_de_estreno;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", a�o_de_estreno="
				+ a�o_de_estreno + "]";
	}
	
		
	
	
	
}
