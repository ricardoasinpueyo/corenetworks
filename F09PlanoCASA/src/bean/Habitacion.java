package bean;

public class Habitacion {
	
	private String tipoHab;
	private int m2;
	
	public Habitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Habitacion(String tipoHab, int m2) {
		super();
		this.tipoHab = tipoHab;
		this.m2 = m2;
	}

	public String getTipoHab() {
		return tipoHab;
	}

	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	@Override
	public String toString() {
		return "Habitacion [tipoHab=" + tipoHab + ", m2=" + m2 + "]";
	}
	
	
	
}
