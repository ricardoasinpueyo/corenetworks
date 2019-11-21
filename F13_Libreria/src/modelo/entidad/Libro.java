package modelo.entidad;

public class Libro {

	private String ISBN;
	private String titulo;
	private String editorial;
	private int anio_publicacion;
	public Object getISBN;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnio_publicacion() {
		return anio_publicacion;
	}
	public void setAnio_publicacion(int anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
	}
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", editorial=" + editorial + ", anio_publicacion="
				+ anio_publicacion + "]";
	}
}
	