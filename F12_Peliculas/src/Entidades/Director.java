package Entidades;

public class Director {

	private String director;
	private int edad;
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(String director, int edad) {
		super();
		this.director = director;
		this.edad = edad;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Director [director=" + director + ", edad=" + edad + "]";
	}
		
	
}
